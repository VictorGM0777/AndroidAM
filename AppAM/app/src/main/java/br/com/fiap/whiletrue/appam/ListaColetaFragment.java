package br.com.fiap.whiletrue.appam;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by victo on 11/07/2017.
 */

public class ListaColetaFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private TextView vlItemLista;
    private TextView vlQtdLista;
    private TextView vlPontosLista;
    private CheckBox chColetado;
    private Spinner spClientesLista;
    private TextView txtPontosColetadosLista;
    private TextView txtPontosAColetarLista;

    public ListaColetaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // v = tela do fragment
        View v = inflater.inflate(R.layout.fragment_lista_coleta, container, false);

        v.findViewById(R.id.btnBuscaLista).setOnClickListener(this);
        v.findViewById(R.id.btnSalvarLista).setOnClickListener(this);

        vlItemLista = v.findViewById(R.id.vlItemLista);
        vlQtdLista = v.findViewById(R.id.vlQtdLista);
        vlPontosLista = v.findViewById(R.id.vlPontosLista);
        chColetado = v.findViewById(R.id.chColetado);

        spClientesLista = v.findViewById(R.id.spClientesLista);
        spClientesLista.setOnItemSelectedListener(this);

        txtPontosColetadosLista = v.findViewById(R.id.txtPontosColetadosLista);
        txtPontosAColetarLista = v.findViewById(R.id.txtPontosAColetarLista);

        return v;
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnBuscaLista) {

            vlItemLista.setVisibility(View.VISIBLE);
            vlQtdLista.setVisibility(View.VISIBLE);
            vlPontosLista.setVisibility(View.VISIBLE);
            chColetado.setVisibility(View.VISIBLE);

            txtPontosColetadosLista.setText("0 pts");
            txtPontosAColetarLista.setText("20 pts");

        } else if (view.getId() == R.id.btnSalvarLista) {

            if(chColetado.isChecked()) {
                txtPontosColetadosLista.setText("20 pts");
                txtPontosAColetarLista.setText("0 pts");
            } else {
                txtPontosColetadosLista.setText("0 pts");
                txtPontosAColetarLista.setText("20 pts");
            }

            Toast.makeText(this.getContext(), "Informações salvas com sucesso!", Toast.LENGTH_SHORT).show();

        } else if (view.getId() == R.id.chColetado) {

            if(chColetado.isChecked()) {
                txtPontosColetadosLista.setText("20 pts");
                txtPontosAColetarLista.setText("0 pts");
            } else {
                txtPontosColetadosLista.setText("0 pts");
                txtPontosAColetarLista.setText("20 pts");
            }

        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        vlItemLista.setVisibility(View.INVISIBLE);
        vlQtdLista.setVisibility(View.INVISIBLE);
        vlPontosLista.setVisibility(View.INVISIBLE);
        chColetado.setVisibility(View.INVISIBLE);

        txtPontosColetadosLista.setText("0 pts");
        txtPontosAColetarLista.setText("0 pts");

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
