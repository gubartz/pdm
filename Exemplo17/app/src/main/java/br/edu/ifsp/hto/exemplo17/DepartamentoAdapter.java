package br.edu.ifsp.hto.exemplo17;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import br.edu.ifsp.hto.exemplo17.domain.Departamento;

/**
 * Created by gustavohome on 31/03/2016.
 */
public class DepartamentoAdapter extends BaseAdapter{
    private final List<Departamento> departamentos;
    private final Context context;

    public DepartamentoAdapter(Context context, List<Departamento> departamentos) {
        this.departamentos = departamentos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.departamentos != null ? this.departamentos.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return this.departamentos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_departamento, parent, false);

        TextView tNome = (TextView) view.findViewById(R.id.tNome);
        TextView tLocal = (TextView) view.findViewById(R.id.tLocal);

        tNome.setText(departamentos.get(position).getNome());
        tLocal.setText(departamentos.get(position).getLocal());

        return view;
    }
}
