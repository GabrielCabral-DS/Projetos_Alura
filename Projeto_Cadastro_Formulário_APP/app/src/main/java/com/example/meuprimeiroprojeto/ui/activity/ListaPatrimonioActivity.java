package com.example.meuprimeiroprojeto.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.meuprimeiroprojeto.R;
import com.example.meuprimeiroprojeto.dao.PatrimonioDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListaPatrimonioActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_patrimonio);
        setTitle("Formulário Patrimônio");

        FloatingActionButton botaoNovoPatrimonio = findViewById(R.id.activity_lista_patrimonio_fab_novo);
        botaoNovoPatrimonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaPatrimonioActivity.this, FormularioPatrimonioActivity2.class));
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        PatrimonioDAO dao = new PatrimonioDAO();

        ListView listaDePatrimonio = findViewById(R.id.activity_lista_patrimonios_listview);
        listaDePatrimonio.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));
    }
}
