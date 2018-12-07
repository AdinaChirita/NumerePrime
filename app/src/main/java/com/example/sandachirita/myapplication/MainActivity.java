package com.example.sandachirita.myapplication;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.TextView.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText tb = findViewById(R.id.editText);
        tb.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    clickclickbang2();
                    return true;
                }
                return false;
            }
        });
    }

    public void clickclickbang(View view) {
        EditText tb = findViewById(R.id.editText);
        String message = tb.getText().toString();
        if(message.matches("-?\\d+(\\.\\d+)?")) {
            Intent intent = new Intent(this, Secundara.class);
            intent.putExtra("mesaj", message);
            startActivity(intent);
        }
        else youretoast();
    }

    public void clickclickbang2() {
        EditText tb = findViewById(R.id.editText);
        String message = tb.getText().toString();
        if(message.matches("-?\\d+(\\.\\d+)?")) {
            Intent intent = new Intent(this, Secundara.class);
            intent.putExtra("mesaj", message);
            startActivity(intent);
        }
        else youretoast();
    }

    public void youretoast() {
        Context context = getApplicationContext();
        CharSequence text = "Asta nu e numar :(";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
