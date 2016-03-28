package br.edu.ifsp.hto.exemplo13;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gustavohome on 27/03/2016.
 */
public class Fragment1 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        return view;
    }
}
