package com.example.firstappjava;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        Button btn1=findViewById(R.id.btn2);
        Button btn2=findViewById(R.id.btn3);
        Button btn3=findViewById(R.id.btn4);
        btn1.setOnClickListener(view-> {



            String url = "https://ensaf.ac.ma/?controller=login&action=etudiant";
            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

            startActivity(intent1);

        });
        btn2.setOnClickListener(view-> {

                Uri uri = Uri.parse("tel:0609408356");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);


        });
        btn3.setOnClickListener(view-> {
            Intent intent3 = new Intent(this,MainActivity3.class);
            startActivity(intent3);

        });
    }

}