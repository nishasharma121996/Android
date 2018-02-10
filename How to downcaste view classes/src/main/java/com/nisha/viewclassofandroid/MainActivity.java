package com.nisha.viewclassofandroid;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text, text1,text2;
    EditText edit,edit1,edit2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.text);
        text1=(TextView)findViewById(R.id.text1);
        text2 =(TextView)findViewById(R.id.text2);

        edit =(EditText)findViewById(R.id.edit);
        edit1 =(EditText)findViewById(R.id.edit1);
        edit2 =(EditText)findViewById(R.id.edit2);

        button =(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


             Intent intent = new Intent(MainActivity.this,welcome.class);
             startActivity(intent);

            }
        });
    }


}
