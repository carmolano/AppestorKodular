/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appestorkodular.Domain.Exceptions;

/**
 *
 * @author carlo
 */
public class InvalidUserRoleException  extends IllegalArgumentException{
    
    private InvalidUserRoleException(String message){
        super(message);
    }
    
    public static InvalidUserRoleException becauseValueIsInvalid(String value){
        return new InvalidUserRoleException ("El rol \"" + value + "\" no es un rol válido.");
    }
    
}
