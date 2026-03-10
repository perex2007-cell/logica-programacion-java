package com.example;

public class ArreglosUnidimensionales {
    
 public static void declararCrearInicializar() {
        System.out.println(">> ejemploDeclararCrearInicializar()");

        int[] numeros = new int[5]; // [0, 0, 0, 0, 0]
        numeros[0] = 10;
        numeros[1] = 20; // ahora [10, 20, 0, 0, 0]

        String[] frutas = {"Manzana", "Banana", "Cereza"};

        System.out.println("numeros[0] = " + numeros[0]);
        System.out.println("numeros[1] = " + numeros[1]);
        System.out.println("frutas[0] = " + frutas[0]);
        System.out.println("frutas[1] = " + frutas[1]);
        System.out.println("frutas[2] = " + frutas[2]);

        System.out.println("ejemploDeclararCrearInicializar -> ¡Terminado!\n");
    }
    
public static void mostrarLongitud() {
        System.out.println(">> mostrarLongitud()");
        double[] precios = {9.99, 14.5, 3.75, 20.0};
        System.out.println("La longitud del arreglo 'precios' es: " + precios.length);
        System.out.println("mostrarLongitud -> ¡Terminado!\n");
    }
    
public static void recorrerConForClasico() {
        System.out.println(">> ejemploForClasico()");
        int[] pares = {2, 4, 6, 8, 10};

        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }

        System.out.println("ejemploForClasico -> ¡Terminado!\n");
    }

public static void recorrerConForEach() {
        System.out.println(">> ejemploForEach()");
        String[] nombres = {"Ana", "Luis", "Marta"};

        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        System.out.println("ejemploForEach -> ¡Terminado!\n");
    }

public static void arrayComoParametroYRetorno() {
        System.out.println(">> arrayComoParametroYRetorno()");

        int[] original = {1, 2, 3, 4};
        System.out.print("Original -> ");
        imprimirArray(original);

        // Pasamos 'original' como parámetro y recibimos un NUEVO arreglo como retorno
        int[] transformado = duplicarElementos(original);

        System.out.print("Transformado (x2) -> ");
        imprimirArray(transformado);

    }
    