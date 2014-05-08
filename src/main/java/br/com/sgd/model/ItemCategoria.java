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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "itemCategoria")
@XmlRootElement
public class ItemCategoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descricao", nullable = false, length = 1)
    private String descricao;
    @OneToMany(mappedBy = "idItemCategoria")
    private List<Despesa> despesaList;
    @JoinColumn(name = "idCategoria", referencedColumnName = "id")
    @ManyToOne
    private CategoriaDespesa idCategoria;

    public ItemCategoria() {
    }

    public ItemCategoria(Integer id) {
        this.id = id;
    }

    public ItemCategoria(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Despesa> getDespesaList() {
        return despesaList;
    }

    public void setDespesaList(List<Despesa> despesaList) {
        this.despesaList = despesaList;
    }

    public CategoriaDespesa getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CategoriaDespesa idCategoria) {
        this.idCategoria = idCategoria;
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
        if (!(object instanceof ItemCategoria)) {
            return false;
        }
        ItemCategoria other = (ItemCategoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.teste.gerar.ItemCategoria[ id=" + id + " ]";
    }
    
}
