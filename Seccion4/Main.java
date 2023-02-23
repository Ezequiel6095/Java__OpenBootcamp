package Entregas.Java__OpenBootcamp.Seccion4;

import Entregas.Java__OpenBootcamp.Seccion4.SmartPhone.iPhone;
import Entregas.Java__OpenBootcamp.Seccion4.SmartWatch.AppleWatch;

public class Main {
    public static void main(String[] args) {
        Dispositivos dispositivo;

        Dispositivos Telefono = new iPhone("Apple", "iPhone 14 Pro Max",1000,"A15",128,200);

        Telefono.cargador(1001);
        System.out.println(Telefono);

        Dispositivos Reloj = new AppleWatch("Apple","Serie 8",800,"A8",1000,
                false);
        Reloj.cargador(800);
        System.out.println(Reloj);



        /*dispositivo = new iPhone();
        dispositivo.cargador(100);*/
    }
}
