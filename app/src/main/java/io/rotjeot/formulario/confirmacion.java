package io.rotjeot.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class confirmacion extends AppCompatActivity {
    String nombre;
    String tel;
    String email;
    String des;
    String fecha;
    int [] fechaEntera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);
        Bundle extras = getIntent().getExtras();
        TextView tvNombre = findViewById(R.id.tvNombre);
        TextView tvFecha = findViewById(R.id.tvFecha);
        TextView tvTel = findViewById(R.id.tvTel);
        TextView tvEmail = findViewById(R.id.tvEmail);
        TextView tvDes = findViewById(R.id.tvDes);

        nombre = extras.getString("KEY_NOMBRE");
        tel = extras.getString("KEY_TELEFONO");
        email = extras.getString("KEY_EMAIL");
        des = extras.getString("KEY_des");
        fechaEntera = extras.getIntArray("KEY_FECHA");
        fecha = Integer.toString(fechaEntera[0]) + "/" + Integer.toString(fechaEntera[1]) + "/" +
            Integer.toString(fechaEntera[2]);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTel.setText(tel);
        tvEmail.setText(email);
        tvDes.setText(des);


    }
}