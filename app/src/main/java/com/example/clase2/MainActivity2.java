package com.example.clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent1 = getIntent();
        String texto = intent1.getStringExtra("texto");
        Persona persona = (Persona) intent1.getSerializableExtra("alumna");

        TextView textView = findViewById(R.id.textView2);
        textView.setText("persona: " + persona.getNombre() + " | texto: " + texto);

        Button button = findViewById(R.id.buttonRegresar);
        button.setOnClickListener(view -> {
            //Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            //startActivity(intent);
            //para regresar al MainActivity ya creado
            finish();
        });
    }
}