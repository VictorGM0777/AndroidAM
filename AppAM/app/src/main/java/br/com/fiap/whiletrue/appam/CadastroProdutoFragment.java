package br.com.fiap.whiletrue.appam;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CadastroProdutoFragment extends Fragment implements View.OnClickListener {

    public CadastroProdutoFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // v = tela do fragment
        View v = inflater.inflate(R.layout.fragment_cadastro, container, false);
        v.findViewById(R.id.btnEnviarCadastro).setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnEnviarCadastro) {
            Log.i("EVENTO", "Gerou evento: Clicou no botão!!!");
        }

    }

}
