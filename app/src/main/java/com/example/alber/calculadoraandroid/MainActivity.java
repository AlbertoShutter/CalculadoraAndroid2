package com.example.alber.calculadoraandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, bsumar, brestar, bdividir, bigual, bmultipl, bpunto, bresetear;
    EditText etProceso, etconcatenar;
    double numero1, numero2, resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bresetear = (Button)findViewById(R.id.bresetear);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        bpunto = (Button)findViewById(R.id.bpunto);
        bigual = (Button)findViewById(R.id.bigual);
        bsumar = (Button)findViewById(R.id.bsumar);
        brestar = (Button)findViewById(R.id.brestar);
        bmultipl = (Button)findViewById(R.id.bmultipl);
        bdividir = (Button)findViewById(R.id.bdividir);
        etProceso = (EditText)findViewById(R.id.etProceso);

        button0.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener()  { //
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "9");
            }
        });
        bpunto.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + ".");
            }
        });
        bigual.setOnClickListener(new View.OnClickListener()    {
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero2 = Double.parseDouble(etconcatenar.getText().toString());
                if (operador.equals("+")){
                    etProceso.setText("");
                    resultado = numero1 + numero2;
                }
                if (operador.equals("-")){
                    etProceso.setText("");
                    resultado = numero1 - numero2;
                }
                if (operador.equals("×")){
                    etProceso.setText("");
                    resultado = numero1 * numero2;
                }
                if (operador.equals("÷")){
                    etProceso.setText("");
                    if (numero2 != 0){
                        resultado = numero1 / numero2;
                    }else {
                        etProceso.setText("Infinito");
                    }
                }
                etProceso.setText(String.valueOf(resultado));
            }
        });
        bsumar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operador = "+";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        brestar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operador = "-";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        bmultipl.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                operador = "×";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        bdividir.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                operador = "÷";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        bresetear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
            }
        });
    }
}
