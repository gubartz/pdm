package br.edu.ifsp.hto.exemplo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * G: Exemplo de uso do LogCat
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Exemplo 02";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Nível Verbose");
        Log.d(TAG, "Nível Debug");
        Log.i(TAG, "Nível Info");
        Log.w(TAG, "Nível Alerta - Warning");
        Log.e(TAG, "Log de Erro");
        Log.e(TAG, "Log de Erro", new RuntimeException("teste de erro"));
    }
}
