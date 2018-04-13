/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oziomek.warehouse.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oziomek
 */
@Entity
@Table(name = "ALLEY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alley.findAll", query = "SELECT a FROM Alley a")
    , @NamedQuery(name = "Alley.findById", query = "SELECT a FROM Alley a WHERE a.id = :id")
    , @NamedQuery(name = "Alley.findByLength", query = "SELECT a FROM Alley a WHERE a.length = :length")
    , @NamedQuery(name = "Alley.findByShelves", query = "SELECT a FROM Alley a WHERE a.shelves = :shelves")})
public class Alley implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "LENGTH")
    private Integer length;
    
    @Column(name = "SHELVES")
    private Integer shelves;

    public Alley() {
    }

    public Alley(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getShelves() {
        return shelves;
    }

    public void setShelves(Integer shelves) {
        this.shelves = shelves;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof Alley)) {
            return false;
        }
        Alley other = (Alley) object;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "com.oziomek.warehouse.entity.Alley[ id=" + id + " ]";
    }
    
}
