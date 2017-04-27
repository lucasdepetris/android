package com.example.lucas.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();//Obtenemos la instancia del intent;
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);//obtenemos lo que mandamos por intent con putEXTRA;
        TextView textView = new TextView(this);//creamos un textview;
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);//buscamos el layout de una activity por id;
        layout.addView(textView);//y ponemos el textview en ese layout;
    }
}
