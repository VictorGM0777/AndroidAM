package br.com.fiap.whiletrue.appam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    public void abreTela2(View v) {

        Intent paraTela2 = new Intent(this, Main2Activity.class);
        startActivity(paraTela2);

    }

}
