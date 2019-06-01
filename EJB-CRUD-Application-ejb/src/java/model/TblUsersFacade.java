/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.TblUsers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author GTC
 */
@Stateless
public class TblUsersFacade extends AbstractFacade<TblUsers> {

    @PersistenceContext(unitName = "EJB-CRUD-Application-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblUsersFacade() {
        super(TblUsers.class);
    }
    
}
