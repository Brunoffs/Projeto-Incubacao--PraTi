package service;

import java.util.List;
import java.util.Scanner;

import model.Pessoa;
import repository.pessoasRepository;

public class PessoaService {
    Scanner sc;
    pessoasRepository pessoasRepository = new pessoasRepository();

    public PessoaService(Scanner sc) {
        this.sc = sc;
        this.pessoasRepository.salvarPessoa(new Pessoa("Renan", "84951897", "15/09/1988"));
    }
    public void salvarPessoa(Pessoa pessoa) {
        this.pessoasRepository.salvarPessoa(pessoa);
    }
    public Pessoa CadastrarPessoa(String nome, String telefone, String dataNascimento) {
        sc.nextLine();
        System.out.println("Cadastrando nova pessoa!");
        System.out.println("Digite o nome da pessoa: ");
        nome = sc.nextLine();
        System.out.println("Digite o telefone da pessoa: ");
        telefone = sc.nextLine();
        System.out.println("Digite a data de nascimento da pessoa(DD/MM/AAAA): ");
        dataNascimento = sc.nextLine();
        Pessoa pessoa = new Pessoa(nome, telefone, dataNascimento);
        pessoasRepository.salvarPessoa(pessoa);
        return pessoa;
    }

    public void buscarPessoas() {
        List<Pessoa> pessoas = pessoasRepository.BuscarTodasPessoas();
        
        for(Pessoa pessoa:pessoas) {
            System.out.println(pessoa);
        }
    }
}
