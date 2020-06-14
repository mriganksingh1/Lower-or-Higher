package com.example.lowerorhigher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    int r=0;
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextPersonName);
        textView = findViewById(R.id.textView3);
    }
    public void guess(View view)
    {
        if(flag==0)
        {
            Random random = new Random();
            r = random.nextInt(20) + 1;
            flag=1;
        }
        String number = editText.getText().toString();
        int num = Integer.parseInt(number);
        String Message="";
        if(r == num)
        {
            Message = "You Guesses it Right";
            flag=0;
        }
        else if(num>r)
        {
            Message = "Lower";
        }
        else
        {
            Message = "Higher";
        }
        Toast.makeText(getApplicationContext(),Message,Toast.LENGTH_SHORT).show();
    }
}