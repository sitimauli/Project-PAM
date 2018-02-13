package com.sitimaulidah.a15118898;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private int cont1 = 0;
    private int cont2 = 0;
    private TextView sc1, sc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        sc1 = (TextView)findViewById(R.id.sc1);
        sc2 = (TextView)findViewById(R.id.sc2);


        tv1.setText(getIntent().getStringExtra("mytext1"));
        tv2.setText(getIntent().getStringExtra("mytext2"));

        Button mimus1 = (Button) findViewById(R.id.minus1);
        Button plus1 = (Button) findViewById(R.id.plus1);
        Button reset1 = (Button) findViewById(R.id.r1);
        Button mimus2 = (Button) findViewById(R.id.minus2);
        Button plus2 = (Button) findViewById(R.id.plus2);
        Button reset2 = (Button) findViewById(R.id.r2);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont1++;
                sc1.setText(String.format("%s", cont1));
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont2++;
                sc2.setText(String.format("%s", cont2));
            }
        });

        mimus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cont1 <= 0 ){
                    cont1 = 0;
                }else{
                    cont1 --;
                }
                sc1.setText(String.format("%s", cont1));
            }
        });

        mimus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cont2 <= 0){
                    cont2 = 0;
                }else{
                    cont2--;
                }
                sc2.setText(String.format("%s", cont2));
            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont1 = 0;
                sc1.setText(String.format("%s", cont1));
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont2 = 0;
                sc2.setText(String.format("%s", cont2));
            }
        });
    }
}
