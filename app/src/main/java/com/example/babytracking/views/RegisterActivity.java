package com.example.babytracking.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.babytracking.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        listenBtnRegister();
        listenBtnReturn();
    }

    private void listenBtnRegister(){
        ((Button) findViewById(R.id.register)).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                Intent activityHome = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(activityHome);
                finish();
            }

        });
    }

    private void listenBtnReturn(){
        ((Button) findViewById(R.id.returnRegister)).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                // Toast.makeText(RegisterActivity.this, "Test de retour", Toast.LENGTH_SHORT).show();
                Intent activityLogin = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(activityLogin);
                finish();
            }

        });
    }
}
