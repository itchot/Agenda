package com.nablamex.agenda;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Calendar;


public class AgregarContacto extends AppCompatActivity {

    private Button btn_Enviar;
    private EditText nombre,email,telefono,descripcion;
    private DatePicker datepiker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_contacto);

        final EditText nombre =(EditText)findViewById(R.id.input_name);
        final EditText email = (EditText)findViewById(R.id.input_name);
        final EditText telefono = (EditText)findViewById(R.id.input_telefono);
        final EditText descripcion = (EditText)findViewById(R.id.input_descripcion);
        final TextView info = (TextView)findViewById(R.id.txtfecha);

        DatePicker date = (DatePicker)findViewById(R.id.datePicker);
        Button btnsiguiente = (Button)findViewById(R.id.btnsiguiente);

        Calendar today = Calendar.getInstance();

        date.init(
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH),
                today.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        Toast.makeText(getApplicationContext(),"Fecha", Toast.LENGTH_SHORT).show();

                        info.setText(
                                " " + year + "/"+ monthOfYear + "/" + dayOfMonth);
                    }
                }

        );

        btnsiguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AgregarContacto.this, ConfirmarDatos.class);
                intent.putExtra("nombre",nombre.getText().toString());
                intent.putExtra("telefono",telefono.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("descripcion",descripcion.getText().toString());
                intent.putExtra("info",info.getText().toString());


                startActivity(intent);
            }
        });

    }


}
