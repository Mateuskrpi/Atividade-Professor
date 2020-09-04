package com.example.aplicativocarro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.aplicativocarro.domain.Carro;
import com.example.aplicativocarro.domain.CarroDao;

public class ExcluirCarroActivity extends AppCompatActivity {

    private EditText placa_excluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excluir_carro);
        placa_excluir = findViewById(R.id.Placa_Excluir);
    }

    /**
     * Ação botao salvar veiculo
     * @param view
     */
    public void excluirCarro(View view)
    {
        CarroDao.remove(placa_excluir.getText().toString());
        //verifico se foi excluido
        System.out.println(CarroDao.getDados());
        //  finish();//fecha
        super.onBackPressed();
    }
}