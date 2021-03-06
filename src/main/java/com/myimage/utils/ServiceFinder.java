/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myimage.utils;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
 
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
 
public class ServiceFinder {
 
    public static Object findBean(String beanName) {
 
        FacesContext context = FacesContext.getCurrentInstance();
        
        ExternalContext external = context.getExternalContext();
 
        ServletContext servletContext = (ServletContext) external.getContext();
        
        ApplicationContext appContext = WebApplicationContextUtils
                
                .getWebApplicationContext(servletContext);
 
        Object object = appContext.getBean(beanName);
        
        return object;
    }
}
