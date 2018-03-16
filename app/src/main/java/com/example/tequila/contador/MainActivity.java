package com.example.tequila.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtContador, txtAviso;
    int i = 0;
    boolean control = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAviso = (TextView) findViewById(R.id.txtAviso);
        txtContador = (TextView) findViewById(R.id.txtContador);
    }

    public void doCont(View v) {
        if (control){
            i++;
            this.txtContador.setText("" + i);
            if (i==7)
                this.txtAviso.setText("Ya casi llegamos");

            if (i==5)
                Log.e("van 5", "vamos bien");

            if (i==9)
                this.txtAviso.setText("Ya merito");

            if (i==10){
                control = false;
                Log.e("van 5", "vamos bien");

            }
        }
        else {

            i--;
            this.txtContador.setText("" + i);
            if (i==5)
                Log.e(" van 5", "vamos bien");
            if (i==3)
                this.txtAviso.setText("Muy bajo");
            if (i==2)
                this.txtAviso.setText("Bajito");
            if(i==0){
                Log.e(" van 5", "vamos bien");
                control=true;
            }


        }
    }

}







