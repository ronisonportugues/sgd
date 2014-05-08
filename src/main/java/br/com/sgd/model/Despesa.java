/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sgd.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ronison
 */
@Entity
@Table(name = "despesa")
@XmlRootElement
public class Despesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    
    @Basic(optional = false)
    @Column(name = "dataRealizacao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataRealizacao;
 
    @Basic(optional = false)
    @Column(name = "valorTotal", nullable = false)
    private double valorTotal;
 
    @JoinColumn(name = "idPrestador", referencedColumnName = "id")
    @ManyToOne
    private Prestador idPrestador;
   
    @JoinColumn(name = "idParcelamento", referencedColumnName = "id")
    @ManyToOne
    private Parcelamento idParcelamento;
   
    @JoinColumn(name = "idPagamento", referencedColumnName = "id")
    @ManyToOne
    private Pagamento idPagamento;
    
    @JoinColumn(name = "idItemCategoria", referencedColumnName = "id")
    @ManyToOne
    private ItemCategoria idItemCategoria;
    
    @OneToMany(mappedBy = "idDespesa")
    private List<ItemDespesa> itemDespesaList;

    public Despesa() {
    }

    public Despesa(Integer id) {
        this.id = id;
    }

    public Despesa(Integer id, Date dataRealizacao, double valorTotal) {
        this.id = id;
        this.dataRealizacao = dataRealizacao;
        this.valorTotal = valorTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Prestador getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(Prestador idPrestador) {
        this.idPrestador = idPrestador;
    }

    public Parcelamento getIdParcelamento() {
        return idParcelamento;
    }

    public void setIdParcelamento(Parcelamento idParcelamento) {
        this.idParcelamento = idParcelamento;
    }

    public Pagamento getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Pagamento idPagamento) {
        this.idPagamento = idPagamento;
    }

    public ItemCategoria getIdItemCategoria() {
        return idItemCategoria;
    }

    public void setIdItemCategoria(ItemCategoria idItemCategoria) {
        this.idItemCategoria = idItemCategoria;
    }

    @XmlTransient
    public List<ItemDespesa> getItemDespesaList() {
        return itemDespesaList;
    }

    public void setItemDespesaList(List<ItemDespesa> itemDespesaList) {
        this.itemDespesaList = itemDespesaList;
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
        if (!(object instanceof Despesa)) {
            return false;
        }
        Despesa other = (Despesa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.teste.gerar.Despesa[ id=" + id + " ]";
    }
    
}
