package br.com.fiap.whiletrue.appam;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by victo on 11/07/2017.
 */

public class CadastroProdutoFragment extends Fragment implements View.OnClickListener {

    public CadastroProdutoFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // v = tela do fragment
        View v = inflater.inflate(R.layout.fragment_cadastro, container, false);

        return v;
    }

    @Override
    public void onClick(View view) {

    }

}
