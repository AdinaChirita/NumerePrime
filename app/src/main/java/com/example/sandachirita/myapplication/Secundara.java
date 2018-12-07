package com.example.sandachirita.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class Secundara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundara);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String message = intent.getStringExtra("mesaj");
        TextView display = findViewById(R.id.textView);
        String noidea=" nu e prim. Boo!";
        if(eprim(Integer.parseInt(message))&&(Integer.parseInt(message)==Double.parseDouble(message))){
            noidea = " e prim :-)))))!";
        }

        display.setText(message+noidea);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public boolean eprim(int n){
        int i;
        boolean sw = true;
        for(i=2;i*i<=n;i++){
            if(n%i==0)sw=false;
        }
        if(n<0)sw=false;
        return sw;
    }

}
