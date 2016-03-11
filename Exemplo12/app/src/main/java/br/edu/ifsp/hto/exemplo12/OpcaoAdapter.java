package br.edu.ifsp.hto.exemplo12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gustavohome on 10/03/2016.
 */
public class OpcaoAdapter extends BaseAdapter{
    private final Context context;
    private final List<Opcao> opcoes;

    public OpcaoAdapter(Context context, List<Opcao> opcoes){
        super();
        this.context = context;
        this.opcoes = opcoes;
    }

    @Override
    public int getCount() {
        return opcoes != null ? opcoes.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return opcoes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_opcao, parent, false);
        TextView t = (TextView) view.findViewById(R.id.tDescricao);
        ImageView img = (ImageView) view.findViewById(R.id.imgOpcao);

        Opcao opcao = opcoes.get(position);
        t.setText(opcao.descricao);
        img.setImageResource(opcao.img);

        return view;
    }
}
