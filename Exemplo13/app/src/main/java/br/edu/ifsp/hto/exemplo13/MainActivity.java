package br.edu.ifsp.hto.exemplo13;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Exemplo: Recuperando o FragmentManager
        FragmentManager fm = getFragmentManager();

        //Adicionando o Fragment 2 pela API
        if(savedInstanceState == null) {
            FragmentTransaction ft = fm.beginTransaction();
            Fragment2 frag2 = new Fragment2();
            ft.add(R.id.layoutFrag, frag2, "Fragment2");
            ft.commit();
        }
    }
}
