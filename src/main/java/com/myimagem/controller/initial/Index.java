/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myimagem.controller.initial;

/**
 *
 * @author jcrfm
 */

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("index")
public class Index implements Serializable {

   @PostConstruct
   public void init(){
      System.out.println("Bean executado!");
   }

   public String getMessage(){
      return "Hello World JSF!";
   }
   public String register() {
        return "/public/register.xhtml";
    }
   public String login(){
          return "/public/login.xhtml";
   }
    
   public String index(){
          return "/public/index.xhtml";
   }
}
