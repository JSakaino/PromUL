package pe.edu.ulima.promul.model;

import pe.edu.ulima.promul.model.dto.ListadoPromoRequest;
import pe.edu.ulima.promul.model.dto.ListadoPromoResponse;
import pe.edu.ulima.promul.model.dto.LoginRequest;
import pe.edu.ulima.promul.model.dto.LoginResponse;
import pe.edu.ulima.promul.model.dto.PromoRequest;
import pe.edu.ulima.promul.model.dto.PromoResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Jaime on 8/12/2016.
 */

public interface PromULAPI {

    @POST("usuario/login")
    Call<LoginResponse> obtenerLogeo(@Body LoginRequest loginRequest);

    @POST("sdfsdf/sdfsdf")
    Call<ListadoPromoResponse> obtenerListadoPromosPorTipo(@Body ListadoPromoRequest listadoPromoRequest);

    @POST("sdfsdf/sdfsdf")
    Call<PromoResponse> obtenerPromoPorId(@Body PromoRequest promoRequest);
}
