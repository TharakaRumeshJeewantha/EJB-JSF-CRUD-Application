/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.TblUsers;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.TblUsersFacade;

/**
 *
 * @author GTC
 */
@Named(value = "userController")
@SessionScoped
public class UserController implements Serializable {

    @EJB
    private TblUsersFacade tblUsersFacade;
    private TblUsers users = new TblUsers();

    /**
     * Creates a new instance of UserController
     */
    public UserController() {
    }

    public TblUsers getUsers() {
        return users;
    }

    public void setUsers(TblUsers users) {
        this.users = users;
    }
    
    // Create (Insert) Data
    public String insert() {
    this.tblUsersFacade.create(users);
    this.users = new TblUsers();
    return "index";
    }
    
    // Read (View) Data
    public List<TblUsers> findAll() {
        return this.tblUsersFacade.findAll();
    }
    
    // Update Data
    public String update(TblUsers users) {
        this.users = users;
        return "update";
    }
    
    public String update() {
        this.tblUsersFacade.edit(users);
        return "index";
    }
    
    // Delete Data
    public String delete(TblUsers users) {
        this.tblUsersFacade.remove(users);
        return "index";
    }
    
}
