/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.mavenmybyciclerides;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author acnapich
 */
@Stateless
public class RidesFacade extends AbstractFacade<Rides> {

    @PersistenceContext(unitName = "com.AC_MavenMyBycicleRides_war_1.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RidesFacade() {
        super(Rides.class);
    }
    
}
