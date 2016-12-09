package pe.edu.ulima.promul;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.List;

import pe.edu.ulima.promul.adapters.PromoItemAdapter;
import pe.edu.ulima.promul.model.GestorPromoItems;
import pe.edu.ulima.promul.model.beans.Promo;


public class ListadoPromoFragment extends Fragment {

    private ListView lviPromo;
    private int id;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();
        if (bundle != null){
            id = bundle.getInt("id",1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listado_promo, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        lviPromo = (ListView) getView().findViewById(R.id.lviPromo);

        List<Promo> promos = new GestorPromoItems().listarPromos(id);
        final PromoItemAdapter adapter = new PromoItemAdapter(
                promos,
                getActivity()
        );

        lviPromo.setAdapter(adapter);

        lviPromo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Promo promo = (Promo) parent.getItemAtPosition(position);

                Fragment frag = new PromoFragment();

                Bundle bundle = new Bundle();
                bundle.putString("idPormo",promo.getIdPromo());
                frag.setArguments(bundle);

                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = manager.beginTransaction();
                ft.replace(R.id.fraContenido,frag);
                ft.addToBackStack(null);
                ft.commit();

            }
        });
    }
}
