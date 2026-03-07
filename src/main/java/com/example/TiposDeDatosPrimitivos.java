package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros(String[] args) {
        byte valorByte = 127;
        short valorShort= 30234;
        int valorInt = 438593943;  
        long valorLong = 9223372036854775807L; 
        System.out.println("Valor byte: " + valorByte);
        System.out.println("Valor short: " + valorShort);
        System.out.println("Valor int: " + valorInt);
        System.out.println("Valor long: " + valorLong);   
    }
    public static void demostrarFlotantes(String[] args) {
        float valorFloat = 3.14159265f;
        double valorDouble = 3.141592653589793;
        System.out.println("Valor float: " + valorFloat);
        System.out.println("Valor double: " + valorDouble);
    }
    public static void demostrarCaracteres(String[] args) {
        char valorChar = 'A';
        System.out.println("Valor char: " + valorChar);
    }
    public static void demostrarBooleanos(String[] args) {
        boolean valorBooleano = true;
        System.out.println("Valor booleano: " + valorBooleano);
    }
    public static void demostrarValorPorDefecto(String[] args) {
        
    }
}
