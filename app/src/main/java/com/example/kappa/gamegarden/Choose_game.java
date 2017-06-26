package com.example.kappa.gamegarden;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by kappa on 2017/5/9.
 */
public class Choose_game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_game_page);

        Button m_game = (Button)findViewById(R.id.memory_garden);

        m_game.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View c){
                Intent mgame_int = new Intent();
                mgame_int.setClass(Choose_game.this,Memory_garden.class);
                startActivity(mgame_int);
            }
        });

        Button game2 = (Button)findViewById(R.id.wait);

        game2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View c){

                Toast.makeText(Choose_game.this,"還在開發中...",Toast.LENGTH_LONG).show();


              /*  Intent mgame_int = new Intent();
                mgame_int.setClass(Choose_game.this,Memory_garden.class);
                startActivity(mgame_int);  */

            }
        });

    }
}
