package pe.edu.ulima.promul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import pe.edu.ulima.promul.model.PromULAPI;
import pe.edu.ulima.promul.model.dto.LoginRequest;
import pe.edu.ulima.promul.model.dto.LoginResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {
    ImageView iviLogo;
    EditText eteUsuario, etePassword;
    Button butLogin;
    private PromULAPI service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        iviLogo = (ImageView) findViewById(R.id.iviLogo);
        eteUsuario = (EditText) findViewById(R.id.eteUsuario);
        etePassword = (EditText) findViewById(R.id.etePassword);
        butLogin = (Button) findViewById(R.id.butLogin);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(PromULAPI.class);

        butLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = eteUsuario.getText().toString();
                String password = etePassword.getText().toString();

                LoginRequest loginRequest = new LoginRequest();
                loginRequest.setUsuario(usuario);
                loginRequest.setPassword(password);

                Call<LoginResponse> loginResponseCall = service.obtenerLogeo(loginRequest);

                loginResponseCall.enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                        LoginResponse lp = response.body();
                        String mensaje = lp.getMsg();

                        if(mensaje.equalsIgnoreCase("Error")){
                            Toast.makeText(getApplicationContext(),mensaje, Toast.LENGTH_SHORT).show();
                        }else{
                            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {

                    }
                });
            }
        });
    }
}
