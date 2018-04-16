package com.example.cyberbear.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.cyberbear.myapplication.R.id.botonedu;
import static com.example.cyberbear.myapplication.R.id.textView;


public class MainActivity extends Activity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(botonedu);
        final TextView texto= findViewById(textView);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Button button =  findViewById(R.id.botonedu);
                if(button.getText()=="Learn Android"){
                    button.setText("texto2");//set the text on button


                    texto.setText("kukukuk");
                }
                else {
                    button.setText("Learn Android");//set the text on button

                    texto.setText("kukukuk222");
                }

            }
        });
    }

}