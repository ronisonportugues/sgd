/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sgd.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ronison
 */
@Entity
@Table(name = "formaPagamento")
@XmlRootElement
public class FormaPagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tipoFormaPagamento", nullable = false)
    private int tipoFormaPagamento;
    @OneToMany(mappedBy = "idFormaPagamento")
    private List<Pagamento> pagamentoList;

    public FormaPagamento() {
    }

    public FormaPagamento(Integer id) {
        this.id = id;
    }

    public FormaPagamento(Integer id, int tipoFormaPagamento) {
        this.id = id;
        this.tipoFormaPagamento = tipoFormaPagamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTipoFormaPagamento() {
        return tipoFormaPagamento;
    }

    public void setTipoFormaPagamento(int tipoFormaPagamento) {
        this.tipoFormaPagamento = tipoFormaPagamento;
    }

    @XmlTransient
    public List<Pagamento> getPagamentoList() {
        return pagamentoList;
    }

    public void setPagamentoList(List<Pagamento> pagamentoList) {
        this.pagamentoList = pagamentoList;
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
        if (!(object instanceof FormaPagamento)) {
            return false;
        }
        FormaPagamento other = (FormaPagamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.teste.gerar.FormaPagamento[ id=" + id + " ]";
    }
    
}
