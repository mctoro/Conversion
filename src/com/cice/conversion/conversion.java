/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.conversion;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class conversion {
    public static void main(String[] args) {
        double dias;
        double segundos;
        
        
        System.out.print("Indica cuantos días quieres convertir en segundos: ");
        
        Scanner sc = new Scanner(System.in);
        dias = sc.nextDouble();
        segundos = dias*86400;
        System.out.println(dias + "días corresponden a: " + segundos + " segundos.");
        
    }
    
}
