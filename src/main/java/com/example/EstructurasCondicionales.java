package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {
        System.out.println("--- Estructura if ---");
        int x = 10;
        if (x > 5) {
            System.out.println(x + " es mayor que 5");
        }
        System.out.println();
    }

    public static void ejemploIfElse() {
        System.out.println("--- Estructura if-else ---");
        int edad = 15;
        if (edad >= 18) {
            System.out.println("Puedes pasar.");
        } else {
            System.out.println("No puedes pasar.");
        }
        System.out.println();
    }

    public static void ejemploIfElseIfElse() {
        System.out.println("--- Estructura if-else if-else ---");
        int nota = 85;
        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 80) {
            System.out.println("Muy bien");
        } else {
            System.out.println("Sigue intentando");
        }
        System.out.println();
    }

    public static void ejemploSwitch() {
        System.out.println("--- Estructura switch tradicional ---");
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }
        System.out.println();
    }

    public static void ejemploSwitchExpression() {
        System.out.println("--- Estructura switch expression (Java 14+) ---");
        int dia = 2;
        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            default -> "Otro día";
        };
        System.out.println("El día es: " + nombreDia);
        System.out.println();
    }
}
