package CalculadoraSimple;

import java.util.Scanner;

public class Opciones {
    public Opciones(int op, Scanner teclado) {
        switch (op){
            case 1: {// Suma
                System.out.println("Se llamo a suma");
                new Suma(teclado);
                break;
                    }
            case 2:{ // Resta
                System.out.println("Se llamo a resta");
                new Resta(teclado);
                break;
            }
            case 3:{
                System.out.println("Se llama Multiplicacion");
                new Multi(teclado);
                break;
            }
            case 4:{
                System.out.println("Ingreso a Divide");
                new Divide(teclado);
                break;
            }
            default:{
                System.out.println("Error");
            }
        }
    }
}
