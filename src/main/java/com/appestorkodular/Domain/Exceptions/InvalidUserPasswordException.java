/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appestorkodular.Domain.Exceptions;

/**
 *
 * @author carlo
 */
public class InvalidUserPasswordException extends IllegalArgumentException{
    
    private InvalidUserPasswordException(String message) {
        super(message);
    }
    
    public static InvalidUserPasswordException becauseValueIsEmpty() {
        return new InvalidUserPasswordException("La contraseña no puede estar vacía.");
    }

   
    public static InvalidUserPasswordException becauseLengthIsTooShort(int min) {
        return new InvalidUserPasswordException("La contraseña debe tener al menos " + min + " caracteres.");
    }
}
