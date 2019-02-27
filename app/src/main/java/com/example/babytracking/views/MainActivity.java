package com.example.babytracking.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.babytracking.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listenBtnLogin();
        listenBtnRegister();
    }

    private void listenBtnLogin(){
        ((Button) findViewById(R.id.btnLogin)).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                Intent activityHome = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(activityHome);
                finish();            }

        });
    }
    private void listenBtnRegister(){
        ((Button) findViewById(R.id.btnRegister)).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                // Toast.makeText(MainActivity.this, "Test d'affichage", Toast.LENGTH_SHORT).show();
                // Préparation de l'activité
                Intent otherActivity = new Intent(getApplicationContext(), RegisterActivity.class);
                // démarre la nouvelle activité
                startActivity(otherActivity);
                // stop l'activité actuel
                finish();
            }

        });
    }
}
