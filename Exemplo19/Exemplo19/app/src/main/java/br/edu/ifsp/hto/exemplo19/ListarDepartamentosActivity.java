package br.edu.ifsp.hto.exemplo19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.IOException;
import java.util.List;

import br.edu.ifsp.hto.exemplo19.domain.Departamento;
import br.edu.ifsp.hto.exemplo19.domain.DepartamentoService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListarDepartamentosActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Departamento> departamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_departamentos);

        //RecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setHasFixedSize(true);

        taskDepartamento();
    }

    private void taskDepartamento(){
        new DepartamentoTask(this, mRecyclerView).execute();
    }
}
