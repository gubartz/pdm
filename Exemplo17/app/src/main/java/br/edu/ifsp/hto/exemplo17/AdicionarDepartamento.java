package br.edu.ifsp.hto.exemplo17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.hto.exemplo17.domain.Departamento;
import br.edu.ifsp.hto.exemplo17.domain.DepartamentoService;

public class AdicionarDepartamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_departamento);
    }

    public void onClickBtGravar(View view) {
        Departamento departamento = new Departamento();

        String nome = ((EditText) findViewById(R.id.edNome)).getText().toString();
        String local = ((EditText) findViewById(R.id.edLocal)).getText().toString();

        departamento.setNome(nome);
        departamento.setLocal(local);

        List<Departamento> departamentos = new ArrayList<Departamento>();
        departamentos.add(departamento);

        DepartamentoService.salvarDepartamento(this, departamentos);
        finish();
    }
}
