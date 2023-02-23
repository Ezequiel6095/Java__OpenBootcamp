package CalculadoraSimple;

import java.util.Scanner;

public class Resta {
    public Resta(Scanner teclado){
        System.out.println("Ingrese un número: ");
        int x = teclado.nextInt();
        System.out.println("Ingrese la cantidad que le quiere restar: ");
        int y = teclado.nextInt();
        System.out.println("El resultado de la resta entre "+x+" y "+y+" es: "+ (x-y));
    }
}
