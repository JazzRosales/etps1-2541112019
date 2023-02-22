package sv.edu.utec.proyintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etVal1, etval2;
    Button btnCalculo;
    TextView twResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etVal1 = findViewById(R.id.edtVal1);
        etval2 = findViewById(R.id.edtVal2);
        twResultado = findViewById(R.id.txvResultado);
    }
    //void ----------------------------> metodo sin retorno
    // int, string, double,etc...------> metodo con retorno
    public void Suma(View view){
        double dato1, dato2, resultado;

        dato1 = Double.parseDouble(etVal1.getText().toString());
        dato2 = Double.parseDouble(etval2.getText().toString());
        resultado = dato1 + dato2;
        twResultado.setText("El resultado es: " + String.valueOf(resultado));
    }
}