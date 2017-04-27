package com.example.lucas.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);//crea una clase intent en la cual se guardan ambas activitys;
        EditText editText = (EditText) findViewById(R.id.edit_message);//traetodo el objeto edittext del xml;
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);//Mete en el objeto intent el mensaje , porque intent se utiliza para el ida y vuelta entre activitys;
        startActivity(intent);//instancia el intent, inicia la actividad;
    }
}
