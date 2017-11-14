package com.example.oscpal.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import static com.example.oscpal.menu.R.id.lblMensaje;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView lblMensaje =(TextView) findViewById(R.id.lblMensaje);
        switch (item.getItemId()) {
            case R.id.MnuOpc1:
                lblMensaje.setText("Opcion 1");
                return true;
            case R.id.MnuOpc2:
                lblMensaje.setText("Opcion 2");;
                return true;
            case R.id.MnuOpc3:
                lblMensaje.setText("Opcion 3");;
                return true;
            case R.id.SubMnuOpc1:
                lblMensaje.setText("Submenu 1");
                return true;
            case R.id.SubMnuOpc2:
                lblMensaje.setText("Submenu 2"); ;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }}


        }


