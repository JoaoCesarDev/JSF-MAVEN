/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myimage.business;

import com.myimage.dao.profileDao;
import com.myimage.dao.utils.DAOFactory;
import com.myimage.model.Profile;
import java.util.Properties;

/**
 *
 * @author jcrfm
 */
public class ProfileBusiness {
    private profileDao profileDao;
    
    public ProfileBusiness(){
        super();
        setProfileDao(DAOFactory.createProfile());
    }
    private void setProfileDao(profileDao profileDao) {
        this.profileDao = profileDao;
    }
  
    public void save(Profile Profile){
        profileDao.save(Profile);
    } 
    public boolean existsEmail(String email){
        return profileDao.existsEmail(email);
    }
     
    public Properties profileActives(){
        return profileDao.profileActives();
    }
}
