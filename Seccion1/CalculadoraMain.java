package Entregas.Java__OpenBootcamp.Seccion1;

import java.util.Scanner;

public class CalculadoraMain {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner teclado = new Scanner(System.in);
        int op =teclado.nextInt();
         new Opciones(op,teclado);
        System.out.println("Saliendo");
    }
}
