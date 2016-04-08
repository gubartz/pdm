package br.edu.ifsp.hto.exemplo18.domain;

import com.orm.SugarRecord;

/**
 * Created by gustavohome on 31/03/2016.
 */
public class Departamento extends SugarRecord{
    private String nome;
    private String local;

    public Departamento(){};

    public Departamento(String nome, String local) {
        this.local = local;
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
