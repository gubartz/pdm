package br.edu.ifsp.hto.exemplo06;

import android.os.Bundle;
import android.widget.TextView;

public class SomarActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somar);

        //Outra maneira de recuperar os valores passados por argumento
        double num1, num2, resultado;
        num1 = getIntent().getDoubleExtra(MainActivity.EXTRA_NUM1, 0);
        num2 = getIntent().getDoubleExtra(MainActivity.EXTRA_NUM2, 0);
        resultado  = somar(num1, num2);
        String sResultado = Double.toString(resultado);

        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        tvResultado.setText(sResultado);
    }

    protected double somar(double num1, double num2){
        return num1 + num2;
    }
}
