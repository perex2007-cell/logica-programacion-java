package com.example;

public class ManejoBasicoExcepciones {

    public static void main(String[] args) {

        try {

            int numero = 10;
            int resultado = numero / 0;

            System.out.println(resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: No se puede dividir por cero");

        } finally {

            System.out.println("Programa finalizado");

        }

    }
}