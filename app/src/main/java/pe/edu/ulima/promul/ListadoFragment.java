package pe.edu.ulima.promul;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import pe.edu.ulima.promul.adapters.PromoAdapter;
import pe.edu.ulima.promul.model.GestorTipoPromo;
import pe.edu.ulima.promul.model.TipoPromo;


public class ListadoFragment extends Fragment {

    private GridView gdvPromo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listado, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //crear adapter
        //instanciar adapter
        gdvPromo = (GridView) getView().findViewById(R.id.gdvTipoPromo);

        List<TipoPromo> tipoPromos = new GestorTipoPromo().listarTipoPromos();
        final PromoAdapter adapter = new PromoAdapter(
                tipoPromos,
                getActivity()
        );

        gdvPromo.setAdapter(adapter);

        gdvPromo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Prueba
                TipoPromo tipoPromo= (TipoPromo) parent.getItemAtPosition(position);
                Toast.makeText(getActivity(), "Tipo Promo: " + tipoPromo.getTitulo(), Toast.LENGTH_SHORT).show();
                //Aca debe dirigirse a nuevo fragment/activity y listar las promociones

            }
        });
    }
}
