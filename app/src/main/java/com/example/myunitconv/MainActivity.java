package com.example.myunitconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView;
private EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editTextNumber = findViewById(R.id.editTextNumber2);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
             // Toast.makeText(MainActivity.this, "hi i am prasad guyss", Toast.LENGTH_SHORT).show();
         String s = editTextNumber.getText().toString();
         int kg = Integer.parseInt(s);
         double pound = 2.205 * kg;
         textView.setText("the pound value is "+pound);
          }
      });

    }
}