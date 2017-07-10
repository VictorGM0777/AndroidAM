package br.com.fiap.whiletrue.appam;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by victo on 10/07/2017.
 */

public class RankingFragment extends Fragment implements View.OnClickListener {

    public RankingFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // v = tela do fragment
        View v = inflater.inflate(R.layout.fragment_ranking, container, false);

        v.findViewById(R.id.btnAplicar).setOnClickListener(this);
        v.findViewById(R.id.btnResgatar).setOnClickListener(this);

        return v;

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnAplicar)
            Log.i("EVENTO", "Gerou evento: APLICACAO!!!");
        else if (view.getId() == R.id.btnResgatar)
            Log.i("EVENTO", "Gerou evento: RESGATE!!!");

    }

}
