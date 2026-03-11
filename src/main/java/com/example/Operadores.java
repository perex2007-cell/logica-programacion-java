package com.example;

public class Operadores {

    public static void demostrarAritmeticos() {
        System.out.println("--- Operadores Aritméticos ---");
        int a = 10;
        int b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Suma (a + b): " + (a + b));
        System.out.println("Resta (a - b): " + (a - b));
        System.out.println("Multiplicación (a * b): " + (a * b));
        System.out.println("División (a / b): " + (a / b));
        System.out.println("Módulo (a % b): " + (a % b));
        System.out.println();
    }

    public static void demostrarIncrementoDecremento() {
        System.out.println("--- Incremento y Decremento ---");
        int contador = 5;
        System.out.println("Valor inicial: " + contador);
        System.out.println("Post-incremento (contador++): " + (contador++));
        System.out.println("Valor después: " + contador);
        System.out.println("Pre-incremento (++contador): " + (++contador));
        System.out.println("Decremento (--contador): " + (--contador));
        System.out.println();
    }

    public static void demostrarRelacionales() {
        System.out.println("--- Operadores Relacionales ---");
        int x = 10, y = 20;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x > y: " + (x > y));
        System.out.println("x >= 10: " + (x >= 10));
        System.out.println("x < y: " + (x < y));
        System.out.println("x <= 5: " + (x <= 5));
        System.out.println("x == 10: " + (x == 10));
        System.out.println("x != y: " + (x != y));
        System.out.println();
    }

    public static void demostrarLogicos() {
        System.out.println("--- Operadores Lógicos ---");
        boolean v = true;
        boolean f = false;
        System.out.println("v && f (AND): " + (v && f));
        System.out.println("v || f (OR): " + (v || f));
        System.out.println("!v (NOT): " + (!v));
        System.out.println();
    }

    public static void demostrarAsignacionCompuesta() {
        System.out.println("--- Asignación Compuesta ---");
        int n = 10;
        System.out.println("Valor inicial: " + n);
        n += 5; // n = n + 5
        System.out.println("n += 5: " + n);
        n -= 2; // n = n - 2
        System.out.println("n -= 2: " + n);
        n *= 3; // n = n * 3
        System.out.println("n *= 3: " + n);
        n /= 4; // n = n / 4
        System.out.println("n /= 4: " + n);
        n %= 3; // n = n % 3
        System.out.println("n %= 3: " + n);
        System.out.println();
    }

    public static void demostrarOperadorTernario() {
        System.out.println("--- Operador Ternario ---");
        int edad = 18;
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Edad " + edad + ": " + resultado);
        System.out.println();
    }
}
