package br.edu.ifsp.hto.exemplo08;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtScrollView(View view) {
        Intent i = new Intent(context, ScrollViewActivity.class);
        startActivity(i);
    }

    public void onClickBtScrollViewInflate(View view) {
        Intent i = new Intent(context, ScrollViewInflateActivity.class);
        startActivity(i);
    }
}
