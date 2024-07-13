package com.tdconsulting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUtente;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private Integer idAzienda;
    private Integer idUtenteInseritore;
    private Integer idUtenteUltimoAggiornamento;
    private boolean attivo;
    private Date dataInserimento;
    private Date dataAggiornamento;
    private Date dataAssunzione;
    private Date dataDimissioni;

    public Date getDataDimissioni() {
        return dataDimissioni;
    }

    public void setDataDimissioni(Date dataDimissioni) {
        this.dataDimissioni = dataDimissioni;
    }

    public Date getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(Date dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public Date getDataAggiornamento() {
        return dataAggiornamento;
    }

    public void setDataAggiornamento(Date dataAggiornamento) {
        this.dataAggiornamento = dataAggiornamento;
    }

    public Date getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(Date dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    public Integer getIdUtenteUltimoAggiornamento() {
        return idUtenteUltimoAggiornamento;
    }

    public void setIdUtenteUltimoAggiornamento(Integer idUtenteUltimoAggiornamento) {
        this.idUtenteUltimoAggiornamento = idUtenteUltimoAggiornamento;
    }

    public Integer getIdUtenteInseritore() {
        return idUtenteInseritore;
    }

    public void setIdUtenteInseritore(Integer idUtenteInseritore) {
        this.idUtenteInseritore = idUtenteInseritore;
    }

    public Integer getIdAzienda() {
        return idAzienda;
    }

    public void setIdAzienda(Integer idAzienda) {
        this.idAzienda = idAzienda;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(Integer idUtente) {
        this.idUtente = idUtente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utente utente)) return false;
        return attivo == utente.attivo && Objects.equals(idUtente, utente.idUtente) && Objects.equals(nome, utente.nome) && Objects.equals(cognome, utente.cognome) && Objects.equals(codiceFiscale, utente.codiceFiscale) && Objects.equals(idAzienda, utente.idAzienda) && Objects.equals(idUtenteInseritore, utente.idUtenteInseritore) && Objects.equals(idUtenteUltimoAggiornamento, utente.idUtenteUltimoAggiornamento) && Objects.equals(dataInserimento, utente.dataInserimento) && Objects.equals(dataAggiornamento, utente.dataAggiornamento) && Objects.equals(dataAssunzione, utente.dataAssunzione) && Objects.equals(dataDimissioni, utente.dataDimissioni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUtente, nome, cognome, codiceFiscale, idAzienda, idUtenteInseritore, idUtenteUltimoAggiornamento, attivo, dataInserimento, dataAggiornamento, dataAssunzione, dataDimissioni);
    }
}
