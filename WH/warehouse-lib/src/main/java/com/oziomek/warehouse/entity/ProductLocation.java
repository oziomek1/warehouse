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

/**
 *
 * @author oziomek
 */
@Entity
@Table(name = "PRODUCT_LOCATION")
@NamedQueries({
    @NamedQuery(name = "ProductLocation.showAll", query = "SELECT l FROM Product_location l"),
    @NamedQuery(name = "ProductLocation.findByLocationId", query = "SELECT l FROM Product_location l WHERE l.locationId = :locationId"),
    @NamedQuery(name = "ProductLocation.findByProductId", query = "SELECT l FROM Product_location l WHERE l.productId = :productId"),
    @NamedQuery(name = "ProductLocation.findByAlleyId", query = "SELECT l FROM Product_location l WHERE l.alleyId = :alleyId")})
public class ProductLocation implements Serializable {
    
    @Id
    @NotNull
    @Column(name = "LOCATIONID")
    private Integer locationId;

    @NotNull
    @Column(name = "PRODUCTID")
    private Integer productId;
    
    @Column(name = "ALLEYID")
    private Integer alleyId;
    
    @NotNull
    @Column(name = "SHELVE_NUM")
    private Integer shelveNumber;
    
    @Column(name = "PRODUCT_AMT")
    private Integer productAmount;

    public ProductLocation() {
    }

    public ProductLocation(Integer locationId, Integer productId, Integer alleyId, Integer shelveNumber, Integer productAmount) {
        this.locationId = locationId;
        this.productId = productId;
        this.alleyId = alleyId;
        this.shelveNumber = shelveNumber;
        this.productAmount = productAmount;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAlleyId() {
        return alleyId;
    }

    public void setAlleyId(Integer alleyId) {
        this.alleyId = alleyId;
    }

    public Integer getShelveNumber() {
        return shelveNumber;
    }

    public void setShelveNumber(Integer shelveNumber) {
        this.shelveNumber = shelveNumber;
    }

    public Integer getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locationId != null ? locationId.hashCode() : 0);
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
        final ProductLocation other = (ProductLocation) obj;
        return Objects.equals(this.locationId, other.locationId);
    }

    @Override
    public String toString() {
        return "ProductLocation{" + "locationId=" + locationId + ", productId=" + productId + ", alleyId=" + alleyId + ", shelveNumber=" + shelveNumber + ", productAmount=" + productAmount + '}';
    }
    
    
}
