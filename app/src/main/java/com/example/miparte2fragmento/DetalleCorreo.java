package com.example.miparte2fragmento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleCorreo extends AppCompatActivity {

    String remitente, asunto, contenido;
    TextView mitext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);

        Bundle extras = getIntent().getExtras();

        remitente = extras.getString("de");
        asunto = extras.getString("asunto");
        contenido = extras.getString("texto");

        mitext = findViewById(R.id.txtdetalle);
        mitext.setText("De: "+remitente+", asunto: "+asunto+" contenido: "+contenido);
    }
}
