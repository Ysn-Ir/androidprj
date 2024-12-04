package com.example.firstappjava;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText user=findViewById(R.id.edt);
        EditText pass=findViewById(R.id.editTextTextPassword);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(view->{
          String name=user.getText().toString();
            String password=pass.getText().toString();
            if ((name.equals("admin") && password.equals("admin")) ||
                    (name.equals("yassine") && password.equals("admin"))) {
                Toast.makeText(this, "hello BIG BOSS ", Toast.LENGTH_LONG).show();
                String url="https://www.newyorker.com/news/daily-comment/monkey-see-monkey-click";
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                startActivity(intent);
            }
            else
            Toast.makeText(this,"hello "+user.getText().toString(),Toast.LENGTH_LONG).show();
        });

    }
}