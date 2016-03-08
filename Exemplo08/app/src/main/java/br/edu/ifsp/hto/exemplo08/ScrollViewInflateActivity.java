package br.edu.ifsp.hto.exemplo08;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ScrollViewInflateActivity extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.scrollview);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);

        for (int i = 0; i <= 100; i++) {
            LayoutInflater inflater = LayoutInflater.from(context);
            TextView textView = (TextView) inflater.inflate(R.layout.inflate_textview, layout, false);
            textView.setText("Texto: " + i);
            layout.addView(textView);
        }
    }
}
