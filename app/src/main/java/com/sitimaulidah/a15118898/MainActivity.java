package com.sitimaulidah.a15118898;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = (Button) findViewById(R.id.submit);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText player1 = (EditText)findViewById(R.id.p1);
                EditText player2 = (EditText)findViewById(R.id.p2);

                String text1 = player1.getText().toString();
                String text2 = player2.getText().toString();

                Intent i = new Intent(MainActivity.this, Main2Activity.class );
                i.putExtra("mytext1",text1);
                i.putExtra("mytext2",text2);
                startActivity(i);

            }
        });


    }
}
