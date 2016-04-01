package br.edu.ifsp.hto.exemplo17.domain;

/**
 * Created by gustavohome on 31/03/2016.
 */
public class Departamento {
    private long _id;
    private String nome;
    private String local;

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
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
