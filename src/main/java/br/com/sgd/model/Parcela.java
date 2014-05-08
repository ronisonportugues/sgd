/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sgd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ronison
 */
@Entity
@Table(name = "parcela")
@XmlRootElement
public class Parcela implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numero", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer numero;
    @Column(name = "dataVencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @Basic(optional = false)
    @Column(name = "valorParcela", nullable = false)
    private double valorParcela;
    @JoinColumn(name = "idParcelamento", referencedColumnName = "id")
    @ManyToOne
    private Parcelamento idParcelamento;

    public Parcela() {
    }

    public Parcela(Integer numero) {
        this.numero = numero;
    }

    public Parcela(Integer numero, double valorParcela) {
        this.numero = numero;
        this.valorParcela = valorParcela;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Parcelamento getIdParcelamento() {
        return idParcelamento;
    }

    public void setIdParcelamento(Parcelamento idParcelamento) {
        this.idParcelamento = idParcelamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcela)) {
            return false;
        }
        Parcela other = (Parcela) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.teste.gerar.Parcela[ numero=" + numero + " ]";
    }
    
}
