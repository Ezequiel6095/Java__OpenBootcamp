package Entregas.Java__OpenBootcamp.Seccion3;

import java.util.Scanner;

public class Entrega_Seccion3 {

    static void cargar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nombres que quiere cargar");
        int cantidad = teclado.nextInt();
        String nombres[] = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre: " + (i + 1));
            nombres[i] = teclado.next();
        }

        for (String i : nombres) {
            System.out.println(i);
        }
    }

        public static void main (String[]args){
            cargar();

        }

}
