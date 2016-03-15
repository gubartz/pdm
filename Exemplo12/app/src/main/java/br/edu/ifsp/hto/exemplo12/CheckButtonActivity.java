package br.edu.ifsp.hto.exemplo12;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;

public class CheckButtonActivity extends AppCompatActivity {
    private HashSet<String> esportes = new HashSet<String>();
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_button);
    }

    public void onClickBtTestar(View view) {
        LinearLayout layout = (LinearLayout) findViewById(R.id.selecionados);
        layout.removeAllViews();

        for (String esporte : esportes) {
            LayoutInflater inflater = getLayoutInflater().from(this);
            TextView tv = (TextView) inflater.inflate(R.layout.inflate_textview, layout, false);
            tv.setText(esporte);
            layout.addView(tv);
        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.natacao:
                if (checked)
                    esportes.add("Natação");
                else
                    esportes.remove("Natação");
                break;
            case R.id.futebol:
                if (checked)
                    esportes.add("Futebol");
                else
                    esportes.remove("Futebol");
                break;
            case R.id.volei:
                if (checked)
                    esportes.add("Volei");
                else
                    esportes.remove("Volei");
                break;
        }
    }
}
