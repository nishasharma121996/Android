package com.example.nisha.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText,passwordEditText;
    Button submitButton,cancelbButton;
    TextView resultvTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        submitButton = (Button) findViewById(R.id.submitButton);
        cancelbButton = (Button) findViewById(R.id.cancelButton);
        resultvTextView = (TextView) findViewById(R.id.resultTextView);

        submitButton .setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick (View view) {


                    String name = nameEditText.getText().toString();
                    String password = passwordEditText.getText().toString();//isempty()
                    if (name.length() == 0) {
                        nameEditText.requestFocus();
                        nameEditText.setError("Field cannot be blank");
                    } else if (!name.matches("[a-z A-z]+")) {
                        nameEditText.requestFocus();
                        nameEditText.setError("enter only alphabetical charater");
                    } else if (password.length() == 0) {
                        passwordEditText.requestFocus();
                        passwordEditText.setError("field cannot be blank");
                    } else {
                        resultvTextView.setText("WELCOME " + name + "\n" + password);

                    }
                }
                        });
               cancelbButton.setOnClickListener(new View.OnClickListener()
                  {
            @Override
            public  void onClick(View view)
            {
                nameEditText.setText("");
                passwordEditText.setText("");
                resultvTextView.setText("");
            }
        });

            }
    }
