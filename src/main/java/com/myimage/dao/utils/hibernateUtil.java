/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myimage.dao.utils;

import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author jcrfm
 */
public class hibernateUtil {
    
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        
        try{
            Configuration configuration = new Configuration().configure();// configures settings from hibernate.cfg.xml
            
            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
            //Se você perder a linha abaixo, ele reclamará de uma configuração de dialeto ausente
            serviceRegistryBuilder.applySettings(configuration.getProperties());
            
            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
            
            return configuration.buildSessionFactory(serviceRegistry);
        }
        catch(Throwable ex){
             System.err.println("Initial SessionFactory creation failed." + ex);
             throw new ExceptionInInitializerError(ex);
            }
        }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
