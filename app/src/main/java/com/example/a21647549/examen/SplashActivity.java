package com.example.a21647549.examen;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by 21647549 on 02/03/2018.
 */

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        getSupportActionBar().hide();


        View myImage = findViewById(R.id.imageView);
        TextView titulo = (TextView) findViewById(R.id.Title);


        // ESTABLECER UNA FUENTE
        Typeface myFont = Typeface.createFromAsset(getAssets(), "Nettizen_TRIAL.ttf");//No se como importar la fuente en el proyecto
        titulo.setTypeface(myFont);

        myImage.startAnimation(animaImagen);
        titulo.startAnimation(animaTitulo);
        animaTitulo.setAnimationListener(this);

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }


    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
