package br.edu.ifsp.hto.exemplo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //G: Método invocado quando o botão é clicado
    public void onClickBtBotao(View v){
        Toast.makeText(this, "Olá Android!", Toast.LENGTH_LONG).show();
    }
}
