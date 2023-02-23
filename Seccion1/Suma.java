package CalculadoraSimple;

import java.util.Scanner;

public class Suma {
    public Suma(Scanner teclado) {
        System.out.println("Ingrese un número: ");
        int x = teclado.nextInt();
        System.out.println("Ingrese la cantidad que le quiere sumar: ");
        int y = teclado.nextInt();
        System.out.println("El resultado de la suma entre "+x+" y "+y+" es: "+ (x+y));
    }
}
