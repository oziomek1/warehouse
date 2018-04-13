/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oziomek.warehouse.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "PRODUCT_LOCATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductLocation.findAll", query = "SELECT p FROM ProductLocation p")
    , @NamedQuery(name = "ProductLocation.findByLocationId", query = "SELECT p FROM ProductLocation p WHERE p.locationId = :locationId")
    , @NamedQuery(name = "ProductLocation.findByProductId", query = "SELECT p FROM ProductLocation p WHERE p.productId = :productId")
    , @NamedQuery(name = "ProductLocation.findByAlleyId", query = "SELECT p FROM ProductLocation p WHERE p.alleyId = :alleyId")
    , @NamedQuery(name = "ProductLocation.findByShelveNum", query = "SELECT p FROM ProductLocation p WHERE p.shelveNum = :shelveNum")
    , @NamedQuery(name = "ProductLocation.findByProductAmt", query = "SELECT p FROM ProductLocation p WHERE p.productAmt = :productAmt")})
public class ProductLocation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LOCATION_ID")
    private Integer locationId;
    
    @Column(name = "PRODUCT_ID")
    private Integer productId;
    
    @Column(name = "ALLEY_ID")
    private Integer alleyId;
    
    @Column(name = "SHELVE_NUM")
    private Integer shelveNum;
    
    @Column(name = "PRODUCT_AMT")
    private BigInteger productAmt;

    public ProductLocation() {
    }

    public ProductLocation(Integer locationId) {
        this.locationId = locationId;
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

    public Integer getShelveNum() {
        return shelveNum;
    }

    public void setShelveNum(Integer shelveNum) {
        this.shelveNum = shelveNum;
    }

    public BigInteger getProductAmt() {
        return productAmt;
    }

    public void setProductAmt(BigInteger productAmt) {
        this.productAmt = productAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locationId != null ? locationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof ProductLocation)) {
            return false;
        }
        ProductLocation other = (ProductLocation) object;
        return Objects.equals(this.locationId, other.locationId);
    }

    @Override
    public String toString() {
        return "com.oziomek.warehouse.entity.ProductLocation[ locationId=" + locationId + " ]";
    }
    
}
