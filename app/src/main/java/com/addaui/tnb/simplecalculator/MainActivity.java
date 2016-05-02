package com.addaui.tnb.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultView;
    TextView sign;
    boolean delete = true;
    boolean firstHand = true;

    double first = 0.0;
    double second = 0.0;
    double newResult = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = (TextView) findViewById(R.id.result);
        resultView.setText("0.0");
        sign = (TextView) findViewById(R.id.sign);
    }

    //Numbers Buttons Handles
    public void one(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("");
            delete = false;
        }
        String addone = resultView.getText().toString();
        addone = addone.concat("1");
        resultView.setText(addone);

    }
    public void two(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("");
            delete = false;
        }
        String addtwo = resultView.getText().toString();
        addtwo = addtwo.concat("2");
        resultView.setText(addtwo);

    }
    public void three(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("");
            delete = false;
        }
        String addthree = resultView.getText().toString();
        addthree = addthree.concat("3");
        resultView.setText(addthree);

    }
    public void four(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("");
            delete = false;
        }
        String addfour = resultView.getText().toString();
        addfour = addfour.concat("4");
        resultView.setText(addfour);

    }
    public void five(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("");
            delete = false;
        }
        String addfive = resultView.getText().toString();
        addfive = addfive.concat("5");
        resultView.setText(addfive);
    }
    public void six(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("");
            delete = false;
        }
        String addsix = resultView.getText().toString();
        addsix = addsix.concat("6");
        resultView.setText(addsix);

    }
    public void seven(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("");
            delete = false;
        }
        String addseven = resultView.getText().toString();
        addseven = addseven.concat("7");
        resultView.setText(addseven);

    }
    public void eight(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("");
            delete = false;
        }
        String addeight = resultView.getText().toString();
        addeight = addeight.concat("8");
        resultView.setText(addeight);

    }
    public void nine(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("");
            delete = false;
        }
        String addnine = resultView.getText().toString();
        addnine = addnine.concat("9");
        resultView.setText(addnine);
    }
    public void zero(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("");
            delete = false;
        }
        String addzero = resultView.getText().toString();
        addzero = addzero.concat("0");
        resultView.setText(addzero);

    }
    public void dot(View view){
        if(delete || resultView.getText().toString().equals("0")){
            resultView.setText("0.");
            delete = false;
        }else {
            String adddot = resultView.getText().toString();
            adddot = adddot.concat(".");
            resultView.setText(adddot);
        }

    }

    //Functions Handles
    public void plus(View view){
        if(delete){
            sign.setText("+");
            return;
        }
        equals(view);
        sign.setText("+");
    }
    public void minus(View view){
        if(delete){
            sign.setText("-");
            return;
        }
        equals(view);
        sign.setText("-");
    }
    public void divide(View view){
        if(delete){
            sign.setText("/");
            return;
        }
        equals(view);
        sign.setText("/");

    }
    public void multiply(View view){
        if(delete){
            sign.setText("X");
            return;
        }
        equals(view);
        sign.setText("X");

    }

    //Result Processing
    public void equals(View view){
        if(delete){
            return;
        }

        second = Double.parseDouble(resultView.getText().toString());


        if(sign.getText().toString().equals("+")){
            Log.i("Dev_ADDAUI", "equals.PlusBlock executed!!!");
            newResult = first = first + second ;
            resultView.setText(String.valueOf(newResult));

        }else if(sign.getText().toString().equals("-")){
            Log.i("Dev_ADDAUI", "equals.MinusBlock executed!!!");
            if(firstHand){
                first = second;
                second = 0.0 ;
                firstHand = false;
            }
            newResult = first = first - second;

            resultView.setText(String.valueOf(newResult));

        }else if(sign.getText().toString().equals("X")){
            Log.i("Dev_ADDAUI", "equals.MultiplyBlock executed!!!");
            if(firstHand){
                first = second;
                second = 1 ;
                firstHand = false;
            }
            newResult = first = first * second;

            resultView.setText(String.valueOf(newResult));
        }else if(sign.getText().toString().equals("/")){
            Log.i("Dev_ADDAUI", "equals.DivideBlock executed!!!");
            if(firstHand){
                first = second;
                second = 1 ;
                firstHand = false;
            }
            Log.i("Dev_ADDAUI", "first = "+first);
            Log.i("Dev_ADDAUI", "second = "+second);
            newResult = first = first / second;
            Log.i("Dev_ADDAUI", "newResult = "+newResult);
            resultView.setText(String.valueOf(newResult));
        }else{
            first = second;
            firstHand = false;
        }

        delete = true;
    }
    public void clear(View view){
        first = 0.0 ;
        second = 0.0 ;
        sign.setText("");
        resultView.setText("0.0");
        delete = true;
        firstHand = true;
    }






}
