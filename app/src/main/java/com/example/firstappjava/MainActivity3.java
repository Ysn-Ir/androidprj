package com.example.firstappjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    private TextView input;
    ArrayList<String> operations=new ArrayList<String>();
    ArrayList<Float> numbers=new ArrayList<Float>();
    ArrayList<Button> btns = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        input = findViewById(R.id.input);

        Button btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });

        btns.add(findViewById(R.id.btnpt));
        btns.add(findViewById(R.id.btn0));
        btns.add(findViewById(R.id.btn1));
        btns.add(findViewById(R.id.btn2));
        btns.add(findViewById(R.id.btn3));
        btns.add(findViewById(R.id.btn4));
        btns.add(findViewById(R.id.btn5));
        btns.add(findViewById(R.id.btn6));
        btns.add(findViewById(R.id.btn7));
        btns.add(findViewById(R.id.btn8));
        btns.add(findViewById(R.id.btn9));
        btns.add(findViewById(R.id.btnadd));
        btns.add(findViewById(R.id.btnmin));
        btns.add(findViewById(R.id.btnmul));
        btns.add(findViewById(R.id.btndiv));
        btns.add(findViewById(R.id.btnmod));
        btns.add(findViewById(R.id.btnbracket));
        btns.add(findViewById(R.id.btnc));
        btns.add(findViewById(R.id.btndlt));
        btns.add(findViewById(R.id.btneq));
        for (Button button : btns) {
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        if (v instanceof Button) {
            Button clickedButton = (Button) v;
            input.setText(input.getText().toString() + clickedButton.getText().toString());

            if (clickedButton.getText().toString().equals("C")) {
                input.setText("");
                operations.clear();
                numbers.clear();
            }
            else if (clickedButton.getText().toString().equals("⌫")) {
                input.setText(input.getText().toString().substring(0,input.getText().length()-2).toString());
            }


        }

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);

        Button item1=findViewById(R.id.itm1);
        Button item2=findViewById(R.id.itm2);




        return true;
    }
}
