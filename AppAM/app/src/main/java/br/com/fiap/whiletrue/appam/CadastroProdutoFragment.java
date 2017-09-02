package br.com.fiap.whiletrue.appam;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CadastroProdutoFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private Spinner spClientesCadastro;
    private TextView lblNomeConsultorCadastro;
    private EditText edtItemCadastro;
    private EditText edtQtdCadastro;
    private List<Cliente> clientes;
    private ArrayAdapter<Cliente> clientesAdpater;
    private Cliente selecionado;

    public void populaCliente() {

        clientes = new ArrayList<Cliente>();

        clientes.add(new Cliente("Cliente Teste 1"));
        clientes.add(new Cliente("Cliente Teste 2"));
        clientes.add(new Cliente("Cliente Teste 3"));

    }

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

        spClientesCadastro.setOnItemSelectedListener(this);
        populaCliente();
        populaSpinner();

        return v;
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnEnviarCadastro) {

            Log.i("EVENTO", "Gerou evento: Clicou no botão TESTE!!!");
            Log.i("cliente: ", selecionado.toString());

            Produto p = new Produto();

            p.setNome(edtItemCadastro.getText().toString());
            p.setQuantidade(Integer.parseInt(edtQtdCadastro.getText().toString()));
            p.setNomeCliente(selecionado.toString());

            Log.i("teste",p.getNomeCliente());
            Log.i("teste",p.getNome());
            Log.i("teste",String.valueOf(p.getQuantidade()));

        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        Cliente sel = (Cliente) adapterView.getItemAtPosition(i);
        this.selecionado = sel;

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private void populaSpinner() {
        clientesAdpater = new ArrayAdapter<Cliente>(this.getContext(), android.R.layout.simple_spinner_item, this.clientes);
        spClientesCadastro.setAdapter(clientesAdpater);
    }

}
