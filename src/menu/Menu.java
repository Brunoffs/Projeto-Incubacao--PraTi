package menu;


public class Menu {
    public static void menuPrincipal() {
        System.out.println("============================================================");
        System.out.println("Bem-vindo ao sistema de cadastro de alunos e pessoas!");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar novo aluno ou pessoa");
        System.out.println("2 - Mostrar todas pessoas ou alunos cadastrados");
        System.out.println("3 - Atualizar dados de uma pessoa ou aluno");
        System.out.println("4 - Deletar uma pessoa ou aluno");
        System.out.println("5 - Sobre o sistema");
        System.out.println("6 - Sair do sistema");
        System.out.println("============================================================");
    }

    public static void menuBuscarAlunosEPessoas() {
        System.out.println("============================================================");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Ver todos os alunos cadastrados");
        System.out.println("2 - Ver todas as pessoas cadastradas");
        System.out.println("============================================================");
    }
    public static void menuAtualizarCadastro() {
        System.out.println("============================================================");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Atualizar dado de aluno");
        System.out.println("2 - Atualizar dado de pessoa");
        System.out.println("============================================================");
    }
   public static void menuRemoverPessoaEAluno() {
       System.out.println("============================================================");
       System.out.println("Escolha uma opção");
       System.out.println("1 - Remover aluno");
       System.out.println("2 - Remover pessoa");
       System.out.println("============================================================");
   }

   public static void menuSobre() {
    System.out.println("Versão 1.0");
    System.out.println("Este sistema de cadastro de alunos e pessoas foi desenvolvido por Bruno Farias da Silva, para o desafio de Incubação do +prati de Outubro/2022");
   }
}
