/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sgd.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ronison
 */
@Entity
@Table(name = "itemDespesa")
@XmlRootElement
public class ItemDespesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "valorUnitario", nullable = false)
    private double valorUnitario;
    @Basic(optional = false)
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    
    @JoinColumn(name = "idDespesa", referencedColumnName = "id")
    @ManyToOne
    private Despesa idDespesa;

    public ItemDespesa() {
    }

    public ItemDespesa(Integer id) {
        this.id = id;
    }

    public ItemDespesa(Integer id, double valorUnitario, int quantidade) {
        this.id = id;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Despesa getIdDespesa() {
        return idDespesa;
    }

    public void setIdDespesa(Despesa idDespesa) {
        this.idDespesa = idDespesa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemDespesa)) {
            return false;
        }
        ItemDespesa other = (ItemDespesa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.teste.gerar.ItemDespesa[ id=" + id + " ]";
    }
    
}
