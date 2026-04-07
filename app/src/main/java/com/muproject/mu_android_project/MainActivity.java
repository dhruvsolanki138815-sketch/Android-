package com.muproject.mu_android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void openScreen(View v){
        int id = v.getId();

        if(id == R.id.btn1)
            startActivity(new Intent(this, Activity1.class));

        else if(id == R.id.btn2)
            startActivity(new Intent(this, Activity2.class));

        else if(id == R.id.btn3)
            startActivity(new Intent(this, Activity3.class));

        else if(id == R.id.btn4)
            startActivity(new Intent(this, Activity4.class));

        else if(id == R.id.btn5)
            startActivity(new Intent(this, Activity5.class));

            // remaining buttons ready
        else if(id == R.id.btn6)
            startActivity(new Intent(this, Activity6.class));

        else if(id == R.id.btn7)
            startActivity(new Intent(this, Activity7.class));

        else if(id == R.id.btn8)
            startActivity(new Intent(this, Activity8.class));

        else if(id == R.id.btn9)
            startActivity(new Intent(this, Activity9.class));

        else if(id == R.id.btn10)
            startActivity(new Intent(this, Activity10.class));

        // continue till 50
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}