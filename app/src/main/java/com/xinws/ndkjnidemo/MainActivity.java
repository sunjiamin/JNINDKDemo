package com.xinws.ndkjnidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.xinws.ndkjnidemo.ndk.NdkUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(NdkUtils.getStringFormC());
    }
}
