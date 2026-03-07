package com.example;

public class Main {
    public static void main(String[] args) {
        // VariablesYConstantes
        System.out.println("Demostracion de Variables y Constantes");
        VariablesYConstantes.demostrarDeclaracionAsignacion(args);
        VariablesYConstantes.demostrarConvencionesNombres(args);
        VariablesYConstantes.demostrarConstantes(args);
        //TiposDatosPrimititvos
        System.out.println("\nDemostracion de Tipos de Datos Primitivos");
        TiposDeDatosPrimitivos.demostrarEnteros(args);
        TiposDeDatosPrimitivos.demostrarFlotantes(args);
        TiposDeDatosPrimitivos.demostrarCaracteres(args);
        TiposDeDatosPrimitivos.demostrarBooleanos(args);
    }
}