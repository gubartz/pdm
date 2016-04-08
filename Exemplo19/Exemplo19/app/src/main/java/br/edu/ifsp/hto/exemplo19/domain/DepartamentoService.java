package br.edu.ifsp.hto.exemplo19.domain;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DepartamentoService {
    @GET("departamento/list")
    Call<List<Departamento>> listDepartamentos();
}
