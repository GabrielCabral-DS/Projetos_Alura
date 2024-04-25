package br.com.gabrielcabral.dao;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import br.com.gabrielcabral.model.Aluno;

public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();

    private static int contadosDeIds = 1;

    public List<Aluno> todos(){
        return new ArrayList<>(alunos);
    }

    public void salva(Aluno alunoCriado) {
        alunoCriado.setId(contadosDeIds);
        alunos.add(alunoCriado);
        atualizaId();
    }

    private void atualizaId() {
        contadosDeIds++;
    }

    public void edita(Aluno aluno){
        Aluno alunoEcontrado = buscaAlunoPeloId(aluno);
        if (alunoEcontrado != null){
           int posicaoDoAluno = alunos.indexOf(alunoEcontrado);
           alunos.set(posicaoDoAluno, aluno);
        }
    }

    @Nullable
    private Aluno buscaAlunoPeloId(Aluno aluno) {
        for (Aluno a : alunos){
            if(a.getId() == aluno.getId()){
                return a;
            }
        }
        return null;
    }

    public void remove(Aluno aluno) {
        Aluno alunoDevolvido = buscaAlunoPeloId(aluno);
        alunos.remove(alunoDevolvido);
    }
}
