package br.edu.ifsp.hto.exemplo05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SomarActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somar);

        Bundle args = getIntent().getExtras();

        double num1       = args.getDouble("num1");
        double num2       = args.getDouble("num2");
        double resultado  = somar(num1, num2);
        String sResultado = Double.toString(resultado);

        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        tvResultado.setText(sResultado);
    }

    protected double somar(double num1, double num2){
        return num1 + num2;
    }
}
