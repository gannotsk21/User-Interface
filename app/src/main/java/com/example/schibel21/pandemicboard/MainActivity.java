package com.example.schibel21.pandemicboard;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mv = (MapView)findViewById(R.id.MapView);

        ImageView pc11 = findViewById(R.id.pandemicCard11);
        pc11.setImageResource(R.drawable.pandemiccards11);

        ImageView pc13 = findViewById(R.id.pandemiccard13);
        pc13.setImageResource(R.drawable.pandemiccards13);

        ImageView pc16 = findViewById(R.id.pandemiccard16);
        pc16.setImageResource(R.drawable.pandemiccards16);

        ImageView role3 = findViewById(R.id.role3);
        role3.setImageResource(R.drawable.role3);

        ImageView role5 = findViewById(R.id.role5);
        role5.setImageResource(R.drawable.role5);

        ImageView infect3 = findViewById(R.id.infection3);
        infect3.setImageResource(R.drawable.infection3);

        ImageView pc29 = findViewById(R.id.pandemiccard29);
        pc29.setImageResource(R.drawable.pandemiccards29);

        ImageView player1 = findViewById(R.id.purpleplayer);
        player1.setImageResource(R.drawable.purplesquare);

        ImageView player2 = findViewById(R.id.whiteplayer);
        player2.setImageResource(R.drawable.whitesquare);

        ImageView disease = findViewById(R.id.disease);
        disease.setImageResource(R.drawable.redsquare);
    }
}
