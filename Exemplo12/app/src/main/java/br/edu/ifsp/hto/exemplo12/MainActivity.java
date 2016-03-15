package br.edu.ifsp.hto.exemplo12;

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

    public void onClickBtAutoCompleteView(View view) {
        Intent intent = new Intent(this, AutoCompleteViewActivity.class);
        startActivity(intent);
    }

    public void onClickBtAdapterInflateActivity(View view) {
        Intent intent = new Intent(this, AdapterInflateActivity.class);
        startActivity(intent);
    }

    public void onClickBtImageButtonActivity(View view) {
        Intent intent = new Intent(this, ImageButtonActivity.class);
        startActivity(intent);
    }

    public void onClickBtCheckToggleButtonActivity(View view) {
        Intent intent = new Intent(this, CheckButtonActivity.class);
        startActivity(intent);
    }
}
