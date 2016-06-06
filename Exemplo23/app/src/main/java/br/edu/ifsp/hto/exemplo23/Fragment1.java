package br.edu.ifsp.hto.exemplo23;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gustavohome on 27/03/2016.
 */
public class Fragment1 extends android.support.v4.app.Fragment{
    private TextView textView;

    public static Fragment1 getInstance(int position){
        Fragment1 frag1 = new Fragment1();
        Bundle args = new Bundle();
        args.putInt("position", position);

        frag1.setArguments(args);
        return frag1;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_1, container, false);

        textView = (TextView) layout.findViewById(R.id.textView);
        Bundle bundle = getArguments();

        if(bundle != null){
            textView.setText("" + bundle.getInt("position"));
            String s = "";
            for(int i = 0; i <= 2000; i++){
                s += i;
            }
            textView.setText(s);
        }

        return layout;
    }
}
