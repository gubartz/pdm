package br.edu.ifsp.hto.exemplo04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

//Baseado no livro de Ricardo Lecheta
public class MainActivity extends AppCompatActivity {
    protected static final String TAG = "AULA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, getClassName() + " onCreate() chamado: " + savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, getClassName() + " onStart() chamado");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, getClassName() + " onRestart() chamado");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, getClassName() + " onResume() chamado");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, getClassName() + " onPause() chamado");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, getClassName() + " onSaveInstanceState() chamado");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, getClassName() + " onStop() chamado");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, getClassName() + " onDestroy() chamado");
    }

    private String getClassName(){
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }
}
