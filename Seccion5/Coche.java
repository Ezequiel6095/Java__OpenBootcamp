package Entregas.Java__OpenBootcamp.Seccion5;

public class Coche {
    String marca;
    String modelo;
    String color;

    public Coche(){

    }

    public Coche(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
