package br.edu.ifsp.hto.exemplo17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.edu.ifsp.hto.exemplo17.domain.Departamento;
import br.edu.ifsp.hto.exemplo17.domain.DepartamentoService;

public class ListarDepartamentos extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView mListView;
    private List<Departamento> departamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_departamentos);

        mListView = (ListView) findViewById(R.id.listView);
        departamentos = DepartamentoService.getDepartamentos(this);

        mListView.setAdapter(new DepartamentoAdapter(this, departamentos));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Departamento departamento = this.departamentos.get(position);
        Toast.makeText(this, "Opção: " + departamento.getNome(), Toast.LENGTH_LONG).show();
    }
}
