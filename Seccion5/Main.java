package Entregas.Java__OpenBootcamp.Seccion5;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        Coche coche1 = new Coche("Toyota","Hilux","Blanco");
        Coche coche2 = new Coche("Hyundai","Tucson","Rojo");

        cocheCRUD.save(coche1);
        cocheCRUD.save(coche2);

        String x = cocheCRUD.finAll().toString();
        System.out.println(x);

    }
}
