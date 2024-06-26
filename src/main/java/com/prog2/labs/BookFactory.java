/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

/**
 *
 * @author bridj
 */
public class BookFactory {
   public BookFormat getFormat(boolean isDigital) {
       if(isDigital) {
           return new EBook();
       } else {
           return new HardCoverBook();
       }    
   }
}
