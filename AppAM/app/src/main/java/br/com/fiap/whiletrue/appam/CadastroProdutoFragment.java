package br.com.fiap.whiletrue.appam;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CadastroProdutoFragment extends Fragment implements View.OnClickListener {

    private Spinner spClientesCadastro;
    private TextView lblNomeConsultorCadastro;
    private EditText edtItemCadastro;
    private EditText edtQtdCadastro;

    public CadastroProdutoFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // v = tela do fragment
        View v = inflater.inflate(R.layout.fragment_cadastro, container, false);
        v.findViewById(R.id.btnEnviarCadastro).setOnClickListener(this);

        spClientesCadastro = v.findViewById(R.id.spClientesCadastro);
        lblNomeConsultorCadastro = v.findViewById(R.id.lblNomeConsultorCadastro);
        edtItemCadastro = v.findViewById(R.id.edtItemCadastro);
        edtQtdCadastro = v.findViewById(R.id.edtQtdCadastro);

        return v;
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnEnviarCadastro) {
            Log.i("EVENTO", "Gerou evento: Clicou no botão TESTE!!!");
        }

    }

}
