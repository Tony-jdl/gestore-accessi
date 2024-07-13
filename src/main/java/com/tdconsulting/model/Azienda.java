package com.tdconsulting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class Azienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iDAzienda;
    private String nomeAzienda;
    private String partitaIva;
    private String regioneSociale;
    private String descrizione;
    private Integer idUtenteInseritore;
    private boolean valido;
    private Date dataInserimento;
    private Date dataInizioValidita;
    private Date dataFineValidita;

    public Integer getiDAzienda() {
        return iDAzienda;
    }

    public void setiDAzienda(Integer iDAzienda) {
        this.iDAzienda = iDAzienda;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public String getRegioneSociale() {
        return regioneSociale;
    }

    public void setRegioneSociale(String regioneSociale) {
        this.regioneSociale = regioneSociale;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Integer getIdUtenteInseritore() {
        return idUtenteInseritore;
    }

    public void setIdUtenteInseritore(Integer idUtenteInseritore) {
        this.idUtenteInseritore = idUtenteInseritore;
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
        if (!(o instanceof Azienda azienda)) return false;
        return valido == azienda.valido && Objects.equals(iDAzienda, azienda.iDAzienda) && Objects.equals(nomeAzienda, azienda.nomeAzienda) && Objects.equals(partitaIva, azienda.partitaIva) && Objects.equals(regioneSociale, azienda.regioneSociale) && Objects.equals(descrizione, azienda.descrizione) && Objects.equals(idUtenteInseritore, azienda.idUtenteInseritore) && Objects.equals(dataInserimento, azienda.dataInserimento) && Objects.equals(dataInizioValidita, azienda.dataInizioValidita) && Objects.equals(dataFineValidita, azienda.dataFineValidita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iDAzienda, nomeAzienda, partitaIva, regioneSociale, descrizione, idUtenteInseritore, valido, dataInserimento, dataInizioValidita, dataFineValidita);
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "iDAzienda=" + iDAzienda +
                ", nomeAzienda='" + nomeAzienda + '\'' +
                ", partitaIva='" + partitaIva + '\'' +
                ", regioneSociale='" + regioneSociale + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", idUtenteInseritore=" + idUtenteInseritore +
                ", valido=" + valido +
                ", dataInserimento=" + dataInserimento +
                ", dataInizioValidita=" + dataInizioValidita +
                ", dataFineValidita=" + dataFineValidita +
                '}';
    }
}
