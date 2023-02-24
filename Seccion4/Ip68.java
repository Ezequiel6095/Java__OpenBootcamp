package Entregas.Java__OpenBootcamp.Seccion4;
/*
*Se trata de llamar a esta funcion dentro de un constructor, pero se desconoce como hacerlo.
*/
public class Ip68 extends Dispositivos{
   public void cargador(int precio){
        this.precio = precio;
        if(precio > 1000){
            System.out.println("Tiene cargador");
            System.out.println("Se puede surmergir");
        }else{
            System.out.println("No tiene cargador");
            System.out.println("No se puede sumergir");
        }
    }
}

