package com.example.kelvin.calculatorsci;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;


public class MainActivity extends AppCompatActivity {
    private EditText op1;
    private EditText op2;
    private Button btnadd;
    private Button btnsub;
    private Button btnmul;
    private Button btndiv;
    private Button btnclr;
    private TextView txtresult;
    Boolean isTrue;
    String number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op1 = (EditText) findViewById(R.id.editText);
        op2 = (EditText) findViewById(R.id.editText1);
        btnadd = (Button) findViewById(R.id.btnAdd);
        btnsub = (Button) findViewById(R.id.btnSub);
        btnmul = (Button) findViewById(R.id.btnMul);
        btndiv = (Button) findViewById(R.id.btnDiv);
        btnclr = (Button) findViewById(R.id.btnClr);
        txtresult = (TextView) findViewById(R.id.result);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate3();
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate1();
                }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate2();
            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

    }
        public void validate() {
            number1 = op1.getText().toString().trim();
            number2 = op2.getText().toString().trim();
                if (TextUtils.isEmpty(number1)) {
                    op1.requestFocus();
                    op1.setError("Number is required!");
                } else if (TextUtils.isEmpty(number2)) {
                    op2.requestFocus();
                    op2.setError("Number 2 is required!");
                } else {
                    add();
                }
            }
        public void validate1() {
            number1 = op1.getText().toString().trim();
            number2 = op2.getText().toString().trim();
            if (TextUtils.isEmpty(number1)) {
                op1.requestFocus();
                op1.setError("Number is required!");
            } else if (TextUtils.isEmpty(number2)) {
                op2.requestFocus();
                op2.setError("Number 2 is required!");
            } else {
                multiply();
            }
    }
        public void validate2() {
            number1 = op1.getText().toString().trim();
            number2 = op2.getText().toString().trim();
            if (TextUtils.isEmpty(number1)) {
                op1.requestFocus();
                op1.setError("Number is required!");
            } else if (TextUtils.isEmpty(number2)) {
                op2.requestFocus();
                op2.setError("Number 2 is required!");
            } else {
                divide();
            }
        }
        public void validate3() {
            number1 = op1.getText().toString().trim();
            number2 = op2.getText().toString().trim();
            if (TextUtils.isEmpty(number1)) {
                op1.requestFocus();
                op1.setError("Number is required!");
            } else if (TextUtils.isEmpty(number2)) {
                op2.requestFocus();
                op2.setError("Number 2 is required!");
            } else {
                subtract();
            }
        }
        public void add() {
            double sum = (Double.parseDouble(number1)) + (Double.parseDouble(number2));
            double result = sum;
            txtresult.setText(Double.toString(result));
        }
        public void subtract() {
        double minus = (Double.parseDouble(number1)) - (Double.parseDouble(number2));
        double result2 = minus;
        txtresult.setText(Double.toString(result2));
    }
        public void multiply()
        public void divide(){
            double divide = (Double.parseDouble(number1)) / (Double.parseDouble(number2));{
                double multiply = (Double.parseDouble(number1)) * (Double.parseDouble(number2));
                double result3 = multiply;
                txtresult.setText(Double.toString(result3));
            }
            double result4 = divide;
            txtresult.setText(Double.toString(result4));
        }
        public void clear(){
            op1.setText(" ");
            op2.setText(" ");
            txtresult.setText(" ");
        }
    }


