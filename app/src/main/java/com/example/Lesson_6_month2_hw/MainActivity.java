package com.example.Lesson_6_month2_hw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edit_email, edit_password;
    private Button btn_enter, btn_forget_password;
    private TextView welcome, register, entrance;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_email = (EditText) findViewById(R.id.email);
        edit_password = (EditText) findViewById(R.id.enter_password);
        btn_enter = (Button) findViewById(R.id.enter);
        btn_forget_password = (Button) findViewById(R.id.forget_password);
        welcome = (TextView) findViewById(R.id.welcome);
        register = (TextView) findViewById(R.id.register);
        entrance = (TextView) findViewById(R.id.entrance);
        onclicklistener();
        edit_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (edit_email.getText().toString().isEmpty()) {
                    btn_enter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    btn_enter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.ORANGE));
                }
            }
        });
        edit_password.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable charSequence) {
                if (edit_password.getText().toString().isEmpty()) {
                    btn_enter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    btn_enter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.ORANGE));
                }
            }
        });
    }

    private void onclicklistener() {
        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit_email.getText().toString().equals("admin@gmail.com") && edit_password.getText().toString().equals("admin")){
                    btn_enter.setVisibility(View.GONE);
                    btn_forget_password.setVisibility(View.GONE);
                    edit_email.setVisibility(View.GONE);
                    edit_password.setVisibility(View.GONE);
                    register.setVisibility(View.GONE);
                    entrance.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Right", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Wrong email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

