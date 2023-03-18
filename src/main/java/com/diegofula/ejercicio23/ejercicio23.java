package com.diegofula.ejercicio23;

import java.util.Scanner;

public class ejercicio23 {

    public static void main(String[] args) {
        //  Declaramos el Scanner con la variable scan
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite el valor de A");
        int a = scan.nextInt();
        
        System.out.println("Digite el valor de B");
        int b = scan.nextInt();
        
        System.out.println("Digite el valor de C");
        int c = scan.nextInt();
        
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println("X1= " + x1);
        System.out.println("X2= " + x2);
    }
    
}
