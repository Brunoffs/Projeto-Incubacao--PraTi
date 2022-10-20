package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Aluno;

public class alunosRepository {
    List<Aluno> alunosRepository;

    public alunosRepository() {
        this.alunosRepository = new ArrayList<>();
    }

    public void salvarAluno(Aluno aluno) {
        this.alunosRepository.add(aluno);
    }

    public List<Aluno> BuscarTodosAlunos() {
        return this.alunosRepository.stream().collect(Collectors.toList());
    }
}
