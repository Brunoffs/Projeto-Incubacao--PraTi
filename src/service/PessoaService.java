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

    public void deletarPessoa(Integer id) {
        System.out.println("Entre com o Id da pessoa a ser removida: ");
        id = sc.nextInt();
        List<Pessoa> pessoas = this.pessoasRepository.BuscarTodasPessoas();
        for(Pessoa pessoa:pessoas) {
            if(id == pessoa.getId()) {
                this.pessoasRepository.removerPessoa(pessoa);
                System.out.println("Removido com sucesso!");
            }
        }
    }
    public void atualizarPessoa(Integer id) {
        System.out.println("Entre com o Id da pessoa a ser alterada: ");
        id = sc.nextInt();
        List<Pessoa> pessoas = this.pessoasRepository.BuscarTodasPessoas();
        for(Pessoa pessoa:pessoas) {
            if(id == pessoa.getId()) {
                System.out.println("Esta é a pessoa que será alterada " + pessoa);
                sc.nextLine();
                System.out.println("Entre com o novo nome da pessoa: ");
                String nome = sc.nextLine();
                pessoa.setNome(nome);
                System.out.println("Entre com o novo número de telefone da pessoa: ");
                String telefone = sc.nextLine();
                pessoa.setTelefone(telefone);
                System.out.println("Entre com a nova data de nascimento da pessoa: ");
                String DataNascimento = sc.nextLine();
                pessoa.setDataNascimento(DataNascimento);
                pessoa.setDataUltMod();
            }
            };
        }
    }

