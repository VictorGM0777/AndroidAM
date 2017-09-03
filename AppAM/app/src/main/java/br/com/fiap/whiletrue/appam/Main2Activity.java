package br.com.fiap.whiletrue.appam;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
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

    public void mostrarTelaCadastro(View v) {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction t = fm.beginTransaction();
        t.replace(R.id.frame, new CadastroProdutoFragment());
        t.commit();

    }

    public void mostrarTelaListaColeta(View v) {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction t = fm.beginTransaction();
        t.replace(R.id.frame, new ListaColetaFragment());
        t.commit();

    }

    public void mostrarTelaListaBeneficios(View v) {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction t = fm.beginTransaction();
        t.replace(R.id.frame, new ListaBeneficiosFragment());
        t.commit();

    }

    public void mostrarTelaPontosColeta(View v) {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction t = fm.beginTransaction();
        t.replace(R.id.frame, new PontosColetaFragment());
        t.commit();

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        // fechar o menu lateral automaticamente
        ((DrawerLayout) findViewById(R.id.activity_main2)).closeDrawer(lstMenu);

        if (position == 0) {
            mostrarTelaInicial();
        } else if (position == 1) {
            mostrarTelaCadastro(view);
        } else if(position == 2) {
            mostrarTelaListaColeta(view);
        } else if(position == 3) {
            mostrarTelaListaBeneficios(view);
        } else if(position == 4) {
            mostrarTelaRanking(view);
        } else if (position == 5){
            mostrarTelaPontosColeta(view);
        } else if (position == 6) {

            new AlertDialog.Builder(this)
                    .setMessage("Deseja realmente sair?")
                    .setCancelable(false)
                    .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Main2Activity.this.finish();
                        }
                    })
                    .setNegativeButton("Não", null)
                    .show();

        }

    }

    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setMessage("Deseja realmente sair?")
                .setCancelable(false)
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Main2Activity.this.finish();
                    }
                })
                .setNegativeButton("Não", null)
                .show();

    }
}
