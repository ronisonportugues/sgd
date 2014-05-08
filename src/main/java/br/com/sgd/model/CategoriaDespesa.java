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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ronison
 */
@Entity
@Table(name = "categoriaDespesa",schema="despesa")
@XmlRootElement
public class CategoriaDespesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descricao", nullable = false)
    private String descricao;
    @OneToMany(mappedBy = "idCategoria")
    private List<ItemCategoria> itemCategoriaList;

    public CategoriaDespesa() {
    }

    public CategoriaDespesa(Integer id) {
        this.id = id;
    }

    public CategoriaDespesa(Integer id, String descricao) {
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
    public List<ItemCategoria> getItemCategoriaList() {
        return itemCategoriaList;
    }

    public void setItemCategoriaList(List<ItemCategoria> itemCategoriaList) {
        this.itemCategoriaList = itemCategoriaList;
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
        if (!(object instanceof CategoriaDespesa)) {
            return false;
        }
        CategoriaDespesa other = (CategoriaDespesa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.teste.gerar.CategoriaDespesa[ id=" + id + " ]";
    }
    
}
