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
    private TextView txtNomeConsultorRanking2;
    private TextView txtNomeConsultorRanking3;
    private TextView txtNomeConsultorRanking4;
    private TextView txtNomeConsultorRanking5;
    private TextView txtNomeConsultorRanking6;
    private TextView txtNomeConsultorRanking7;

    public RankingFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // v = tela do fragment
        View v = inflater.inflate(R.layout.fragment_ranking, container, false);

        rgRanking = (RadioGroup) v.findViewById(R.id.radioRanking);
        rgRanking.setOnCheckedChangeListener(this);

        txtNomeConsultorRanking = (TextView) v.findViewById(R.id.txtNomeConsultorRanking);
        txtNomeConsultorRanking2 = (TextView) v.findViewById(R.id.txtNomeConsultorRanking2);
        txtNomeConsultorRanking3 = (TextView) v.findViewById(R.id.txtNomeConsultorRanking3);
        txtNomeConsultorRanking4 = (TextView) v.findViewById(R.id.txtNomeConsultorRanking4);
        txtNomeConsultorRanking5 = (TextView) v.findViewById(R.id.txtNomeConsultorRanking5);
        txtNomeConsultorRanking6 = (TextView) v.findViewById(R.id.txtNomeConsultorRanking6);
        txtNomeConsultorRanking7 = (TextView) v.findViewById(R.id.txtNomeConsultorRanking7);

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
                this.txtNomeConsultorRanking2.setText(R.string.teste_mensal);
                this.txtNomeConsultorRanking3.setText(R.string.teste_mensal);
                this.txtNomeConsultorRanking4.setText(R.string.teste_mensal);
                this.txtNomeConsultorRanking5.setText(R.string.teste_mensal);
                this.txtNomeConsultorRanking6.setText(R.string.teste_mensal);
                this.txtNomeConsultorRanking7.setText(R.string.teste_mensal);
                break;
            case R.id.radioAnualRanking:
                this.txtNomeConsultorRanking.setText(R.string.teste_anual);
                this.txtNomeConsultorRanking2.setText(R.string.teste_anual);
                this.txtNomeConsultorRanking3.setText(R.string.teste_anual);
                this.txtNomeConsultorRanking4.setText(R.string.teste_anual);
                this.txtNomeConsultorRanking5.setText(R.string.teste_anual);
                this.txtNomeConsultorRanking6.setText(R.string.teste_anual);
                this.txtNomeConsultorRanking7.setText(R.string.teste_anual);
                break;
            default:
                break;

        }

    }

}
