package br.edu.ifsp.hto.exemplo17.domain;

import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by gustavohome on 31/03/2016.
 */
public class DepartamentoService {
    private static final String TAG = "service";

    public static List<Departamento> getDepartamentos(Context context){
        List<Departamento> departamentos = getDepartamentosFromBanco(context);

        return departamentos;
    }

    public static List<Departamento> getDepartamentosFromBanco(Context context){
        DepartamentoDB db = new DepartamentoDB(context);
        try{
            List<Departamento> departamentos = db.findAll();
            Log.d(TAG, "Retornando " + departamentos.size() + " departamentos");
            return departamentos;
        }finally {
            db.close();
        }
    }

    public static void salvarDepartamento(Context context, List<Departamento> departamentos){
        DepartamentoDB db = new DepartamentoDB(context);
        try{
            for(Departamento departamento : departamentos){
                Log.d(TAG, "Salvando departamento " + departamento.getNome());
                db.save(departamento);
            }
        }finally {
            db.close();
        }
    }
}
