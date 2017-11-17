package com.example.oscpal.examenpizza;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class dibujo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Dibujo(this));

    }

    public class Dibujo extends View {
        public Dibujo(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {


            Paint curva = new Paint();
            Paint circulo = new Paint();


            curva.setColor(Color.BLACK);
            curva.setStyle(Paint.Style.FILL);

            canvas.drawCircle(400,300,200, circulo);



        }
    }
}







