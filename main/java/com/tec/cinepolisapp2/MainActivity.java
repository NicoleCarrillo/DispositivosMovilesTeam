package com.tec.cinepolisapp2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton boton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton4 = findViewById(R.id.imageButton2);


       boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle1=new Bundle();
                Intent myIntent =new Intent(getApplicationContext(),LogIn.class);
                myIntent.putExtras(bundle1);
                startActivity(myIntent);
            }
        });
    }
}
