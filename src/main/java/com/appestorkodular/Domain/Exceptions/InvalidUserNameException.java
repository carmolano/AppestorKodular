/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appestorkodular.Domain.Exceptions;

/**
 *
 * @author carlo
 */
public class InvalidUserNameException extends IllegalArgumentException{

    private InvalidUserNameException(String message){
      super(message);
  
    }
      public static InvalidUserNameException becauseValueIsEmpty() {
          return new InvalidUserNameException("El nombre del usuario no puede estar vacío.");
          
          
      }
      
      public static InvalidUserNameException becauseLenghIsTooShort(int min){
          return new InvalidUserNameException("El nombre del usuario debe tener al menos " + min  + "caracteres ");
      }
      
    }  
    

