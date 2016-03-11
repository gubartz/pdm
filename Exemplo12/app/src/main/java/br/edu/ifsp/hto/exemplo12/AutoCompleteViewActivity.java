package br.edu.ifsp.hto.exemplo12;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteViewActivity extends AppCompatActivity {
    private static final String[] CAMPI = {"Hortolândia", "Campinas", "São Paulo", "São Roque",
    "Itapetininga"};
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_view);
         AutoCompleteTextView campi = (AutoCompleteTextView) findViewById(R.id.campi);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, CAMPI);
        campi.setAdapter(adapter);
    }
}
