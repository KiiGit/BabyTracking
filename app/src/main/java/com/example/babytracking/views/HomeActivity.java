package com.example.babytracking.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.babytracking.R;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listenBtnAddBabyBottle();
        listenBtnHistory();
        listenBtnGraph();
        listenBtnReturn();
    }

    private void listenBtnAddBabyBottle(){
        ((Button) findViewById(R.id.btnAddBabyBottle)).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(HomeActivity.this, "Ajout d'un biberon en phase de développement", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void listenBtnHistory(){
        ((Button) findViewById(R.id.btnHistory)).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(HomeActivity.this, "Historique en phase de développement", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void listenBtnGraph(){
        ((Button) findViewById(R.id.btnGraph)).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(HomeActivity.this, "Graphique en phase de développement", Toast.LENGTH_SHORT).show();

            }

        });
    }

    private void listenBtnReturn(){
        ((Button) findViewById(R.id.btnReturn)).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                // Toast.makeText(RegisterActivity.this, "Test de retour", Toast.LENGTH_SHORT).show();
                Intent activityMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(activityMain);
                finish();
            }

        });
    }
}
