package controller;

import entities.MetodoDiPagamento;
import entities.Passeggero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repositories.PasseggeroRepository;

import javax.swing.text.html.Option;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Optional;

@RestController
@RequestMapping("/api/passeggeri")
public class PasseggeroController {

    @Autowired
    private PasseggeroRepository passeggeroRepository;

    @GetMapping
    public ResponseEntity<Passeggero> getPasseggeroByEmailAndPassword(String email, String password){
        Optional<Passeggero> passeggero = passeggeroRepository.findByEmailAndPassword(email, password);
        return passeggero.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<?> createPasseggero(
            @RequestParam String cf,
            @RequestParam String nome,
            @RequestParam String cognome,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam int numero,
            @RequestParam String tipo,
            @RequestParam int limite){

        Optional<Passeggero> existingPasseggero = passeggeroRepository.findByEmailAndPassword(email,password);
        if (existingPasseggero.isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Passeggero con questo CF esiste già");
        }

        Passeggero p = new Passeggero();
        p.setCf(cf);
        p.setNome(nome);
        p.setCognome(cognome);
        p.setEmail(email);
        p.setPassword(password);
        MetodoDiPagamento m = new MetodoDiPagamento();
        m.setNumeroCarta(numero);
        m.setTipologia(tipo);
        m.setLimiteTransazione(limite);
        m.setCfUtente(p);
        LinkedList<MetodoDiPagamento> metodi = new LinkedList<>();
        metodi.add(m);
        p.setMetodoDiPagamentosByCf(metodi);
        Passeggero savedPasseggero = passeggeroRepository.save(p);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPasseggero);
    }
}
