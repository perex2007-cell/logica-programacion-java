package com.example;

public class EstructurasCondicionales {

    public void ejemploIf() {
        int x = 10;
        if (x > 5) {
            System.out.println("Si");
        }
    }

    public void ejemploIfElse() {
        int x = 3;
        if (x > 5) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

    public void ejemploIfElseIfElse() {
        int t = 20;
        if (t > 30) {
            System.out.println("Calor");
        } else if (t >= 15) {
            System.out.println("Ok");
        } else {
            System.out.println("Frio");
        }
    }

    public void ejemploSwitch() {
        int d = 1;
        switch (d) {
            case 1: 
                System.out.println("L"); 
                break;
            case 2: 
                System.out.println("M"); 
                break;
            default: 
                System.out.println("X");
        }
    }

    public void ejemploSwitchExpression() {
        int m = 1;
        String res = switch (m) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            default -> "Otro";
        };
        System.out.println(res);
    }
}