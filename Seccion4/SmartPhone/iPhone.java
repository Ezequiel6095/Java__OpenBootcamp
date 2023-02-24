package Entregas.Java__OpenBootcamp.Seccion4.SmartPhone;

import Entregas.Java__OpenBootcamp.Seccion4.Dispositivos;

public class iPhone extends Dispositivos {
    String procesador;
    int capacidad;
    int bateria;
    public iPhone() {

    }

    public iPhone(String marca, String modelo, int precio, String procesador, int capacidad, int bateria) {
        super(marca, modelo, precio);
        this.procesador = procesador;
        this.capacidad = capacidad;
        this.bateria = bateria;
    }
}
