/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oziomek.warehouse.web;

import com.oziomek.warehouse.entity.Product;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author oziomek
 */
public class ProductController {
    
    private EntityManagerFactory emfactory;
    
    private EntityManager getEntityManager() {
        if (emfactory == null) {
            emfactory = Persistence.createEntityManagerFactory("warehousePU");
        }
        return emfactory.createEntityManager();
    }
    
    public Product[] getProducts() {
        EntityManager em = getEntityManager();
        try {
            javax.persistence.Query query = em.createQuery("SELECT p from PRODUCT as p");
            return (Product[]) query.getResultList().toArray(new Product[0]);
        }  finally {
            em.close();
        }
    }
}
