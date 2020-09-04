package com.example.aplicativocarro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.aplicativocarro.domain.Carro;
import com.example.aplicativocarro.domain.CarroDao;

public class ListarCarrosActvity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_carros_actvity);

        lv = (ListView) findViewById(R.id.listacarro);
        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<Carro> arrayAdapter = new ArrayAdapter<Carro>(this, android.R.layout.simple_list_item_1, CarroDao.getDados());

        lv.setAdapter(arrayAdapter);
    }
    /**
     * Ação botao salvar veiculo
     * @param view
     */
    public void voltar(View view){
        super.onBackPressed();
    }
}