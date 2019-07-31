package com.example.student.customandroidtoastdemox;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Context context = getApplicationContext();
        CharSequence msg =  "Hello Toast";
        int duration = Toast.LENGTH_SHORT;

        Toast defToast = Toast.makeText(context,msg,duration);
        defToast.setGravity(Gravity.TOP | (Gravity.LEFT );
        defToast.show();
*/
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_container));

        TextView messageText = (TextView)  layout.findViewById(R.id.textView);
        messageText.setText("This is a custom Toast");

        Toast toast = new Toast (getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0 , 0);
        toast.setDuration(Toast.LENGTH_LONG);

        toast.setView(layout);
        toast.show();


    }
}
