package br.edu.ifsp.hto.exemplo12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gustavohome on 10/03/2016.
 */
public class Opcao {
    public String descricao;
    public int img;

    public Opcao(String descricao, int img) {
        this.descricao = descricao;
        this.img = img;
    }

    public static List<Opcao> getOpcoes(){
        List<Opcao> opcoes = new ArrayList<Opcao>();
        opcoes.add(new Opcao("Facebook", R.drawable.facebook_box));
        opcoes.add(new Opcao("Gmail", R.drawable.gmail));
        opcoes.add(new Opcao("Twitter", R.drawable.twitter_box));
        opcoes.add(new Opcao("Whatsapp", R.drawable.whatsapp));

        return opcoes;
    }
}
