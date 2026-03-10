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

public static void ejemploBreak() {
        int[] numeros = {3, 7, 9, 12, 15};
        int buscar = 12;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("break -> revisando índice " + i);
            if (numeros[i] == buscar) {
                System.out.println("break -> encontrado " + buscar + " en índice " + i);
                encontrado = true;
                break; // sale del for
            }
        }

        if (!encontrado) {
            System.out.println("break -> valor no encontrado");
        }
        System.out.println("break -> ¡Terminado!\n");
    }

 public static void ejemploContinue() {
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue; // salta el resto y va a la siguiente iteración
            }
            System.out.println("continue -> i impar = " + i);
        }
        System.out.println("continue -> ¡Terminado!\n");
    }


}
