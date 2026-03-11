package com.example;

import java.util.Scanner;

public class EntradaDeDatos {
    
    Scanner sc = new Scanner(System.in);

    public void leerVariosTipos() {
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s1 = sc.next();
        sc.nextLine(); 
        String s2 = sc.nextLine();
    }

    public void manejarSaltoDeLineaPendiente() {
        int n = sc.nextInt();
        sc.nextLine();
        String f = sc.nextLine();
    }
}