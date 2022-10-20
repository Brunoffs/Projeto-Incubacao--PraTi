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
    }
}
