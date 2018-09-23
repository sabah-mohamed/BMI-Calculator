package com.projects.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title;
    EditText wieght;
    EditText hieght;
    Button btn;
    TextView result;
    double w,h,r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.textView01);
        wieght = findViewById(R.id.editText01);
        hieght = findViewById(R.id.editText02);
        btn = findViewById(R.id.button01);
        result = findViewById(R.id.textView02);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w= Double.parseDouble(wieght.getText().toString());
                h= Double.parseDouble(hieght.getText().toString());
                r= w/(h*h);
                result.setText("BMI is " + r);


            }
        });
    }
}
