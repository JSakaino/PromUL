package pe.edu.ulima.promul;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.List;

import pe.edu.ulima.promul.adapters.PromoAdapter;
import pe.edu.ulima.promul.model.GestorTipoPromo;
import pe.edu.ulima.promul.model.beans.TipoPromo;


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

        //click en item de tipo
        gdvPromo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Prueba
                TipoPromo tipoPromo= (TipoPromo) parent.getItemAtPosition(position);
                Toast.makeText(getActivity(), "Tipo Promo: " + tipoPromo.getTitulo() + " " + tipoPromo.getIdTipoPromo(), Toast.LENGTH_SHORT).show();
                //Aca debe dirigirse a nuevo fragment/activity y listar las promociones por tipo
                //de Promo elegido
                Fragment frag = new ListadoPromoFragment();
                //pasar el parametro escogido
                Bundle bundle = new Bundle();
                bundle.putInt("id", (int) tipoPromo.getIdTipoPromo());
                Log.i("LEEEEE", String.valueOf(tipoPromo.getIdTipoPromo()));
                frag.setArguments(bundle);
                //blabla
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = manager.beginTransaction();
                ft.replace(R.id.fraContenido,frag);
                ft.addToBackStack(null);
                ft.commit();

            }
        });
    }
}
