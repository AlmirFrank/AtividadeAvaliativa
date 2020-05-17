package com.example.atividadeavaliativa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     private EditText editAtivo;
     private EditText editLucroLiquido;
     private EditText editPatrimonioLiquido;
     private EditText editAcoesBolsa;
     private EditText editPrecoAtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAtivo = (EditText) findViewById(R.id.editAtivo);
        editLucroLiquido = (EditText) findViewById(R.id.editLucroLiquido);
        editPatrimonioLiquido = (EditText) findViewById(R.id.editPatrimonioLiquido);
        editAcoesBolsa = (EditText) findViewById(R.id.editAcoesBolsa);
        editPrecoAtual = (EditText) findViewById(R.id.editPrecoAtual);

        String editA = editAtivo.getText().toString();
        String editLL = editLucroLiquido.getText().toString();
        String editPL = editPatrimonioLiquido.getText().toString();
        String editAB = editAcoesBolsa.getText().toString();
        String editPA = editPrecoAtual.getText().toString();

    }

    public void CalcularIndicadores(View v) {

        String ativo = editAtivo.getText().toString();
        double lucroLiquido = Double.parseDouble(editLucroLiquido.getText().toString());
        double patrimonioLiquido = Double.parseDouble(editPatrimonioLiquido.getText().toString());
        double precoAtual = Double.parseDouble(editPrecoAtual.getText().toString());
        long acoesBolsa = Long.parseLong(editAcoesBolsa.getText().toString());


        double LPA = lucroLiquido/precoAtual;
        double PL = acoesBolsa/LPA;
        double ROE = (lucroLiquido/patrimonioLiquido) * 100;
        double VPA = patrimonioLiquido/precoAtual;
        double PVP = acoesBolsa/VPA;

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle parametros = new Bundle();

        parametros.putString("ativo", ativo);
        parametros.putDouble("lpa", LPA);
        parametros.putDouble("pl", PL);
        parametros.putDouble("roe", ROE);
        parametros.putDouble("vpa", VPA);
        parametros.putDouble("pvp", PVP);

        intent.putExtras(parametros);
        startActivity(intent);
    }

    public void LimparCampos(View v) {

        editAtivo.setText("");
        editLucroLiquido.setText("");
        editPatrimonioLiquido.setText("");
        editAcoesBolsa.setText("");
        editPrecoAtual.setText("");
    }

}
