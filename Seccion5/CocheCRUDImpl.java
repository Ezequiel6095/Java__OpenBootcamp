package Entregas.Java__OpenBootcamp.Seccion5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    private List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        coches.add(coche);
    }

    @Override
    public List<Coche> finAll() {
        return coches;
    }

}

