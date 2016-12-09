package pe.edu.ulima.promul.model;

import java.util.ArrayList;
import java.util.List;

import pe.edu.ulima.promul.model.beans.TipoPromo;

/**
 * Created by sodm on 11/28/2016.
 */

public class GestorTipoPromo {

    public List<TipoPromo> listarTipoPromos(){
        List<TipoPromo> tipoPromos = new ArrayList<>();
        //Aca se consulta a la BD
        //ya no xd solo cambia imagenes
        tipoPromos.add(new TipoPromo(1,"Entretenimiento","http://www.todoperros.com/wp-content/uploads/2016/08/perro.jpg"));
        tipoPromos.add(new TipoPromo(2,"Deportes","http://www.todoperros.com/wp-content/uploads/2016/08/perro.jpg"));
        tipoPromos.add(new TipoPromo(3,"Restaurantes","http://www.todoperros.com/wp-content/uploads/2016/08/perro.jpg"));
        tipoPromos.add(new TipoPromo(4,"Ropa","http://www.todoperros.com/wp-content/uploads/2016/08/perro.jpg"));
        tipoPromos.add(new TipoPromo(5,"Viajes","http://www.todoperros.com/wp-content/uploads/2016/08/perro.jpg"));
        tipoPromos.add(new TipoPromo(6,"Idioma","http://www.todoperros.com/wp-content/uploads/2016/08/perro.jpg"));
        tipoPromos.add(new TipoPromo(7,"Salud","http://www.todoperros.com/wp-content/uploads/2016/08/perro.jpg"));
        tipoPromos.add(new TipoPromo(8,"Otros","http://www.todoperros.com/wp-content/uploads/2016/08/perro.jpg"));
        return tipoPromos;
    }
}
