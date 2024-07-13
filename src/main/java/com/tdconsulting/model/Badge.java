package com.tdconsulting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class Badge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBadge;
    private Integer idUtente;
    private boolean valido;
    private Date dataInserimento;
    private Date dataAggiornamento;
    private Date dataInizioValidita;
    private Date dataFineValidita;

    public Integer getIdBadge() {
        return idBadge;
    }

    public void setIdBadge(Integer idBadge) {
        this.idBadge = idBadge;
    }

    public Integer getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(Integer idUtente) {
        this.idUtente = idUtente;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public Date getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(Date dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public Date getDataAggiornamento() {
        return dataAggiornamento;
    }

    public void setDataAggiornamento(Date dataAggiornamento) {
        this.dataAggiornamento = dataAggiornamento;
    }

    public Date getDataInizioValidita() {
        return dataInizioValidita;
    }

    public void setDataInizioValidita(Date dataInizioValidita) {
        this.dataInizioValidita = dataInizioValidita;
    }

    public Date getDataFineValidita() {
        return dataFineValidita;
    }

    public void setDataFineValidita(Date dataFineValidita) {
        this.dataFineValidita = dataFineValidita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Badge badge)) return false;
        return valido == badge.valido && Objects.equals(idBadge, badge.idBadge) && Objects.equals(idUtente, badge.idUtente) && Objects.equals(dataInserimento, badge.dataInserimento) && Objects.equals(dataAggiornamento, badge.dataAggiornamento) && Objects.equals(dataInizioValidita, badge.dataInizioValidita) && Objects.equals(dataFineValidita, badge.dataFineValidita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBadge, idUtente, valido, dataInserimento, dataAggiornamento, dataInizioValidita, dataFineValidita);
    }

    @Override
    public String toString() {
        return "Badge{" +
                "idBadge=" + idBadge +
                ", idUtente=" + idUtente +
                ", valido=" + valido +
                ", dataInserimento=" + dataInserimento +
                ", dataAggiornamento=" + dataAggiornamento +
                ", dataInizioValidita=" + dataInizioValidita +
                ", dataFineValidita=" + dataFineValidita +
                '}';
    }
}
