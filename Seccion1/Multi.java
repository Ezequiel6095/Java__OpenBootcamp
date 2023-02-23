package Entregas.Java__OpenBootcamp.Seccion1;

import java.util.Scanner;

public class Multi {
    public Multi(Scanner teclado){
        System.out.println("Ingrese un número: ");
        double x = teclado.nextInt();
        System.out.println("Ingrese la cantidad que le quiere multiplicar: ");
        double y = teclado.nextInt();
        System.out.println("El resultado de la multiplicacion entre "+x+" y "+y+" es: "+ (x*y));
    }
}
