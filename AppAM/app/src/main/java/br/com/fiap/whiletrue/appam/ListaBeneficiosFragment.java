package br.com.fiap.whiletrue.appam;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by victo on 11/07/2017.
 */

public class ListaBeneficiosFragment extends Fragment implements View.OnClickListener {

    private TextView lblNumPontosLstBeneficios;

    public ListaBeneficiosFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // v = tela do fragment
        View v = inflater.inflate(R.layout.fragment_lista_beneficios, container, false);

        v.findViewById(R.id.btnResgatar1LstBeneficios).setOnClickListener(this);
        v.findViewById(R.id.btnResgatar2LstBeneficios).setOnClickListener(this);

        lblNumPontosLstBeneficios = v.findViewById(R.id.lblNumPontosLstBeneficios);


        return v;
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnResgatar1LstBeneficios) {

            if(lblNumPontosLstBeneficios.getText().toString().equals("0 pts")) {
                Toast.makeText(this.getContext(), "Você não possui pontos!", Toast.LENGTH_SHORT).show();
            } else {
                lblNumPontosLstBeneficios.setText("0 pts");
                Toast.makeText(this.getContext(), "Produto resgatado!", Toast.LENGTH_SHORT).show();
            }
        } else if (view.getId() == R.id.btnResgatar2LstBeneficios) {
            if(lblNumPontosLstBeneficios.getText().toString().equals("0 pts")) {
                Toast.makeText(this.getContext(), "Você não possui pontos!", Toast.LENGTH_SHORT).show();
            } else {
                lblNumPontosLstBeneficios.setText("0 pts");
                Toast.makeText(this.getContext(), "Produto resgatado!", Toast.LENGTH_SHORT).show();
            }
        }

    }

}
