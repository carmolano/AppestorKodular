/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appestorkodular.Domain.Exceptions;

/**
 *
 * @author carlo
 */
public class InvalidUserIdException extends IllegalArgumentException {
    
    private InvalidUserIdException (String message){
    
    super(message);
    }
                      
       public static InvalidUserIdException becauseValueIsEmpty(){
           return new InvalidUserIdException("El ID del usuario no puede estar vacio. ");
       
    }
    
}
