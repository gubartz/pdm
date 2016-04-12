package br.edu.ifsp.hto.exemplo18.domain;

import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by gustavohome on 31/03/2016.
 */
public class DepartamentoService {
    private static final String TAG = "service";

    public static void salvarDepartamento(List<Departamento> departamentos){

        for(Departamento departamento : departamentos){
            Log.d(TAG, "Salvando departamento " + departamento.getNome());
            departamento.save();
        }

    }
}
