package com.example.kappa.gamegarden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button entergame = (Button)findViewById(R.id.enter);

        entergame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentsta = new Intent();
                intentsta.setClass(MainActivity.this,Choose_game.class);
                startActivity(intentsta);
            }
        });



    }
}
