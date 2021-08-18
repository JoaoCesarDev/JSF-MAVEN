/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myimage.dao;

import com.myimage.model.User;
 
public interface UserDao {
    
public boolean existsValidation(String validation);
     
public void save(User user);
     
}
