package br.com.fiap.whiletrue.appam;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RankingFragment extends Fragment implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    private RadioGroup rgRanking;
    private TextView txtNomeConsultorRanking;

    public RankingFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // v = tela do fragment
        View v = inflater.inflate(R.layout.fragment_ranking, container, false);

        rgRanking = (RadioGroup) v.findViewById(R.id.radioRanking);
        rgRanking.setOnCheckedChangeListener(this);

        txtNomeConsultorRanking = (TextView) v.findViewById(R.id.txtNomeConsultorRanking);

        return v;
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

        mudarTexto();

    }

    private void mudarTexto() {

        int tam = this.rgRanking.getCheckedRadioButtonId();

        switch (tam) {

            case R.id.radioMensalRanking:
                this.txtNomeConsultorRanking.setText(R.string.teste_mensal);
                break;
            case R.id.radioAnualRanking:
                this.txtNomeConsultorRanking.setText(R.string.teste_anual);
                break;
            default:
                break;

        }

    }

}
