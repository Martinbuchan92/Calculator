package net.martinbuchan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtInput;
    TextView txtView;
    String inputText = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButtons();
    }

    public void addButtons() {
        Button btnOne = (Button) findViewById(R.id.btnOne);
        Button btnTwo = (Button) findViewById(R.id.btnTwo);
        Button btnThree = (Button) findViewById(R.id.btnThree);
        Button btnFour = (Button) findViewById(R.id.btnFour);
        Button btnFive = (Button) findViewById(R.id.btnFive);
        Button btnSix = (Button) findViewById(R.id.btnSix);
        Button btnSeven = (Button) findViewById(R.id.btnSeven);
        Button btnEight = (Button) findViewById(R.id.btnEight);
        Button btnNine = (Button) findViewById(R.id.btnNine);
        Button btnZero = (Button) findViewById(R.id.btnZero);

        Button btnClear = (Button) findViewById(R.id.btnClear);

        txtInput = (EditText) findViewById(R.id.txtInput);
        txtView = (TextView) findViewById(R.id.txtPreviousInput);


        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOne:
                inputText += "1";
                break;
            case R.id.btnTwo:
                inputText += "2";
                break;
            case R.id.btnThree:
                inputText += "3";
                break;
            case R.id.btnFour:
                inputText += "4";
                break;
            case R.id.btnFive:
                inputText += "5";
                break;
            case R.id.btnSix:
                inputText += "6";
                break;
            case R.id.btnSeven:
                inputText += "7";
                break;
            case R.id.btnEight:
                inputText += "8";
                break;
            case R.id.btnNine:
                inputText += "9";
                break;
            case R.id.btnZero:
                inputText += "0";
                break;
            case R.id.btnClear:
                txtView.setText(inputText);
                txtInput.setText("");
                inputText = "";
                break;
        }
        txtInput.setText(inputText);

    }
}
