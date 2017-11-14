package com.example.oscpal.ejemplocanvas;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private BitmapDrawable miImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploView(this));
    }

    public class EjemploView extends View {
        public EjemploView(Context contexto){
            super(contexto);

        }
        @Override
        protected void onDraw(Canvas canvas) {
            Paint pincel = new Paint();
            setBackgroundResource(R.drawable.degradado);

            pincel.setStrokeWidth(12);
            pincel.setStyle(Paint.Style.FILL_AND_STROKE);
            pincel.setColor(Color.BLUE);
           canvas.drawCircle(250, 250, 125, pincel);
           pincel.setColor(Color.BLACK);
           canvas.drawCircle(550, 250, 125, pincel);
            pincel.setColor(Color.RED);
            canvas.drawCircle(850, 250, 125, pincel);
            pincel.setColor(Color.YELLOW);
            canvas.drawCircle(400, 400, 125, pincel);
            pincel.setColor(Color.GREEN);
            canvas.drawCircle(700, 400, 125, pincel);
            Resources res = this.getResources();
            miImagen = (BitmapDrawable) res.getDrawable(R.drawable.logoiesserpis);
            miImagen.setBounds(new Rect(200, 600, 900, 1000));
            miImagen.draw(canvas);
        }
    }
}
