package com.example.testfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView addCard, viewCard, seeCard;

//    private Button btCreateDB;
//    private Button btViewDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cardview
        addCard = (CardView) findViewById(R.id.add_card);
        viewCard = (CardView) findViewById(R.id.view_card);
        seeCard = (CardView) findViewById(R.id.see_card);

        addCard.setOnClickListener(this);
        viewCard.setOnClickListener(this);
        seeCard.setOnClickListener(this);


//        btCreateDB = (Button) findViewById(R.id.bt_createdata);
//        btViewDB = (Button) findViewById(R.id.bt_viewdata);
//
//        btCreateDB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(FirebaseDBCreateActivity.getActIntent(MainActivity.this));
//            }
//        });
//
//        btViewDB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(FirebaseDBReadActivity.getActIntent(MainActivity.this));
//            }
//        });


    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.add_card : i = new Intent(this, FirebaseDBCreateActivity.class);
                startActivity(i);
                break;
            case R.id.view_card : i = new Intent(this, FirebaseDBReadActivity.class);
                startActivity(i);
                break;
            case R.id.see_card : i = new Intent(this, SeePenyakit.class);
                startActivity(i);
                break;
            default:break;
        }

    }
}
