package br.edu.ifsp.hto.exemplo08;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ScrollViewActivity extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);

        for (int i = 0; i <= 100; i++) {
            TextView textView = new TextView(context);
            textView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            textView.setText("Texto: " + i);
            layout.addView(textView);
        }
    }
}
