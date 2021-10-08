package com.example.vistasdinamicascontablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    TableLayout tabla;
//hay que crear un boton para añadir botones y otro para añadir filas. Ademas de que esos botones hagan algo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabla=findViewById(R.id.tabla);
    }


    public void crearFila(View v){
        TableRow fila = new TableRow(this);
        tabla.addView(fila);
        crearBotonEnFila();
    }
    public void crearBotonEnFila(){
        TableRow fila=(TableRow)tabla.getChildAt(0);

        Button btn = new Button(this);
        btn.setText("Botón creado en la fila");
        fila.addView(btn);
    }
}