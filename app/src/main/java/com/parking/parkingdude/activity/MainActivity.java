package com.parking.parkingdude.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.parking.parkingdude.R;

/**
 * Created by root on 1/16/17.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView splash;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        splash= (ImageView) findViewById(R.id.splash);

        splash.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.splash:
                    Intent intent =new Intent(this,IndicatorActivity.class);
                    startActivity(intent);
                    break;
            }
    }
}
