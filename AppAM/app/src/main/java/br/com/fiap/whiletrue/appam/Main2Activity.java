package br.com.fiap.whiletrue.appam;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lstMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lstMenu = (ListView) findViewById(R.id.menu);
        lstMenu.setOnItemClickListener(this);

        mostrarTelaInicial();
    }

    public void telaInicial(View v) {
        mostrarTelaInicial();
    }

    public void mostrarTelaInicial() {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction t = fm.beginTransaction();
        t.replace(R.id.frame, new TelaInicioFragment());
        t.commit();

    }

    public void mostrarTelaRanking(View v) {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction t = fm.beginTransaction();
        t.replace(R.id.frame, new RankingFragment());
        t.commit();

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        // fechar o menu lateral automaticamente
        ((DrawerLayout) findViewById(R.id.activity_main2)).closeDrawer(lstMenu);

        if (position == 0) {
            mostrarTelaInicial();
        } else if (position == 1) {

        } else if(position == 2) {

        } else if(position == 3) {

        } else if(position == 4) {
            mostrarTelaRanking(view);
        } else if (position == 5){

        } else if (position == 6) {
            finish();
        }

    }
}
