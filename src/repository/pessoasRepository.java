package repository;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class pessoasRepository {
    List<Pessoa> pessoasRepository = new ArrayList<>();

    public pessoasRepository() {
        this.pessoaRepository = new ArrayList<>();
    }

    public void salvarAluno(Pessoa pessoa) {
        this.pessoasRepository.add(pessoa);
    }

    public List<Pessoa> BuscarTodasPessoas() {
        return this.pessoasRepository.stream().collect(Collectors.toList());
    }
}
