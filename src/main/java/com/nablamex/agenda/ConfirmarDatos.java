package com.nablamex.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;


public class ConfirmarDatos extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        TextView nombre = (TextView) findViewById(R.id.txtnombre);
        TextView telefono = (TextView) findViewById(R.id.txttelefono);
        TextView email = (TextView) findViewById(R.id.txtemail);
        TextView descripcion = (TextView) findViewById(R.id.txtdescripcion);
        TextView fecha = (TextView) findViewById(R.id.txtfecha);
        // Button btneditar = (Button) findViewById(R.id.btneditar);


        nombre.setText(getIntent().getExtras().getString("nombre"));
        telefono.setText(getIntent().getExtras().getString("telefono"));
        email.setText(getIntent().getExtras().getString("email"));
        descripcion.setText(getIntent().getExtras().getString("descripcion"));
        fecha.setText(getIntent().getExtras().getString("info"));

    }

    public void pass(){
        Button btneditar = (Button) findViewById(R.id.btneditar);
        btneditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pass = new Intent(ConfirmarDatos.this, AgregarContacto.class);
                finish();
            }
        });

    }

    public void pass (View v){

//        startActivity(pass);
        finish();
    }

}
