package io.rotjeot.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    EditText etTelefono;
    EditText etEmail;
    EditText etDescripcion;
    DatePicker fecha;
    int dia;
    int mes;
    int anho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre = findViewById(R.id.etNombre);
        etTelefono = findViewById(R.id.etTelefono);
        etEmail = findViewById(R.id.etEmail);
        etDescripcion = findViewById(R.id.etDescripcion);
        fecha = findViewById(R.id.dpFecha);

        Button siguiente = findViewById(R.id.btnSiguiente);

        siguiente.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String strNombre = etNombre.getText().toString();
                String strTelefono = etTelefono.getText().toString();
                String strEmail = etEmail.getText().toString();
                String strDescripcion = etDescripcion.getText().toString();
                dia = fecha.getDayOfMonth();
                mes = fecha.getMonth();
                anho = fecha.getYear();

                int[] nacimiento = new int[]{dia,mes,anho};

                Intent confirmacion = new Intent(MainActivity.this, confirmacion.class);
                confirmacion.putExtra("KEY_NOMBRE",strNombre);
                confirmacion.putExtra("KEY_TELEFONO", strTelefono);
                confirmacion.putExtra("KEY_EMAIL",strEmail);
                confirmacion.putExtra("KEY_des", strDescripcion);
                confirmacion.putExtra("KEY_FECHA", nacimiento);
                startActivity(confirmacion);
            }

        });

    }
}