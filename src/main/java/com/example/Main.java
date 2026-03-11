package com.example;

public class Main {
    public static void main(String[] args) {
        // --- Variables y Constantes ---
        System.out.println("=== 1. VARIABLES Y CONSTANTES ===");
        VariablesYConstantes.demostrarDeclaracionAsignacion(args);
        VariablesYConstantes.demostrarConvencionesNombres(args);
        VariablesYConstantes.demostrarConstantes(args);
        System.out.println();

        // --- Tipos de Datos Primitivos ---
        System.out.println("=== 2. TIPOS DE DATOS PRIMITIVOS ===");
        TiposDeDatosPrimitivos.demostrarEnteros(args);
        TiposDeDatosPrimitivos.demostrarFlotantes(args);
        TiposDeDatosPrimitivos.demostrarCaracteres(args);
        TiposDeDatosPrimitivos.demostrarBooleanos(args);
        System.out.println();

        // --- Operadores ---
        System.out.println("=== 3. OPERADORES ===");
        Operadores.demostrarAritmeticos();
        Operadores.demostrarIncrementoDecremento();
        Operadores.demostrarRelacionales();
        Operadores.demostrarLogicos();
        Operadores.demostrarAsignacionCompuesta();
        Operadores.demostrarOperadorTernario();
        System.out.println();

        // --- Conversión de Tipos (Casting) ---
        System.out.println("=== 4. CONVERSIÓN DE TIPOS (CASTING) ===");
        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();
        System.out.println();

        // --- Entrada de Datos (Scanner) ---
        // Comentado para que no detenga la ejecución automática si no hay entrada
        // manual,
        // pero listo para usarse.
        /*
         * System.out.println("=== 5. ENTRADA DE DATOS ===");
         * EntradaDeDatos.leerVariosTipos();
         * EntradaDeDatos.manejarSaltoDeLineaPendiente();
         * System.out.println();
         */

        // --- Estructuras Condicionales ---
        System.out.println("=== 6. ESTRUCTURAS CONDICIONALES ===");
        EstructurasCondicionales.ejemploIf();
        EstructurasCondicionales.ejemploIfElse();
        EstructurasCondicionales.ejemploIfElseIfElse();
        EstructurasCondicionales.ejemploSwitch();
        EstructurasCondicionales.ejemploSwitchExpression();
        System.out.println();

        // --- Estructuras de Repetición ---
        System.out.println("=== 7. ESTRUCTURAS DE REPETICIÓN ===");
        EstructurasDeRepeticion.ejemploWhile();
        EstructurasDeRepeticion.ejemploDoWhile();
        EstructurasDeRepeticion.ejemploForClasico();
        EstructurasDeRepeticion.ejemploForAnidado();
        EstructurasDeRepeticion.ejemploBreakContinue();
        System.out.println();

        // --- Arreglos Unidimensionales ---
        System.out.println("=== 8. ARREGLOS UNIDIMENSIONALES ===");
        ArreglosUnidimensionales.declararCrearInicializar();
        ArreglosUnidimensionales.mostrarLongitud();
        ArreglosUnidimensionales.recorrerConForClasico();
        ArreglosUnidimensionales.recorrerConForEach();
        ArreglosUnidimensionales.arrayComoParametroYRetorno();
        System.out.println();

        // --- Métodos Estáticos Simples ---
        System.out.println("=== 9. MÉTODOS ESTÁTICOS SIMPLES ===");
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        MetodosEstaticosSimples.ejemploPasoParametros();
        MetodosEstaticosSimples.ejemploRetornoValores();
        MetodosEstaticosSimples.ejemploSobrecarga();

         // --- Arreglos Bidimensionales ---
        System.out.println("=== 10. ARREGLOS BIDIMENSIONALES ===");
        ArreglosBidimensionales.main(args);
        System.out.println();

        // --- Manipulación de Cadenas ---
        System.out.println("=== 11. MANIPULACIÓN DE CADENAS ===");
        ManipulacionCadenas.main(args);
        System.out.println();

        // --- Manejo Básico de Excepciones ---
        System.out.println("=== 12. MANEJO BÁSICO DE EXCEPCIONES ===");
        ManejoBasicoExcepciones.main(args);
    }
}