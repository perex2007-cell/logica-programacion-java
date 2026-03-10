package com.example;

public class Main {
    public static void main(String[] args) {
        // --- Variables y Constantes ---
        System.out.println("=== Demostración: Variables y Constantes ===");
        VariablesYConstantes.demostrarDeclaracionAsignacion(args);
        VariablesYConstantes.demostrarConvencionesNombres(args);
        VariablesYConstantes.demostrarConstantes(args);
        System.out.println();

        // --- Tipos de Datos Primitivos ---
        System.out.println("=== Demostración: Tipos de Datos Primitivos ===");
        TiposDeDatosPrimitivos.demostrarEnteros(args);
        TiposDeDatosPrimitivos.demostrarFlotantes(args);
        TiposDeDatosPrimitivos.demostrarCaracteres(args);
        TiposDeDatosPrimitivos.demostrarBooleanos(args);
        System.out.println();

        // --- Conversión de Tipos (Casting) ---
        System.out.println("=== Demostración: Conversión de Tipos ===");
        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();
        System.out.println();

        // --- Estructuras de Repetición ---
        System.out.println("=== Demostración: Estructuras de Repetición ===");
        EstructurasDeRepeticion.ejemploWhile();
        EstructurasDeRepeticion.ejemploDoWhile();
        EstructurasDeRepeticion.ejemploForClasico();
        EstructurasDeRepeticion.ejemploForAnidado();
        EstructurasDeRepeticion.ejemploBreakContinue();
        System.out.println();

        // --- Arreglos Unidimensionales ---
        System.out.println("=== Demostración: Arreglos Unidimensionales ===");
        ArreglosUnidimensionales.declararCrearInicializar();
        ArreglosUnidimensionales.mostrarLongitud();
        ArreglosUnidimensionales.recorrerConForClasico();
        ArreglosUnidimensionales.recorrerConForEach();
        ArreglosUnidimensionales.arrayComoParametroYRetorno();
        System.out.println();

        // --- Métodos Estáticos Simples ---
        System.out.println("=== Demostración: Métodos Estáticos Simples ===");
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        MetodosEstaticosSimples.ejemploPasoParametros();
        MetodosEstaticosSimples.ejemploRetornoValores();
        MetodosEstaticosSimples.ejemploSobrecarga();
    }
}