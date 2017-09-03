package br.com.fiap.whiletrue.appam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText edtId;
    private EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        edtId = (EditText) findViewById(R.id.edtId);
        edtSenha = (EditText) findViewById(R.id.edtSenha);

    }

    public void abreTela2(View v) {

        if(!edtId.getText().toString().equals("teste") || !edtSenha.getText().toString().equals("12345")) {
            Toast.makeText(this, "Usuário/Senha incorretos!", Toast.LENGTH_SHORT).show();
        } else {
            Intent paraTela2 = new Intent(this, Main2Activity.class);
            startActivity(paraTela2);
        }

    }

}
