package com.usama2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_register;
    private EditText full_name;
    private EditText company_name;
    private EditText email;
    private EditText phone;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_register = findViewById(R.id.btnreg);
        full_name = findViewById(R.id.fullname);
        company_name = findViewById(R.id.companyname);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.pass);

        btn_register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnreg){

            if(full_name.getText().toString().isEmpty()){

                Toast.makeText(this, R.string.name_check1, Toast.LENGTH_SHORT).show();
            }else if(full_name.getText().toString().length()>32){
                Toast.makeText(this, R.string.name_check2, Toast.LENGTH_SHORT).show();
            }else{
                if(company_name.getText().toString().isEmpty()){
                    Toast.makeText(this, R.string.company_check, Toast.LENGTH_SHORT).show();
                }else{
                    if(email.getText().toString().isEmpty()){
                        Toast.makeText(this, R.string.Email_check, Toast.LENGTH_SHORT).show();
                    }else{
                        if(phone.getText().toString().isEmpty()){
                            Toast.makeText(this, R.string.phone_check1, Toast.LENGTH_SHORT).show();
                        }else if(phone.getText().toString().length() != 11){
                            Toast.makeText(this, R.string.phone_check2, Toast.LENGTH_SHORT).show();
                        }else{
                            if(password.getText().toString().isEmpty()){
                                Toast.makeText(this, R.string.pass_check1, Toast.LENGTH_SHORT).show();
                            }else if(password.getText().toString().length() < 8){
                                Toast.makeText(this, R.string.pass_check2, Toast.LENGTH_SHORT).show();
                            }else{
                                Intent home_screen =new Intent(this, home.class);
                                startActivity(home_screen);

                            }
                        }
                    }
                }
            }
        }

    }
}
