package br.com.fiap.whiletrue.appam;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by victo on 11/07/2017.
 */

public class PontosColetaFragment extends Fragment implements View.OnClickListener {

    public PontosColetaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // v = tela do fragment
        View v = inflater.inflate(R.layout.fragment_pontos_coleta, container, false);

        WebView wv = (WebView) v.findViewById(R.id.wvPontosColeta);
        WebSettings ws = wv.getSettings();

        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        wv.loadUrl("https://www.google.com.br/");

        return v;
    }

    @Override
    public void onClick(View view) {

    }

}
