package sv.edu.utec.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtValor, edtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor = findViewById(R.id.edtTabla);
        edtResultado = findViewById(R.id.edtMtabla);
    }

    public void Tabla(View v){
        int valTabla = Integer.parseInt(edtValor.getText().toString());

        int resultados;
        String resultado = "";
        edtResultado.setText(resultado);

        for(int i = 0; i<=10; i++){

            resultados = valTabla * i;

            resultado = String.valueOf(resultados);
            edtResultado.append(valTabla + " * " + i + " = " + resultado + "\n");
        }

    }
}