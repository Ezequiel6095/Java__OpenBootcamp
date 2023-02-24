package Entregas.Java__OpenBootcamp.Seccion4;

import Entregas.Java__OpenBootcamp.Seccion4.SmartPhone.iPhone;
import Entregas.Java__OpenBootcamp.Seccion4.SmartWatch.AppleWatch;

public class Main {
    public static void main(String[] args) {
        Dispositivos dispositivo;


        dispositivo = new iPhone("Apple", "iPhone 14 Pro Max",1000,"A15",128,200);
        int precio2= dispositivo.precio;
        dispositivo.cargador(precio2);
        System.out.println(dispositivo);



        dispositivo = new AppleWatch("Apple","Serie 8",800,"A8",1000,
                false);
        dispositivo.cargador(800);
        System.out.println(dispositivo);

    }
}
