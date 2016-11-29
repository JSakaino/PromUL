package pe.edu.ulima.promul.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sodm on 11/28/2016.
 */

public class GestorTipoPromo {

    public List<TipoPromo> listarTipoPromos(){
        List<TipoPromo> tipoPromos = new ArrayList<>();
        //Aca se consulta a la BD
        tipoPromos.add(new TipoPromo("Restaurante","http://www.todoperros.com/wp-content/uploads/2016/08/perro.jpg"));
        tipoPromos.add(new TipoPromo("Viajes","http://www.todoperros.com/wp-content/uploads/2016/08/perro.jpg"));
        return tipoPromos;
    }
}
