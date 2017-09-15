package com.example.tysonlove.tip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {

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
    }
}
