package com.example.aplicativocarro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.aplicativocarro.domain.Carro;
import com.example.aplicativocarro.domain.CarroDao;

public class CarroActivity extends AppCompatActivity {

    private EditText nome;
    private EditText ano;
    private EditText placa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);
        nome= findViewById(R.id.nome);
        ano= findViewById(R.id.ano);
        placa= findViewById(R.id.placa_abastecimento);
    }

    /**
     * Ação botao salvar veiculo
     * @param view
     */
    public void listagemIr(View view){
        //nova activity

        Intent it = new Intent(CarroActivity.this,ListarCarrosActvity.class);//cria a intent

        startActivityForResult(it,121);//inicia nova activity
    }

    /**
     * Ação botao salvar veiculo
     * @param view
     */
    public  void salvarVeiculo(View view){
        //crio carro
        Carro carro = new Carro();
        //pego os dados e preencho o carro
        carro.setNome(nome.getText().toString());
        carro.setAno(Integer.parseInt(ano.getText().toString()));
        carro.setPlaca(placa.getText().toString());
        //salvo carro na lista
        CarroDao.salvar(carro);
        //verifico se foi salvo
        System.out.println(CarroDao.getDados());
        //  finish();//fecha
        super.onBackPressed();
    }

    /**
     * Ação botao salvar veiculo
     * @param view
     */
    public  void excluirVeiculo(View view){
        Intent it = new Intent(CarroActivity.this,ExcluirCarroActivity.class);//cria a intent

        startActivityForResult(it,121);//inicia nova activity
    }

    /**
     * Ação botao salvar veiculo
     * @param view
     */
    public  void editarVeiculo(View view){
        Intent it = new Intent(CarroActivity.this,EditarCarroActivity.class);//cria a intent

        startActivityForResult(it,121);//inicia nova activity
    }
    /**
     * Ação botao salvar veiculo
     * @param view
     */
    public void voltar(View view){
        super.onBackPressed();
    }
}