package com.example.uilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LibraryActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView textView;
    Double number1,number2,sum;
    String firstnum,secondnum;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        et1 = (EditText) findViewById(R.id.firstnumber);
        et2 = (EditText) findViewById(R.id.secondnumber);
//        textView = (TextView) findViewById(R.id.showresult);
        button = (Button) findViewById(R.id.addbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addition();
            }
        });
    }
        private void addition() {
        firstnum = et1.getText().toString();
        secondnum = et2.getText().toString();
        if (firstnum.equals("")){
            et1.requestFocus();
            et1.setError("Empty");
            return;
        }
        if (secondnum.equals("")){
            et2.requestFocus();
            et2.setError("Empty");
            return;
        }else {
            number1 = Double.parseDouble(et1.getText().toString());
            number2 = Double.parseDouble(et2.getText().toString());
            sum = number1+number2;
//            textView.setText(Double.toString(sum));
            Toast.makeText(LibraryActivity.this, "Answer is: "+sum, Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}