/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appestorkodular.Domain.Exceptions;

/**
 *
 * @author carlo
 */
public class InvalidUserEmailException extends IllegalArgumentException {
    
    
    
    private InvalidUserEmailException(String message){
        super(message);
    }
    
    public static InvalidUserEmailException becauseFormatIsInvalid(String email){
        return new InvalidUserEmailException("el formato email es invalido:" + email);
        
    }
    
    public static InvalidUserEmailException becauseValueIsEmpty(){
        return new InvalidUserEmailException("el email del usuario no puede estar vacio. ");
    }
    
}
    
    
    
       

