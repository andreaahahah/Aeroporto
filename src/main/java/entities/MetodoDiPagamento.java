package entities;

import jakarta.persistence.*;

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
    private Passeggeri passeggeriByCfUtente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public int getLimiteTransazione() {
        return limiteTransazione;
    }

    public void setLimiteTransazione(int limiteTransazione) {
        this.limiteTransazione = limiteTransazione;
    }

    public String getCfUtente() {
        return cfUtente;
    }

    public void setCfUtente(String cfUtente) {
        this.cfUtente = cfUtente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetodoDiPagamento that = (MetodoDiPagamento) o;

        if (id != that.id) return false;
        if (limiteTransazione != that.limiteTransazione) return false;
        if (tipologia != null ? !tipologia.equals(that.tipologia) : that.tipologia != null) return false;
        if (cfUtente != null ? !cfUtente.equals(that.cfUtente) : that.cfUtente != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tipologia != null ? tipologia.hashCode() : 0);
        result = 31 * result + limiteTransazione;
        result = 31 * result + (cfUtente != null ? cfUtente.hashCode() : 0);
        return result;
    }

    public Passeggeri getPasseggeriByCfUtente() {
        return passeggeriByCfUtente;
    }

    public void setPasseggeriByCfUtente(Passeggeri passeggeriByCfUtente) {
        this.passeggeriByCfUtente = passeggeriByCfUtente;
    }
}
