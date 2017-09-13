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
    double firstInput;
    String functionType;


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
        Button btnDivide = (Button) findViewById(R.id.btnDivide);
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnSubtract = (Button) findViewById(R.id.btnSubtract);
        Button btnEquals = (Button) findViewById(R.id.btnEquals);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        Button btnModulo = (Button) findViewById(R.id.btnModulo);

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
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnModulo.setOnClickListener(this);

        txtInput = (EditText) findViewById(R.id.txtInput);
        txtView = (TextView) findViewById(R.id.txtPreviousInput);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOne:
                inputText += "1";
                txtInput.setText(inputText);
                break;
            case R.id.btnTwo:
                inputText += "2";
                txtInput.setText(inputText);
                break;
            case R.id.btnThree:
                inputText += "3";
                txtInput.setText(inputText);
                break;
            case R.id.btnFour:
                inputText += "4";
                txtInput.setText(inputText);
                break;
            case R.id.btnFive:
                inputText += "5";
                txtInput.setText(inputText);
                break;
            case R.id.btnSix:
                inputText += "6";
                txtInput.setText(inputText);
                break;
            case R.id.btnSeven:
                inputText += "7";
                txtInput.setText(inputText);
                break;
            case R.id.btnEight:
                inputText += "8";
                txtInput.setText(inputText);
                break;
            case R.id.btnNine:
                inputText += "9";
                txtInput.setText(inputText);
                break;
            case R.id.btnZero:
                inputText += "0";
                txtInput.setText(inputText);
                break;
            case R.id.btnDivide:
                firstInput = Double.parseDouble(inputText);
                functionType = "/";
                String displayDivide = inputText + functionType;
                txtView.setText(displayDivide);
                txtInput.setText("");
                inputText = "";
                break;
            case R.id.btnMultiply:
                firstInput = Double.parseDouble(inputText);
                functionType = "*";
                String displayMultiply = inputText + functionType;
                txtView.setText(displayMultiply);
                txtInput.setText("");
                inputText = "";
                break;
            case R.id.btnAdd:
                firstInput = Double.parseDouble(inputText);
                functionType = "+";
                String displayAdd = inputText + functionType;
                txtView.setText(displayAdd);
                txtInput.setText("");
                inputText = "";
                break;
            case R.id.btnSubtract:
                firstInput = Double.parseDouble(inputText);
                functionType = "-";
                String displaySubtract = inputText + functionType;
                txtView.setText(displaySubtract);
                txtInput.setText("");
                inputText = "";
                break;
            case R.id.btnModulo:
                firstInput = Double.parseDouble(inputText);
                functionType = "%";
                String displayModulo = inputText + functionType;
                txtView.setText(displayModulo);
                txtInput.setText("");
                inputText = "";
                break;
            case R.id.btnEquals:
                Double input = Double.parseDouble(inputText);
                Double calculated = calculate(firstInput, input, functionType);
                txtView.setText(firstInput + functionType + input+ "=");
                txtInput.setText(calculated.toString());
                firstInput = calculated;
                break;
            case R.id.btnClear:
                txtInput.setText("");
                txtView.setText("");
                inputText = "";
                break;
        }

    }

    public double calculate(double first, double second, String function) {
        double result = 0;

        switch (function) {
            case "/":
                result = first / second;
                return result;
            case "*":
                result = first * second;
                return result;
            case "+":
                result = first + second;
                return result;
            case "-":
                result = first - second;
                return result;
            case "%":
                result = first % second;
                return result;
        }



        return result;
    }
}
