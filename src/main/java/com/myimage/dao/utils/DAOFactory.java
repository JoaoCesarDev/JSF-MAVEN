/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myimage.dao.utils;

import com.myimage.dao.ProfileDaoImpl;
import com.myimage.dao.UserDao;
import com.myimage.dao.UserImpl;
import com.myimage.dao.profileDao;
import java.io.Serializable;

/**
 *
 * @author jcrfm
 */
public class DAOFactory implements Serializable{
    public static profileDao createProfile(){
        ProfileDaoImpl profileDaoImpl = new ProfileDaoImpl();
        
        profileDaoImpl.setSession(hibernateUtil.getSessionFactory().getCurrentSession());
        
        return profileDaoImpl;
    }
    public static UserDao createUser(){
        
        UserImpl userImpl = new UserImpl();
        
        userImpl.setSession(hibernateUtil.getSessionFactory().getCurrentSession());
        
        return userImpl;
    }
}
