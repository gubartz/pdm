package br.edu.ifsp.hto.exemplo09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvNumero1, tvNumero2, tvResultado;
    EditText etNumero1, etNumero2;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        layout.setPadding(16, 16, 16, 16);

        tvNumero1 = new TextView(this);
        tvNumero1.setText(getString(R.string.numero, 1));
        tvNumero1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

        tvNumero2 = new TextView(this);
        tvNumero2.setText(getString(R.string.numero, 2));
        tvNumero2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

        etNumero1 = new EditText(this);
        etNumero1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        etNumero1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);

        etNumero2 = new EditText(this);
        etNumero2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        Button btSomar = new Button(this);
        btSomar.setText(getString(R.string.somar));
        btSomar.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickBtSomar(v);
            }
        });

        tvResultado = new TextView(this);

        layout.addView(tvNumero1);
        layout.addView(etNumero1);
        layout.addView(tvNumero2);
        layout.addView(etNumero2);
        layout.addView(btSomar);
        layout.addView(tvResultado);

        setContentView(layout);
    }

    private void onClickBtSomar(View v){
        double n1 = Double.parseDouble(etNumero1.getText().toString());
        double n2 = Double.parseDouble(etNumero2.getText().toString());

        double resultado = n1 + n2;
        String sResultado = Double.toString(resultado);

        tvResultado.setText(sResultado);
    }
}
