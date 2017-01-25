package com.example.jcardozori.applicationbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText editTextAltura;
    private EditText editTextPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        editTextPeso = (EditText) findViewById(R.id.editTextPeso);
    }

    public void CalculaBMI(View view) {
        String peso = editTextPeso.getText().toString();
        String altura = editTextAltura.getText().toString();
        if (peso.isEmpty() || altura.isEmpty()){
            Log.e(TAG,"Campos peso y altura estan vacios");
            return;
        }
        String expRegex = "\\d{1,3}";
        if (peso.matches(expRegex) && altura.matches(expRegex))
        {
            Log.d(TAG,"No son numeros");
        }


    }
}
