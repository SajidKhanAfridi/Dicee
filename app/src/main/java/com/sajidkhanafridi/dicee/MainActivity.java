package com.sajidkhanafridi.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button variable
        Button rollButton = (Button) findViewById( R.id.roll_button );
        final ImageView rightImage = (ImageView) findViewById( R.id.image_rightDicee );
        final ImageView leftImage = (ImageView) findViewById( R.id.image_leftDicee );
        final int [] diceeArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Random randomNumberGenerator = new Random();
             int number = randomNumberGenerator.nextInt(6);
             rightImage.setImageResource(diceeArray[number]);
             number = randomNumberGenerator.nextInt(6);
             leftImage.setImageResource(diceeArray[number]);
            }
        });


    }
}
