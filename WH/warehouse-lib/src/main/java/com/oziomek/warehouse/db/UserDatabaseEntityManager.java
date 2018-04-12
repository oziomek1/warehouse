/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oziomek.warehouse.db;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author oziomek
 */
@Singleton
public class UserDatabaseEntityManager {
    @Produces
    @UserDatabase
    @PersistenceContext
    private EntityManager em;
    
    
}
