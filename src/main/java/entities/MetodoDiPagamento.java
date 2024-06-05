package entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class MetodoDiPagamento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "tipologia", nullable = false, length = -1)
    private String tipologia;
    @Basic
    @Column(name = "limiteTransazione", nullable = false)
    private int limiteTransazione;
    @Basic
    @Column(name = "cfUtente", nullable = false, length = -1)
    private String cfUtente;
    @ManyToOne
    @JoinColumn(name = "cfUtente", referencedColumnName = "cf", nullable = false)
    private Passeggero passeggeriByCfUtente;



}
