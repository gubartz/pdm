package br.edu.ifsp.hto.exemplo03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtSomar(View v){
        EditText tNumero1 = (EditText) findViewById(R.id.tNumero1);
        EditText tNumero2 = (EditText) findViewById(R.id.tNumero2);

        Double numero1    = Double.parseDouble(tNumero1.getText().toString());
        Double numero2    = Double.parseDouble(tNumero2.getText().toString());
        double resultado  = numero1 + numero2;
        String sResultado = Double.toString(resultado);

        TextView tResultado = (TextView) findViewById(R.id.tvResultado);

        sResultado = getString(R.string.resultado) + ": " + sResultado;

        tResultado.setText(sResultado);
    }
}
