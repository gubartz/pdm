package br.edu.ifsp.hto.exemplo17.domain;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gustavohome on 31/03/2016.
 */
public class DepartamentoDB extends SQLiteOpenHelper{
    private static final String TAG = "sql";
    public static final String NOME_BANCO = "empresa.sqlite";
    private static final int VERSAO_BANCO = 1;

    public DepartamentoDB(Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "Criando a Tabela dep");
        db.execSQL("CREATE TABLE dep(_id integer primary key autoincrement, nome text, local text);");
        Log.d(TAG, "Tabela dep criada com sucesso.");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //executado caso a versão do BD seja alterada
    }

    //insere ou atualiza um departamento existente
    public long save(Departamento departamento){
        long id = departamento.get_id();
        SQLiteDatabase db = getWritableDatabase();
        try{
            ContentValues values = new ContentValues();
            values.put("nome", departamento.getNome());
            values.put("local", departamento.getLocal());

            if(id != 0){
                String _id = String.valueOf(departamento.get_id());
                String[] whereArgs = new String[]{_id};
                //update do departamento
                int count = db.update("dep", values, "_id=?", whereArgs);
                return count;
            }else{
                //insere novo departamento
                id = db.insert("dep", "", values);
                return id;
            }
        }finally { //executa mesmoq ue uma exceção ocorra
            db.close();
        }
    }

    //Remove um departamento
    public int delete(Departamento departamento){
        SQLiteDatabase db = getWritableDatabase();
        try{
            int count = db.delete("dep", "_id=?", new String[]{String.valueOf(departamento.get_id())});
            Log.i(TAG, "Departamento removido");
            return count;
        }finally {
            db.close();
        }
    }

    //Adicionar código para remover um departamento de um determinado local

    public List<Departamento> findAll(){
        SQLiteDatabase db = getWritableDatabase();
        try{
            Cursor c = db.query("dep", null, null, null, null, null, null, null);
            return toList(c);
        }finally {
            db.close();
        }
    }

    private List<Departamento> toList(Cursor c){
        List<Departamento> departamentos = new ArrayList<Departamento>();
        if(c.moveToFirst()){
            do{
                Departamento departamento = new Departamento();
                departamentos.add(departamento);

                long _id = c.getLong(c.getColumnIndex("_id"));
                String nome = c.getString(c.getColumnIndex("nome"));
                String local = c.getString(c.getColumnIndex("local"));

                departamento.set_id(_id);
                departamento.setNome(nome);
                departamento.setLocal(local);
            }while (c.moveToNext());
        }
        return departamentos;
    }

}
