package com.example.ndktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ndk_test_tv;
    private Button ndk_test_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ndk_test_tv = (TextView) findViewById(R.id.ndk_test_tv);
        ndk_test_bt = (Button) findViewById(R.id.ndk_test_bt);
        ndk_test_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Load load = new Load();
                int r = load.addInt(5,3);
                ndk_test_tv.setText("C++库里计算的结果是：5+3="+r);
            }
        });
    }
}
