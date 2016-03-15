package br.edu.ifsp.hto.exemplo12;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ImageButtonActivity extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        //Adicionando pela API
        ImageButton button = (ImageButton) findViewById(R.id.btImageButton3);
        button.setImageResource(R.drawable.twitter_box);
    }

    public void onClickBtImageButton3(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.twitter.com"));
        startActivity(intent);
    }

    public void onClickBtImageButton2(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.gmail.com"));
        startActivity(intent);
    }

    public void onClickBtImageButton(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.facebook.com"));
        startActivity(intent);
    }
}
