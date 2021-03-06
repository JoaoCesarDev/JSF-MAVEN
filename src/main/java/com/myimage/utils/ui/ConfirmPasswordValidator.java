/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myimage.utils.ui;
  
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
  
@FacesValidator("confirmPasswordValidator")
public class ConfirmPasswordValidator implements Validator {
  
    public void validate(FacesContext context, UIComponent component,
            Object value) throws ValidatorException {
  
        UIInput passwordComponent = (UIInput) component.getAttributes().get("passwordComponent");
        
        String password = (String) passwordComponent.getValue();
  
        String confirm = (String) value;
  
        if (!password.equals(confirm)) {
            
            throw new ValidatorException(new FacesMessage("Senhas não são iguais."));
            
        }
    }
}
