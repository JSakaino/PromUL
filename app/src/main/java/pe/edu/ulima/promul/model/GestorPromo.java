package pe.edu.ulima.promul.model;

import pe.edu.ulima.promul.model.beans.Promo;
import pe.edu.ulima.promul.model.dto.PromoRequest;
import pe.edu.ulima.promul.model.dto.PromoResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

/**
 * Created by Jaime on 9/12/2016.
 */

public class GestorPromo {
    private PromULAPI service;

    public Promo listarPromo(String idPromo){
        Promo promo = new Promo();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(PromULAPI.class);

        PromoRequest promoRequest = new PromoRequest();
        promoRequest.setIdPromo(idPromo);

        Call<PromoResponse> promoResponseCall = service.obtenerPromoPorId(promoRequest);

        promoResponseCall.enqueue(new Callback<PromoResponse>() {
            @Override
            public void onResponse(Call<PromoResponse> call, Response<PromoResponse> response) {
                //agregar el response a variables del objeto, asignarlos al objeto promo y retornarlo

            }

            @Override
            public void onFailure(Call<PromoResponse> call, Throwable t) {

            }
        });
        //se retorna
        return promo;
    }
}
