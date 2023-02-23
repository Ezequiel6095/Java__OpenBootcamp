package Entregas.Java__OpenBootcamp.Seccion2;

import java.util.Scanner;

public class Entrega_Seccion2 {

     static void Menu() {
         System.out.println("Select una opción");
         System.out.println("1 -Calcular I.V.A 10%");
         System.out.println("2- Calcular I.V.A 5%");
    }

    static void opcion(int op) {
        Scanner teclado = new Scanner(System.in);
        double monto;
        switch (op) {
            case 1:
                System.out.println("Ingrese el monto que quiere saber con el IVA 10%");
                monto = teclado.nextDouble();
                IVA( 0.10,  monto);
                break;
            case 2:
                System.out.println("Ingrese el monto que quiere saber con el IVA 5%");
                monto = teclado.nextDouble();
                IVA(0.05,monto);
                break;
        }
    }


    private static void IVA(double iva,double monto) {
        double IVA = monto*iva;
        double total = monto+IVA;
        System.out.println("El monto del IVA es: ("  + IVA + ") El total es: "+ total);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Menu();
        int op = teclado.nextInt();
        opcion(op);
    }
}
