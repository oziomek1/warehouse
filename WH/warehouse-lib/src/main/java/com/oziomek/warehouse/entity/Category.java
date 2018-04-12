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
@Table(name = "CATEGORY")
@NamedQueries({
    @NamedQuery(name = "Category.showAll", query = "SELECT c FROM Category c")})
public class Category implements Serializable {
    
    @Id
    @NotNull
    @Column(name = "ID")
    private Integer categoryId;
    
    @NotNull
    @Size(min = 3, max = 25)
    @Column(name = "CATEGORY")
    private String category;
    
    @Basic(optional = true)
    @Size(min = 3, max = 40)
    @Column(name = "SUBCATEGORY")
    private String subCategory;
    
    @Column(name = "DANGER")
    private Boolean isDanger;
    
    @Column(name = "SPECIAL")
    private Boolean isSpecial;

    public Category() {
    }

    public Category(Integer categoryId, String category, String subCategory, Boolean isDanger, Boolean isSpecial) {
        this.categoryId = categoryId;
        this.category = category;
        this.subCategory = subCategory;
        this.isDanger = isDanger;
        this.isSpecial = isSpecial;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Boolean getIsDanger() {
        return isDanger;
    }

    public void setIsDanger(Boolean isDanger) {
        this.isDanger = isDanger;
    }

    public Boolean getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(Boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (categoryId != null ? categoryId.hashCode() : 0);
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
        final Category other = (Category) obj;
        return Objects.equals(this.categoryId, other.categoryId);
    }

    @Override
    public String toString() {
        return "Category{" + "categoryId=" + categoryId + ", category=" + category + ", subCategory=" + subCategory + ", isDanger=" + isDanger + ", isSpecial=" + isSpecial + '}';
    }
    
    
}
