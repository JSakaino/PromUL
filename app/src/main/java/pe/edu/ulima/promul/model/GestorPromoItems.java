package pe.edu.ulima.promul.model;

import java.util.ArrayList;
import java.util.List;

import pe.edu.ulima.promul.model.beans.Promo;
import pe.edu.ulima.promul.model.dto.ListadoPromoRequest;
import pe.edu.ulima.promul.model.dto.ListadoPromoResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jaime on 8/12/2016.
 */

public class GestorPromoItems {
    private PromULAPI service;

    public List<Promo> listarPromos(int idTipoPromo){
        List<Promo> list = new ArrayList<>();
        //Consulta al service
        //en ListadoPromoFragment se le pasa el id escogido para filtrar tipo de promo Ejm. Viajes
        //Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(PromULAPI.class);

        ListadoPromoRequest listadoPromoRequest = new ListadoPromoRequest();
        listadoPromoRequest.setId(idTipoPromo);

        Call<ListadoPromoResponse> listadoPromoResponseCall = service.obtenerListadoPromosPorTipo(listadoPromoRequest);

        listadoPromoResponseCall.enqueue(new Callback<ListadoPromoResponse>() {
            @Override
            public void onResponse(Call<ListadoPromoResponse> call, Response<ListadoPromoResponse> response) {
                //poner el response que debe ser una lista en la variable list
                //waaaaa
            }

            @Override
            public void onFailure(Call<ListadoPromoResponse> call, Throwable t) {

            }
        });

        return list;
    }

}
