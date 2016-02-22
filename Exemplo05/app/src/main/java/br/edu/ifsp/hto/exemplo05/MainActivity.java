package br.edu.ifsp.hto.exemplo05;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends DebugActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtSomar(View view) {
        EditText tNumero1 = (EditText) findViewById(R.id.tNumero1);
        EditText tNumero2 = (EditText) findViewById(R.id.tNumero2);

        Double numero1 = Double.parseDouble(tNumero1.getText().toString());
        Double numero2 = Double.parseDouble(tNumero2.getText().toString());

        Intent intent = new Intent(context, SomarActivity.class);
        Bundle params = new Bundle();
        params.putDouble("num1", numero1);
        params.putDouble("num2", numero2);
        intent.putExtras(params);
        startActivity(intent);
    }
}
