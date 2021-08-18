/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myimage.business;

import com.myimage.dao.UserDao;
import com.myimage.dao.utils.DAOFactory;
import com.myimage.model.User;
import java.io.Serializable;
 
public class UserBusiness implements Serializable{
 
    private UserDao userDao;      
     
    public UserBusiness() {
        super();
        
        setUserDao(DAOFactory.createUser());
    }
     
    public boolean existsValidation(String validation) {
        
        return userDao.existsValidation(validation);
    }
 
    public void setUserDao(UserDao userDao) {
        
        this.userDao = userDao;
    }     
}
