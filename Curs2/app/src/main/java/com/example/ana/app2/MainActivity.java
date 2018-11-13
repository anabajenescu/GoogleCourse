package com.example.ana.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void doLogin(View view){
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        String name = username.getText().toString();
        String pass = password.getText().toString();

        if(name.equals("anabaje") && pass.equals("123456"))
            Toast.makeText(this, "Success! " + name.toUpperCase() + " logged in successfully!", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "Fail to login!", Toast.LENGTH_SHORT).show();
    }
}
