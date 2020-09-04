package com.example.aplicativocarro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * recebe acao do botao Novo Veiculo
     * @param view
     */
    public void novoVeiculo(View view){
        //nova activity

        Intent it = new Intent(MainActivity.this,CarroActivity.class);//cria a intent

        startActivityForResult(it,121);//inicia nova activity
    }

    /**
     * recebe acao do botao Novo Veiculo
     * @param view
     */
    public void novoAbastecimento(View view){
        //nova activity

        Intent it = new Intent(MainActivity.this,AbastecimentoActivity.class);//cria a intent

        startActivityForResult(it,121);//inicia nova activity
    }

}