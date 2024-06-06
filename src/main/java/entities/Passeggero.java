package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.List;

@Data
@Entity
public class Passeggero {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cf", nullable = false, length = -1)
    private String cf;
    @Basic
    @Column(name = "nome", nullable = false, length = -1)
    private String nome;
    @Basic
    @Column(name = "cognome", nullable = false, length = -1)
    private String cognome;
    @Basic
    @Column(name = "email", nullable = false, length = -1)
    private String email;
    @Basic
    @Column(name = "password", nullable = false)
    private String password;

    //private Collection<MetodoDiPagamento> metodoDiPagamentosByCf;
    @OneToMany(mappedBy = "passeggeriByCfUtente")
    private List<MetodoDiPagamento> metodoDiPagamentosByCf;
}
