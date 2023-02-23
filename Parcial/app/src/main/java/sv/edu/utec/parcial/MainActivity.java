package sv.edu.utec.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtuser, edtPass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtuser = findViewById(R.id.edtAdmin);
        edtPass = findViewById(R.id.edtPassword);
        btnlogin = findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().toString().equals("parcialETps1")&&edtPass.getText().toString().equals("p4rC14l#tp$")){
                    Intent intent = new Intent(getApplicationContext(), Principal.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Contraseña o usuario no son correctas", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}