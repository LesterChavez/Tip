package com.example.tysonlove.tip;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFivePercent;
    Button btnTenPercent;
    Button btnFifteenPercent;
    Button btnTwentyPercent;
    TextView txtViewBottom;
    EditText editText;
    Double money;
    Double finalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFivePercent = (Button) findViewById(R.id.btnFivePercent);
        btnTenPercent = (Button) findViewById(R.id.btnTenPercent);
        btnFifteenPercent = (Button) findViewById(R.id.btnFifteenPercent);
        btnTwentyPercent = (Button) findViewById(R.id.btnTwentyPercent);
        txtViewBottom = (TextView) findViewById(R.id.txtViewBottom);
        editText = (EditText) findViewById(R.id.editText);

        finalAmount = 1.00;

        btnFivePercent.setOnClickListener(this);
        btnTenPercent.setOnClickListener(this);
        btnFifteenPercent.setOnClickListener(this);
        btnTwentyPercent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        money = Double.parseDouble(editText.getText().toString());


        if (view.getId() == btnFivePercent.getId()){
            finalAmount = money * .05;
            finalAmount = Math.round(finalAmount *100.0) / 100.0;
            txtViewBottom.setText("$" + finalAmount.toString());
        }

        if (view.getId() == btnTenPercent.getId()){
            finalAmount = money * .10;
            finalAmount = Math.round(finalAmount *100.0) / 100.0;
            txtViewBottom.setText("$" +finalAmount.toString());
        }

        if (view.getId() == btnFifteenPercent.getId()){
            finalAmount = money * .15;
            finalAmount = Math.round(finalAmount *100.0) / 100.0;
            txtViewBottom.setText("$" + finalAmount.toString());
        }

        if (view.getId() == btnTwentyPercent.getId()){
            finalAmount = money * .20;
            finalAmount = Math.round(finalAmount *100.0) / 100.0;
            txtViewBottom.setText("$" + finalAmount.toString());
        }

    }
}
