package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Pessoa;

public class pessoasRepository {
    List<Pessoa> pessoasRepository;

    public pessoasRepository() {
        this.pessoasRepository = new ArrayList<>();
    }

    public void salvarPessoa(Pessoa pessoa) {
        this.pessoasRepository.add(pessoa);
    }

    public List<Pessoa> BuscarTodasPessoas() {
        return this.pessoasRepository.stream().collect(Collectors.toList());
    }

    public void removerPessoa(Pessoa pessoa) {
        this.pessoasRepository.remove(pessoa);
    }
}
