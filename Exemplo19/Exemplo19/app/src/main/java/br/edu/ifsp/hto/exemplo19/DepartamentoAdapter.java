package br.edu.ifsp.hto.exemplo19;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.edu.ifsp.hto.exemplo19.domain.Departamento;

public class DepartamentoAdapter extends RecyclerView.Adapter<DepartamentoAdapter.DepartamentoViewHolder> {
    private final List<Departamento> departamentos;
    private final Context context;

    public DepartamentoAdapter(Context context, List<Departamento> departamentos) {
        this.context = context;
        this.departamentos = departamentos;
    }

    @Override
    public DepartamentoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Cria uma subclasse de RecyclerView.ViewHolder
        //Infla a view
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_departamento, parent, false);

        //Cria a subclasse do ViewHolder
        DepartamentoViewHolder holder = new DepartamentoViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(DepartamentoViewHolder holder, int position) {
        //Recebe o índice do elemento e atualiza as views dentro do holder
        Departamento departamento = departamentos.get(position);

        //Atualiza os valores nas views
        holder.tNomeDep.setText(departamento.getNome());
        holder.tLocalDep.setText(departamento.getLocal());
    }

    @Override
    public int getItemCount() {
        return this.departamentos != null ? this.departamentos.size() : 0;
    }

    //Subclasse de RecyclerView.ViewHolder. Contém todas as views
    public static class DepartamentoViewHolder extends RecyclerView.ViewHolder {
        public TextView tNomeDep;
        public TextView tLocalDep;
        private View view;

        public DepartamentoViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;

            tNomeDep = (TextView) itemView.findViewById(R.id.tNomeDep);
            tLocalDep = (TextView) itemView.findViewById(R.id.tLocalDep);
        }
    }
}
