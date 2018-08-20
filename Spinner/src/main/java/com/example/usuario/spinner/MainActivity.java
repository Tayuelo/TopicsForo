package com.example.usuario.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener{

    private Spinner spinnerUniversidad, spinnerCarreras, spinnerSemestre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         spinnerUniversidad = (Spinner) findViewById(R.id.spinnerUniversidad);
         spinnerCarreras = (Spinner) findViewById(R.id.spinnerProgramas);
         spinnerSemestre = (Spinner) findViewById(R.id.spinnerSemestres);



         ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                 this,
                 R.array.array_universidades,
                 android.R.layout.simple_spinner_item
         );

         adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

         ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
                 this,
                 R.array.array_carreras,
                 android.R.layout.simple_spinner_item
         );

         adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

         /**
         ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                 this,
                 R.array.array_semestres,
                 android.R.layout.simple_spinner_item
         );

         adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

         **/

         spinnerUniversidad.setAdapter(adapter);
         spinnerUniversidad.setOnItemSelectedListener(this);
         spinnerCarreras.setAdapter(adapter1);
         spinnerCarreras.setOnItemSelectedListener(this);
         /**spinnerSemestre.setAdapter(adapter2);
         spinnerSemestre.setOnItemSelectedListener(this);**/

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view,
                               int position,
                               long id) {

        if (spinnerUniversidad.getSelectedItemPosition() == 1 && spinnerCarreras.getSelectedItemPosition() == 2){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                    this,
                    R.array.array_semestresEafitContaduria,
                    android.R.layout.simple_spinner_item
            );
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerSemestre.setAdapter(adapter);

        } else{
            ArrayAdapter<CharSequence> adapterDefault = ArrayAdapter.createFromResource(
                    this,
                    R.array.array_semestres,
                    android.R.layout.simple_spinner_item
            );

            adapterDefault.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerSemestre.setAdapter(adapterDefault);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
