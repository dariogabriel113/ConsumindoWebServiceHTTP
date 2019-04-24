package com.dariogabriellsilva.consumindowebservicehttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dariogabriellsilva.consumindowebservicehttp.model.CEP;
import com.dariogabriellsilva.consumindowebservicehttp.services.HTTPService;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText cep = findViewById(R.id.etMain_cep);
        final TextView reposta = findViewById(R.id.etMain_resposta);

        Button btnBuscarCep = findViewById(R.id.btnMain_buscarCep);

        btnBuscarCep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    CEP retorno = new HTTPService(cep.getText().toString()).execute().get();
                    reposta.setText(retorno.toString());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
