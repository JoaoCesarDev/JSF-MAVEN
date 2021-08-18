/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myimage.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.annotations.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.NaturalId;

/**
 *
 * @author jcrfm
 */
@Entity
@Table(name="users")
@SequenceGenerator(name="seq",sequenceName="seq_user",allocationSize = 1, initialValue = 1)
public class User implements Serializable {
    @Id
    @GeneratedValue(generator="seq")
    private long id;
    @NaturalId
    private String username;
    private String password;
    private Boolean enabled;
    private String validation;
    
    @ElementCollection(targetClass = String.class)
    @JoinTable(name = "authorities",
               uniqueConstraints = { @UniqueConstraint (columnNames = {"id", "role" })},
               joinColumns = @JoinColumn(name = "id"))
    @Column(name = "role",length = 40)                  
    @Cascade(CascadeType.DELETE)
    private Set<String> permissions= new HashSet<String>();

     /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return username;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.username = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean isActive() {
        return enabled;
    }
    /**
     * @return the active
     */
    public Boolean getActive() {
        return enabled;
    }

    /**
     * @param active the active to set
     */
    public void setActive(Boolean active) {
        this.enabled = active;
    }

    /**
     * @return the validation
     */
    public String getValidation() {
        return validation;
    }

    /**
     * @param validation the validation to set
     */
    public void setValidation(String validation) {
        this.validation = validation;
    }

    /**
     * @return the permissions
     */
    public Set<String> getPermissions() {
        return permissions;
    }

    /**
     * @param permissions the permissions to set
     */
    public void setPermissions(Set<String> permissions) {
        this.permissions = permissions;
    }
        
}
