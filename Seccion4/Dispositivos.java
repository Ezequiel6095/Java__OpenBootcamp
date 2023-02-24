package Entregas.Java__OpenBootcamp.Seccion4;

public abstract class Dispositivos {
    String marca;
    String modelo;
    int precio;
    boolean ip68;
    public Dispositivos(){

    }

    public Dispositivos(String marca, String modelo, int precio){
            this.marca = marca;
            this.modelo = modelo;
            this.precio = precio;
    }


    public void cargador(int precio){
    }

    @Override
    public String toString() {
        return "Dispositivos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", ip68=" + ip68 +
                '}';
    }

}
