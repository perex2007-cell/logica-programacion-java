package com.example;

public class EstructurasDeRepeticion {
    
    public static void ejemploWhile {
         int n = 5;     
         while (n > 0) {
            System.out.println("while -> n = " + n);
            n--;
         }
         System.out.println("while -> ¡Terminado!\n");
    }
    
  public static void ejemploDoWhile() {
        int n = 0;
        do {
            System.out.println("do-while -> n = " + n);
            n++;
        } while (n < 3);
        System.out.println("do-while -> ¡Terminado!\n");
    }
    
   public static void ejemploForClasico() {
        for (int i = 0; i < 5; i++) {
            System.out.println("for -> i = " + i);
        }
        System.out.println("for -> ¡Terminado!\n");
    }

   public static void ejemploForAnidado() {
        for (int fila = 1; fila <= 3; fila++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print((fila * col) + "\t");
            }
            System.out.println();
        }
        System.out.println("for anidado -> ¡Terminado!\n");
    }


public static void ejemploBreakContinue() {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("continue -> " + i + " es par, se salta.");
                continue;
            }
            if (i == 7) {
                System.out.println("break -> encontrado 7, se termina el ciclo.");
                break;
            }

            System.out.println("Numero impar procesado: " + i);
        }

        System.out.println("ejemploBreakContinue -> ¡Terminado!\n");
    }
}



