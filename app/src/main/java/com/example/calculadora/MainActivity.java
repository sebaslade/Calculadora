package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado=(TextView) findViewById(R.id.txvSalida);
        resultado.setText("0");

    }

    public void EscribirSiete(View view) {
        String valorActual = resultado.getText().toString();
        if (valorActual.equals("0")) {
            resultado.setText("7");
        } else {
            resultado.setText(valorActual + "7");
        }
    }

    public void EscribirOcho(View view) {
        String valorActual = resultado.getText().toString();
        if (valorActual.equals("0")) {
            resultado.setText("8");
        } else {
            resultado.setText(valorActual + "8");
        }
    }

    public void EscribirNueve(View view) {
        String valorActual = resultado.getText().toString();
        if (valorActual.equals("0")) {
            resultado.setText("9");
        } else {
            resultado.setText(valorActual + "9");
        }
    }

    public void EscribirCuatro(View view) {
        String valorActual = resultado.getText().toString();
        if (valorActual.equals("0")) {
            resultado.setText("4");
        } else {
            resultado.setText(valorActual + "4");
        }
    }

    public void EscribirCinco(View view) {
        String valorActual = resultado.getText().toString();
        if (valorActual.equals("0")) {
            resultado.setText("5");
        } else {
            resultado.setText(valorActual + "5");
        }
    }

    public void EscribirSeis(View view) {
        String valorActual = resultado.getText().toString();
        if (valorActual.equals("0")) {
            resultado.setText("6");
        } else {
            resultado.setText(valorActual + "6");
        }
    }

    public void EscribirUno(View view) {
        String valorActual = resultado.getText().toString();
        if (valorActual.equals("0")) {
            resultado.setText("1");
        } else {
            resultado.setText(valorActual + "1");
        }
    }

    public void EscribirDos(View view) {
        String valorActual = resultado.getText().toString();
        if (valorActual.equals("0")) {
            resultado.setText("2");
        } else {
            resultado.setText(valorActual + "2");
        }
    }

    public void EscribirTres(View view) {
        String valorActual = resultado.getText().toString();
        if (valorActual.equals("0")) {
            resultado.setText("3");
        } else {
            resultado.setText(valorActual + "3");
        }
    }

    public void EscribirCero(View view) {
        String valorActual = resultado.getText().toString();
        if (valorActual.equals("0")) {
            resultado.setText("70");
        } else {
            resultado.setText(valorActual + "0");
        }
    }

    public void OperacionDivision(View view) {
        numero1 = obtenerNumero();
        operacion = "/";
        resultado.setText("0");
    }

    public void OperacionSuma(View view) {
        numero1 = obtenerNumero();
        operacion = "+";
        resultado.setText("0");
    }

    public void OperacionResta(View view) {
        numero1 = obtenerNumero();
        operacion = "-";
        resultado.setText("0");
    }

    public void OperacionMultiplicacion(View view) {
        numero1 = obtenerNumero();
        operacion = "*";
        resultado.setText("0");
    }

    public void Borrar(View view) {
        resultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

    public void MostrarResultado(View view) {
        String textoResultado = resultado.getText().toString().trim();
        if (!textoResultado.isEmpty() && textoResultado.matches("-?\\d+(\\.\\d+)?")) {
            numero2 = Float.parseFloat(textoResultado);
            if (operacion.equals("/")) {
                if (numero2 == 0.0f) {
                    resultado.setText("0");
                    Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
                } else {
                    float result = numero1 / numero2;
                    resultado.setText(Float.toString(result));
                }
            } else if (operacion.equals("+")) {
                float result = numero1 + numero2;
                resultado.setText(Float.toString(result));
            } else if (operacion.equals("*")) {
                float result = numero1 * numero2;
                resultado.setText(Float.toString(result));
            } else if (operacion.equals("-")) {
                float result = numero1 - numero2;
                resultado.setText(Float.toString(result));
            }
        } else {
            Toast.makeText(this, "Entrada no válida", Toast.LENGTH_SHORT).show();
        }
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }
    private float obtenerNumero() {
        String textoResultado = resultado.getText().toString().trim();
        if (!textoResultado.isEmpty()) {
            return Float.parseFloat(textoResultado);
        }
        return 0.0f;
    }
}