package com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {
            System.out.println(">> ejemploDeclaracionLlamada()");
            saludar();
            System.out.println("ejemploDeclaracionLlamada -> ¡Terminado!\n");
        }
    public static void saludar() {
        System.out.println("Hola desde el método saludar()");
    }
    
    public static void ejemploPasoParametros() {
            System.out.println(">> ejemploPasoParametros()");
            int x = 5;
            int y = 3;
            imprimirSuma(x, y); // 
            System.out.println("ejemploPasoParametros -> ¡Terminado!\n");
        }

    public static void imprimirSuma(int a, int b) {
        int resultado = a + b;
        System.out.println("imprimirSuma -> " + a + " + " + b + " = " + resultado);
    }
    
    public static void ejemploRetornoValores() {
            System.out.println(">> ejemploRetornoValores()");
            int base = 4;
            int altura = 7;
            int area = calcularAreaRectangulo(base, altura);
            System.out.println("El área del rectángulo es: " + area);
            System.out.println("ejemploRetornoDeValores -> ¡Terminado!\n");
        }

    public static int calcularAreaRectangulo(int base, int altura) {
        return base * altura;
    }
    
    public static void ejemploSobrecarga() {
            System.out.println(">> ejemploSobrecarga()");
            int s1 = sumar(2, 3);                
            double s2 = sumar(2.5, 3.1);         
            int s3 = sumar(1, 2, 3);             

            System.out.println("sumar(int,int) -> 2 + 3 = " + s1);
            System.out.println("sumar(double,double) -> 2.5 + 3.1 = " + s2);
            System.out.println("sumar(int,int,int) -> 1 + 2 + 3 = " + s3);
            System.out.println("ejemploSobrecarga -> ¡Terminado!\n");
        }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }


}
