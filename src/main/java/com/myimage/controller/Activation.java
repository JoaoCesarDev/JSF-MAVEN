/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myimage.controller;

import javax.annotation.PostConstruct;

import com.myimage.business.UserBusiness;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.inject.Named;
import org.omnifaces.cdi.Param;


@Named
@RequestScoped
public class Activation implements Serializable {
    
    
   
    @Inject @Param
    private String key;
 
    private boolean valid = false;
 
    @PostConstruct
    public void init() {
        UserBusiness userBusiness = new UserBusiness();
        if(userBusiness.existsValidation(getKey())){
            setValid(true);
        }    
    }
 
    public String getKey() {
        return key;
    }
 
    public void setKey(String key) {
        this.key = key;
    }
 
    public boolean isValid() {
        return valid;
    }
 
    public void setValid(boolean valid) {
        this.valid = valid;
    }    
}
