package com.parking.parkingdude.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.parking.parkingdude.R;

/**
 * Created by root on 1/17/17.
 */

public class FragmentWelcomeInf extends Fragment {
    TextView textView;
    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcom_info, container, false);
        textView = (TextView) view.findViewById(R.id.text_inf);
        imageView = (ImageView) view.findViewById(R.id.info);

     //   textView.setText(getArguments().getString("id1"));
       // imageView.setImageResource(getArguments().getInt("id2"));

        return view;

    }
}
