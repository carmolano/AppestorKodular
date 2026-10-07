/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appestorkodular.Domain.Exceptions;

/**
 *
 * @author carlo
 */
public class UserNotFoundException extends RuntimeException  {
    
    private UserNotFoundException(String message){
        super(message);
    }
     public static UserNotFoundException becauseIdWasNotFound(String id){
           return new UserNotFoundException("No se encontró un usuario con el ID: " + id);
     }
    
    
}
