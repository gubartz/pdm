package br.edu.ifsp.hto.exemplo19;

import android.content.Context;
import android.os.AsyncTask;
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

public class DepartamentoTask extends AsyncTask<Void, Void, List<Departamento>> {
    private final RecyclerView recyclerView;
    private final Context context;

    public DepartamentoTask(Context context, RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        this.context = context;
    }

    @Override
    protected List<Departamento> doInBackground(Void... params) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.6:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DepartamentoService service = retrofit.create(DepartamentoService.class);
        Call<List<Departamento>> call = service.listDepartamentos();

        try {
            Response<List<Departamento>> response = call.execute();
            List<Departamento> list = response.body();
            for(Departamento dep : list){
                Log.d("Saida", dep.getNome());
                Log.d("Saida", dep.getLocal());
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected void onPostExecute(List<Departamento> departamentos) {
        Log.d("Saida", "" + departamentos.size());

        if(departamentos != null){
            recyclerView.setAdapter(new DepartamentoAdapter(context, departamentos));
        }
    }
}
