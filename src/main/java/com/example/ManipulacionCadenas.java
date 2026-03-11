package com.example;

public class ManipulacionCadenas {

    public static void main(String[] args) {

        String texto = "Programacion en Java";

        System.out.println("Texto original: " + texto);
        System.out.println("Mayusculas: " + texto.toUpperCase());
        System.out.println("Minusculas: " + texto.toLowerCase());
        System.out.println("Longitud: " + texto.length());
        System.out.println("Reemplazo: " + texto.replace("Java", "Python"));

    }
}