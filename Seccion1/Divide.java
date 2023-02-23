package CalculadoraSimple;

import java.util.Scanner;

public class Divide {
    public Divide(Scanner teclado){
        System.out.println("Ingrese un número: ");
        double x = teclado.nextInt();
        System.out.println("Ingrese la cantidad que le quiere dividir: ");
        double y = teclado.nextInt();
        double resultado=0;
        try {
             resultado = x/y;
        }
        catch (ArithmeticException e) {
            System.out.println("Divided by zero operation cannot possible" + e);
        }

        System.out.println("El resultado de la divición entre "+x+" y "+y+" es: "+ resultado);
    }
}
