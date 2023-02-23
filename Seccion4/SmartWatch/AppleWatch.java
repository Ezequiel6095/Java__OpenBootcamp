package Entregas.Java__OpenBootcamp.Seccion4.SmartWatch;

import Entregas.Java__OpenBootcamp.Seccion4.Dispositivos;

public class AppleWatch extends Dispositivos {
    String procesador;
    int Bateria;
    boolean eSIM;

    public AppleWatch(){

    }

    public AppleWatch(String marca, String modelo, int precio, String procesador, int bateria, boolean eSIM) {
        super(marca, modelo, precio);
        this.procesador = procesador;
        Bateria = bateria;
        this.eSIM = eSIM;
    }
}
