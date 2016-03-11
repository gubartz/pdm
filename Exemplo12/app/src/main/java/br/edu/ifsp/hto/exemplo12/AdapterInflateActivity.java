package br.edu.ifsp.hto.exemplo12;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class AdapterInflateActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    final Context context = this;
    private ListView mListView;
    private List<Opcao> opcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_inflate);

        mListView = (ListView) findViewById(R.id.listView);
        opcoes = Opcao.getOpcoes();
        mListView.setAdapter(new OpcaoAdapter(context, opcoes));
        mListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Opcao opcao = this.opcoes.get(position);
        Toast.makeText(context, "Opção: " + opcao.descricao, Toast.LENGTH_LONG).show();
    }
}
