package com.example;

public class ConversionDeTipos {
    public static void main(String[] args) {
        demostrarCastingImplicito();
        demostrarCastingExplicito();
        demostrarProblemasDePrecision();
    }

    public static void demostrarCastingImplicito() {
        int entero = 100;
        long largo = entero; // De int a long (automático)
        double decimal = largo; // De long a double (automático)

        System.out.println("--- Casting Implícito (Ampliación) ---");
        System.out.println("Valor entero: " + entero);
        System.out.println("Valor long: " + largo);
        System.out.println("Valor double: " + decimal);
        System.out.println();
    }

    public static void demostrarCastingExplicito() {
        double decimal = 9.99;
        int entero = (int) decimal; // De double a int (truncamiento manual)

        System.out.println("--- Casting Explícito (Reducción) ---");
        System.out.println("Valor double: " + decimal);
        System.out.println("Valor int (después de casting): " + entero);
        System.out.println();
    }

    public static void demostrarProblemasDePrecision() {
        // Ejemplo 1: Truncamiento
        double grande = 123.456789;
        float reducido = (float) grande;

        // Ejemplo 2: Desbordamiento (Overflow)
        int numeroGrande = 1000000;
        byte convertidoAByte = (byte) numeroGrande;

        System.out.println("--- Problemas de Precisión y Desbordamiento ---");
        System.out.println("Double original: " + grande);
        System.out.println("Float reducido (pérdida de precisión): " + reducido);
        System.out.println("Int original: " + numeroGrande);
        System.out.println("Byte convertido (desbordamiento): " + convertidoAByte);
        System.out.println();
    }
}
