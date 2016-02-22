package br.edu.ifsp.hto.exemplo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btBotao2 = (Button) findViewById(R.id.btBotao2);
        btBotao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickBtBotao(v);
            }
        });

    }

    //G: Método invocado quando o botão é clicado
    public void onClickBtBotao(View v){
        Toast.makeText(this, "Olá Android!", Toast.LENGTH_LONG).show();
    }

}
