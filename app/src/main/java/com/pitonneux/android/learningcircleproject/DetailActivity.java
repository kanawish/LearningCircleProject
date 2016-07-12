package com.pitonneux.android.learningcircleproject;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by kanawish on 2016-07-12.
 */

public class DetailActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        TextView textView = (TextView) findViewById(R.id.textView);

        int ourHardcodedCity = 0 ;

        String cityName = DataClass.cityNames[ourHardcodedCity];
        textView.setText(cityName);
    }

}
