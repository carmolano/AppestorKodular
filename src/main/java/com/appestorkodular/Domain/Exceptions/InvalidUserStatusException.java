/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appestorkodular.Domain.Exceptions;

/**
 *
 * @author carlo
 */
public class InvalidUserStatusException extends IllegalArgumentException {
    
    private InvalidUserStatusException(String message) {
        super(message);
    }
    
     public static InvalidUserStatusException becauseValueIsInvalid(String value) {
        return new InvalidUserStatusException("El estado \"" + value + "\" no es un estado válido.");
    
     }
    
    
    
    
    
}
