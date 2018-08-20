package com.example.usuario.forum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;

public class FFK extends AppCompatActivity {
    @BindView(R.id.nombre)
    EditText nombre;

    @BindView(R.id.apellido)
    EditText apellido;

    @BindView(R.id.direccion)
    EditText direccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ffk);
    }
}
