package com.example.atividadeavaliativa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Declara os objetos que serão associados aos elementos de tela
    TextView edATIVO;
    TextView edLPA;
    TextView edPL;
    TextView edROE;
    TextView edVPA;
    TextView edPVP;
    TextView tvATIVO;
    TextView tvLPA;
    TextView tvPL;
    TextView tvROE;
    TextView tvVPA;
    TextView tvPVP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvATIVO = findViewById(R.id.tvATIVO);
        TextView tvLPA = findViewById(R.id.tvLPA);
        TextView tvPL = findViewById(R.id.tvPL);
        TextView tvROE = findViewById(R.id.tvROE);
        TextView tvVPA = findViewById(R.id.tvVPA);
        TextView tvPVP = findViewById(R.id.tvPVP);

        TextView edATIVO = findViewById(R.id.edATIVO);
        TextView edLPA = findViewById(R.id.edLPA);
        TextView edPL = findViewById(R.id.edPL);
        TextView edROE = findViewById(R.id.edROE);
        TextView edVPA = findViewById(R.id.edVPA);
        TextView edPVP = findViewById(R.id.edPVP);

        Bundle parametros = getIntent().getExtras();

        if (parametros != null) {

            String ativo = parametros.getString("ativo");
            Double lpa = parametros.getDouble("lpa");
            Double pl = parametros.getDouble("pl");
            Double roe = parametros.getDouble("roe");
            Double vpa = parametros.getDouble("vpa");
            Double pvp = parametros.getDouble("pvp");

            tvATIVO.setText(String.valueOf(ativo));
            tvLPA.setText("R$" + String.valueOf(lpa));
            tvPL.setText("R$" + String.valueOf(pl));
            tvROE.setText("R$" + String.valueOf(roe));
            tvVPA.setText("R$" + String.valueOf(vpa));
            tvPVP.setText("R$" + String.valueOf(pvp));


        }

    }

}
