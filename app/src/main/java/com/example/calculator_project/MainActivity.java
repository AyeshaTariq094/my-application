package com.example.calculator_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView res;
    private EditText edittext1, editText2;
    private Button calculate, Add, Sub, Multi, Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate=(Button)findViewById(R.id.calculate);
        Add=(Button)findViewById(R.id.Add);
        Sub=(Button)findViewById(R.id.Sub);
        Multi=(Button)findViewById(R.id.Multi);
        Div=(Button)findViewById(R.id.Div);
        edittext1=(EditText)findViewById(R.id.edittext1);
        editText2=(EditText)findViewById(R.id.edittext2);
        res=(TextView)findViewById(R.id.res);
        Add.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       if (editText2.getText().toString().equals("0")) {
                                           Toast.makeText(MainActivity.this, "Enter number otherthan 0", Toast.LENGTH_SHORT).show();
                                       } else {
                                           edittext1.getText().toString();
                                           editText2.getText().toString();
                                           double a1 = Double.valueOf(edittext1.getText().toString());
                                           double a2 = Double.valueOf(editText2.getText().toString());
                                           double a3 = a1 + a2;
                                           res.setText(String.valueOf(a3));
                                       }
                                   }
                               });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText2.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "Enter number otherthan 0", Toast.LENGTH_SHORT).show();
                }
                else{
                    edittext1.getText().toString();
                    editText2.getText().toString();
                    double a1=Double.valueOf(edittext1.getText().toString());
                    double a2=Double.valueOf(editText2.getText().toString());
                    double a3=a1-a2;
                    res.setText(String.valueOf(a3));

                }
            }
        });
        Multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText2.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "Enter number otherthan 0", Toast.LENGTH_SHORT).show();
                }
                else{
                    edittext1.getText().toString();
                    editText2.getText().toString();
                    double a1=Double.valueOf(edittext1.getText().toString());
                    double a2=Double.valueOf(editText2.getText().toString());
                    double a3=a1*a2;
                    res.setText(String.valueOf(a3));

                }
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText2.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "Enter number otherthan 0", Toast.LENGTH_SHORT).show();
                }
                else{
                    edittext1.getText().toString();
                    editText2.getText().toString();
                    double a1=Double.valueOf(edittext1.getText().toString());
                    double a2=Double.valueOf(editText2.getText().toString());
                    double a3=a1/a2;
                    double a4=a1%a2;
                    res.setText(res.getText().toString()+a3+" "+"R:"+" "+a4);

                }
            }
        });
    }
}


