package com.example.vistasdinamicascontablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TableLayout tabla;
    int contadorFila=0;
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
        TableRow fila=(TableRow)tabla.getChildAt(contadorFila);

        Button btn = new Button(this);
        btn.setText("Hola");

        Random r= new Random();
        int color = Color.rgb(r.nextInt(256),r.nextInt(256),r.nextInt(256));
        btn.setBackgroundColor(color);

        fila.addView(btn);
        contadorFila++;
    }

    public void borrarFilas(View v){
        tabla.removeAllViews();
        contadorFila=0;
    }
}