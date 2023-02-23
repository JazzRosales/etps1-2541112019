package sv.edu.utec.calculoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtPeso, edtAltura, edtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPeso = findViewById(R.id.edtPeso);
        edtAltura = findViewById(R.id.edtAltura);
        edtResultado = findViewById(R.id.edtResult);
    }

    public void Resultado(View v){
        double peso = 0, altura = 0, resultado, imc;
        imc = (peso)/(altura*altura);


    }

}