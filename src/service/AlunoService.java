package service;

import java.util.List;
import java.util.Scanner;

import model.Aluno;
import repository.alunosRepository;

public class AlunoService {
    Scanner sc;
    alunosRepository alunosRepository = new alunosRepository();
    
    public AlunoService(Scanner sc) {
        this.sc = sc;
        this.alunosRepository.salvarAluno(new Aluno("Bruno", "55975159432", "19/10/1992", "10"));
    }
    public Aluno cadastrarAluno(String nome, String telefone, String dataNascimento, String notaCurso) {
        sc.nextLine();
        System.out.println("Cadastrando novo aluno!");
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Digite o telefone do aluno: ");
        telefone = sc.nextLine();
        System.out.println("Digite a data de nascimento do aluno(DD/MM/AAAA): ");
        dataNascimento = sc.nextLine();
        System.out.println("Digite a nota final do aluno no curso: ");
        notaCurso = sc.nextLine();
        Aluno aluno = new Aluno(nome, telefone, dataNascimento, notaCurso);
        alunosRepository.salvarAluno(aluno);
        return aluno;
    }

    public void buscarAlunos() {
        List<Aluno> alunos = alunosRepository.BuscarTodosAlunos();
        
        for(Aluno aluno:alunos) {
            System.out.println(aluno);
        }
        if(alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado!");
        }
    }

    public void deletarAluno(Integer id) {
        List<Aluno> alunos = this.alunosRepository.BuscarTodosAlunos();
        if(alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados!");
        } else {
        System.out.println("Entre com o Id do aluno a ser removido: ");
        id = sc.nextInt();
        
        for(Aluno aluno:alunos) {
            if(id == aluno.getId()) {
                this.alunosRepository.removerPorId(aluno);
                System.out.println("Removido com sucesso!");
            } else {
                System.out.println("Id não encontrado! Tente novamente");
            }
        }
    }
}

    public void atualizarAluno(Integer id) {
        List<Aluno> alunos = this.alunosRepository.BuscarTodosAlunos();
        if(alunos.isEmpty()) {
            System.out.println("Não há alunos cadastrados!");
        } else {
        System.out.println("Entre com o Id do aluno a ser alterado: ");
        id = sc.nextInt();
        for(Aluno aluno:alunos) {
            if(id == aluno.getId()) {
                System.out.println("Este é o aluno que será alterada " + aluno);
                sc.nextLine();
                System.out.println("Entre com o novo nome da pessoa: ");
                String nome = sc.nextLine();
                aluno.setNome(nome);
                System.out.println("Entre com o novo número de telefone da pessoa: ");
                String telefone = sc.nextLine();
                aluno.setTelefone(telefone);
                System.out.println("Entre com a nova data de nascimento da pessoa: ");
                String DataNascimento = sc.nextLine();
                aluno.setDataNascimento(DataNascimento);
                System.out.println("Entre com a nova nota final do curso: ");
                String notaCurso = sc.nextLine();
                aluno.setNotaCurso(notaCurso);
                aluno.setDataUltimaModificacao();
            } else {
                System.out.println("Id não encontrado! Tente novamente");
            }
            };
        }
}
}
