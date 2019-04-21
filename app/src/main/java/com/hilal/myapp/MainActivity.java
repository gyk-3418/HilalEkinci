package com.hilal.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button giris = findViewById(R.id.login);
        Button kayıt = findViewById(R.id.register);
        final EditText uname = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);

        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = uname.getText().toString();
                String pass = password.getText().toString();

                Intent intent = new Intent(MainActivity.this, MyDrawer.class);
                startActivity(intent);



            }
        });

    }
}
