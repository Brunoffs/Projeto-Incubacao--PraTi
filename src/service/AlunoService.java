package service;

import java.util.Scanner;

import model.Aluno;
import repository.alunosRepository;

public class AlunoService {
    Scanner sc;
    alunosRepository repository = new alunosRepository();
    public AlunoService(Scanner sc) {
        this.sc = sc;
        this.repository.salvarAluno(new Aluno("Bruno", "55975159432", "19/10/1992", "10"));
    }
    public Aluno cadastrarAluno() {
        sc.nextLine();
        System.out.println("Cadastrando novo aluno!");
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite o telefone do aluno: ");
        String telefone = sc.nextLine();
        System.out.println("Digite a data de nascimento do aluno: ");
        String dataNascimento = sc.nextLine();
        System.out.println("Digite a nota final do aluno no curso: ");
        String notaCurso = sc.nextLine();
        Aluno aluno = new Aluno(nome, telefone, dataNascimento, notaCurso);
        this.repository.salvarAluno(aluno);
        return aluno;
    }
}
