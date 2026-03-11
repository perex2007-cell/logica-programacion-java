package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void leerVariosTipos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Lectura de Varios Tipos ---");

        System.out.print("Ingresa un número entero: ");
        int entero = sc.nextInt();

        System.out.print("Ingresa un número decimal: ");
        double decimal = sc.nextDouble();

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.next();

        sc.nextLine(); // Limpiar el buffer

        System.out.print("Ingresa tu nombre completo: ");
        String nombreCompleto = sc.nextLine();

        System.out.println("\nResumen:");
        System.out.println("Entero: " + entero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Palabra: " + palabra);
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println();
    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Manejo de Salto de Línea Pendiente ---");

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt(); // Deja un \n en el buffer

        // El siguiente nextLine() consumiría el \n si no limpiamos
        System.out.println("(Se aplica sc.nextLine() para limpiar buffer)");
        sc.nextLine(); // Limpieza necesaria

        System.out.print("Ingresa tu ciudad: ");
        String ciudad = sc.nextLine();

        System.out.println("Edad: " + edad + ", Ciudad: " + ciudad);
        System.out.println();
    }
}
