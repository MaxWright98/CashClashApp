package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class FunctionPageActivity extends AppCompatActivity {

    private EditText inputOneFunc;
    private EditText inputTwoFunc;
    private EditText inputThreeFunc;
    private EditText inputFourFunc;

    private TextView resultTF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function_page);

        inputOneFunc = (EditText) findViewById(R.id.inputOneFunc);
        inputTwoFunc = (EditText) findViewById(R.id.inputTwoFunc);
        inputThreeFunc = (EditText) findViewById(R.id.inputThreeFunc);
        inputFourFunc = (EditText) findViewById(R.id.inputFourFunc);

        Button calculateButton = findViewById(R.id.calculateButton);

        resultTF = (TextView) findViewById(R.id.resultTF);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeCalculations();
            }
        });

    }

    private void makeCalculations() {
        double n1 = Double.valueOf(inputOneFunc.getText().toString());
        double n2 = Double.valueOf(inputTwoFunc.getText().toString());
        double n3 = Double.valueOf(inputThreeFunc.getText().toString());
        double n4 = Double.valueOf(inputFourFunc.getText().toString());

        double result = n1 + n2 + n3 + n4;

        String formatted = String.valueOf(result);

        resultTF.setText("£" + formatted);

    }

        public void toFAQ(View v) {
        startActivity(new Intent(FunctionPageActivity.this, ActivityFAQ.class));
    }

}
