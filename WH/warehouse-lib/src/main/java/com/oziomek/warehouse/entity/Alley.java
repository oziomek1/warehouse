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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author oziomek
 */
@Entity
@Table(name = "ALLEY")
@NamedQueries({
    @NamedQuery(name = "Alley.showAll", query = "SELECT a FROM Alley a")})
public class Alley implements Serializable {
    
    @Id
    @NotNull
    @Column(name = "ID")
    private Integer alleyId;
    
    @Basic(optional = true)
    @Size(min = 3, max = 40)
    @Column(name = "ALLEY_NAME")
    private String alleyName;
    
    @NotNull
    @Column(name = "LENGTH")
    private Integer length;
    
    @Column(name = "LEVELS")
    private Integer levels;
    
    @Column(name = "SHELVES")
    private Integer shelves;
    
    @Column(name = "AVAILABLE")
    private Boolean isAvailable;

    public Alley() {
    }

    public Alley(Integer alleyId, String alleyName, Integer length, Integer levels, Integer shelves, Boolean isAvailable) {
        this.alleyId = alleyId;
        this.alleyName = alleyName;
        this.length = length;
        this.levels = levels;
        this.shelves = shelves;
        this.isAvailable = isAvailable;
    }

    public Integer getAlleyId() {
        return alleyId;
    }

    public void setAlleyId(Integer alleyId) {
        this.alleyId = alleyId;
    }

    public String getAlleyName() {
        return alleyName;
    }

    public void setAlleyName(String alleyName) {
        this.alleyName = alleyName;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    public Integer getShelves() {
        return shelves;
    }

    public void setShelves(Integer shelves) {
        this.shelves = shelves;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (alleyId != null ? alleyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alley other = (Alley) obj;
        return Objects.equals(this.alleyId, other.alleyId);
    }

    @Override
    public String toString() {
        return "Alley{" + "alleyId=" + alleyId + ", alleyName=" + alleyName + ", length=" + length + ", levels=" + levels + ", shelves=" + shelves + ", isAvailable=" + isAvailable + '}';
    }
    
    
}
