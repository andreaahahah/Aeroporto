package controller;

import entities.Passeggero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.PasseggeroRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("api/passeggero")
public class PasseggeroController {

    @Autowired
    private PasseggeroRepository passeggeroRepository;

    @GetMapping
    public ResponseEntity<Passeggero> getPasseggeroByEmailAndPassword(String email, String password){
        Optional<Passeggero> passeggero = passeggeroRepository.findByEmailAndPassword(email, password);
        return passeggero.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
