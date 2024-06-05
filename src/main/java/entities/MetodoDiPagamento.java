package entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class MetodoDiPagamento {
    @Id
    @Column(name = "numeroCarta", nullable = false)
    private int numeroCarta;
    @Basic
    @Column(name = "tipologia", nullable = false, length = -1)
    private String tipologia;
    @Basic
    @Column(name = "limiteTransazione", nullable = false)
    private int limiteTransazione;
    @ManyToOne
    @JoinColumn(name = "cfUtente", referencedColumnName = "cf", nullable = false)
    private Passeggero cfUtente;



}
