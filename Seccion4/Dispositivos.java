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
        this.precio = precio;
        this.ip68 = false;
        if(precio > 1000){
            System.out.println("Tiene cargador y Se puede surmergir");
            ip68=true;
        }else{
            System.out.println("No tiene cargador y No se puede sumergir");
        }
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
