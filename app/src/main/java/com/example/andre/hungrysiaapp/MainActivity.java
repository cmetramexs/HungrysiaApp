//1  secret code
package com.example.andre.hungrysiaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text_secretcode;
    private EditText edittext_secretcode;
    private Button button_secretcode_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_secretcode = findViewById(R.id.secretcode_text);
        edittext_secretcode = findViewById(R.id.secretcode_edittext);
        button_secretcode_next = findViewById(R.id.secretcode_next_button);

        button_secretcode_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string_secretcode = edittext_secretcode.getText().toString();
                if (string_secretcode == getResources().getString(R.string.secret_code)){
                    Intent toContact = new Intent(MainActivity.this,ContactActivity.class);
                    startActivity(toContact);
                }
                else{
                    Toast.makeText(MainActivity.this,R.string.hint,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}