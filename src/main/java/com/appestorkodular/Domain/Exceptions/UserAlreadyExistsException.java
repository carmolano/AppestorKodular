/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appestorkodular.Domain.Exceptions;

/**
 *
 * @author carlo
 */
public class UserAlreadyExistsException extends RuntimeException {
    
    private UserAlreadyExistsException(String message) {
        super(message);
    }
    
    public static UserAlreadyExistsException becauseEmailAlreadyExists(String email) {
        return new UserAlreadyExistsException("Ya existe un usuario con el email: " + email);
    }
    
}
