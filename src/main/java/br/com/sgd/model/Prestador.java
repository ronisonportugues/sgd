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
@Table(name = "prestador")
@XmlRootElement
public class Prestador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cpfCnpj", nullable = false, length = 1)
    private String cpfCnpj;
    @Column(name = "nome", length = 1)
    private String nome;
    @Column(name = "telefone", length = 1)
    private String telefone;
    @OneToMany(mappedBy = "idPrestador")
    private List<Despesa> despesaList;

    public Prestador() {
    }

    public Prestador(Integer id) {
        this.id = id;
    }

    public Prestador(Integer id, String cpfCnpj) {
        this.id = id;
        this.cpfCnpj = cpfCnpj;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @XmlTransient
    public List<Despesa> getDespesaList() {
        return despesaList;
    }

    public void setDespesaList(List<Despesa> despesaList) {
        this.despesaList = despesaList;
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
        if (!(object instanceof Prestador)) {
            return false;
        }
        Prestador other = (Prestador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.teste.gerar.Prestador[ id=" + id + " ]";
    }
    
}
