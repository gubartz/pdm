package br.edu.ifsp.hto.exemplo20.domain;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gustavohome on 08/05/2016.
 */
public interface FuncionarioService {

    @GET("funcionario/list")
    Call<List<Funcionario>> listFuncionario();
}
