package com.example;

public class ConversionDeTipos {
    public static void main(String[] args) {
        conversionImplicita();
        conversionExplicita();
        stringANumerico();
        numericoAString();
        charAInt();
    }

    public static void conversionImplicita() {
        int miEntero = 9;
        double miDouble = miEntero;
        System.out.println("--- Conversión Implícita ---");
        System.out.println("Entero: " + miEntero);
        System.out.println("Double: " + miDouble);
        System.out.println();
    }

    public static void conversionExplicita() {
        double otroDouble = 9.78d;
        int otroEntero = (int) otroDouble;
        System.out.println("--- Conversión Explícita ---");
        System.out.println("Double original: " + otroDouble);
        System.out.println("Entero convertido: " + otroEntero);
        System.out.println();
    }

    public static void stringANumerico() {
        String textoNumero = "123";
        int numeroDesdeTexto = Integer.parseInt(textoNumero);
        String textoDouble = "45.67";
        double doubleDesdeTexto = Double.parseDouble(textoDouble);
        System.out.println("--- String a Numérico ---");
        System.out.println("String '123' a int: " + numeroDesdeTexto);
        System.out.println("String '45.67' a double: " + doubleDesdeTexto);
        System.out.println();
    }

    public static void numericoAString() {
        int edad = 25;
        String edadTexto = String.valueOf(edad);
        String edadTexto2 = edad + "";
        System.out.println("--- Numérico a String ---");
        System.out.println("Valor '25' como String (método 1): " + edadTexto);
        System.out.println("Valor '25' como String (método 2): " + edadTexto2);
        System.out.println();
    }

    public static void charAInt() {
        char miCaracter = 'A';
        int codigoAscii = miCaracter;
        System.out.println("--- Caracter a ASCII ---");
        System.out.println("Caracter: " + miCaracter);
        System.out.println("Código ASCII: " + codigoAscii);
        System.out.println();
    }
}
