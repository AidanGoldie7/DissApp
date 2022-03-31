package com.example.dissapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //assign button variable to created button
        Button buttonAdd = (Button) findViewById(R.id.btn_journals);
        Button buttonJournals = (Button) findViewById(R.id.btn_mvp);
        Button buttonHome = (Button) findViewById(R.id.btn_home);

        //on + button click
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //click handling code
                //when clicked, OpenActivityAddJournal method
                openActivityAddJournal();
            }
        });


        buttonJournals.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                openActivityDisplay();
            }
    });

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //click handling code
                openHome();
            }
        });

    }





    public void openActivityAddJournal(){
        //intent to navigate to journals page
        Intent intent = new Intent(HomeActivity.this, JournalsActivity.class);
        startActivity(intent);

        //display toast message to inform of relocation to journals page
        Toast.makeText(this, "Add Journal Entry", Toast.LENGTH_SHORT).show();
    }


    public void openActivityDisplay(){
        //intent to navigate to journals page
        Intent intent = new Intent(HomeActivity.this, DisplayActivity.class);
        startActivity(intent);

        //display toast message to inform of relocation to journals page
        Toast.makeText(this, "My Journals", Toast.LENGTH_SHORT).show();
    }


    public void openHome(){
        //display toast message to inform of relocation to journals page
        Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
    }
}
