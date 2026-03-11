package com.example;

public class Operadores {

    public static void main(String[] args) {
        Operadores demo = new Operadores();
        System.out.println("=== Demostración: Operadores ===");
        demo.demostrarAritmeticos();
        demo.demostrarIncrementoDecremento();
        demo.demostrarRelacionales();
        demo.demostrarLogicos();
        demo.demostrarAsignacionCompuesta();
        demo.demostrarOperadorTernario();
    }

    public void demostrarAritmeticos() {
        int a = 10, b = 3;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));  
        System.out.println("Módulo (resto): " + (a % b));
    }

    public void demostrarIncrementoDecremento() {
        int x = 5;
        System.out.println("Original: " + x);
        System.out.println("Post-incremento: " + (x++));  
        System.out.println("Pre-incremento: " + (++x));   
    }

    public void demostrarRelacionales() {
        int n1 = 10, n2 = 20;
        System.out.println("¿10 > 20?: " + (n1 > n2));
        System.out.println("¿10 == 10?: " + (n1 == 10));
        System.out.println("¿10 != 20?: " + (n1 != n2));
    }

    public void demostrarLogicos() {
        boolean esAdulto = true;
        boolean tieneDinero = false;
        System.out.println("¿Puede comprar? (AND): " + (esAdulto && tieneDinero));
        System.out.println("¿Tiene alguna? (OR): " + (esAdulto || tieneDinero));
    }

    public void demostrarAsignacionCompuesta() {
        int puntos = 10;
        puntos += 5; 
        System.out.println("Puntos acumulados: " + puntos);
    }

    public void demostrarOperadorTernario() {
        int edad = 18;
        String resultado = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        System.out.println("Resultado: " + resultado);
    }
}

