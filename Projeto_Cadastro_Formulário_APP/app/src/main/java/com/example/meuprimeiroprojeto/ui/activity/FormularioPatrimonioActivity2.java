package com.example.meuprimeiroprojeto.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.meuprimeiroprojeto.R;
import com.example.meuprimeiroprojeto.dao.PatrimonioDAO;
import com.example.meuprimeiroprojeto.model.Patrimonio;

public class FormularioPatrimonioActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_patrimonio2);
        setTitle("Formulário");
        PatrimonioDAO dao =  new PatrimonioDAO();

        setTitle("Cadastro Patrimônio");

        final EditText campoNome = findViewById(R.id.activity_formulario_patrimonio_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_patrimonio_telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulario_patrimonio_email);
        final EditText campoEndereco = findViewById(R.id.activity_formulario_patrimonio_endereco);
        final EditText campoPatrimonio = findViewById(R.id.activity_formulario_patrimonio);


        Button botaosalvar = findViewById(R.id.activity_formulario_patrimonio_botao_salvar);
        botaosalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();
                String endereco = campoEndereco.getText().toString();
                String patrimonio = campoPatrimonio.getText().toString();

               Patrimonio PatrimonioCriado = new Patrimonio(nome, telefone, email,patrimonio,endereco);
                dao.salva(PatrimonioCriado);

                finish();
            }
        });

    }
}