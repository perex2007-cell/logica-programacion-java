package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion(String[] args) {
        int numero = 30;
        for (int i = 2; i <= 30; i+= 2) {
            System.out.println(i);
        }
    }   
    public static void demostrarConvencionesNombres(String[] args) {
        int edadUsuario = 18;
        String nombreCompleto = "Alexander Perez";
        System.out.println("El nombre del usuario es " + nombreCompleto + " y su edad es " + edadUsuario);
    }
    public static void demostrarConstantes(String[] args) {
       final double PI = 3.1416f;
       System.out.println("El valor de PI es: " + PI);
    }
}
