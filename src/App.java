import java.util.Scanner;

import menu.Menu;
import service.AlunoService;

/*
Criar um CRUD (Create, Read, Update, Delete) de pessoas/alunos no terminal usando somente Java:
Deve possuir as funcionalidades:
 - Criar pessoa ou aluno;
 - Mostrar todas as pessoas e alunos criadas (listar na tela);
 - Atualizar dados de uma pessoa ou aluno;
 - Deletar uma pessoa ou aluno;
 - Encerrar programa.
 Informações de uma pessoa/aluno:
 Nome, Telefone, Data de nascimento, Data de cadastro da pessoa, Data da última alteração,
 Nota final do curso, caso o usuário informe a nota final do curso, deve ser criado um aluno. Caso não seja informado, deve ser criada uma pessoa.

 Criar menu interativo que o usuário possa usar para executar as opções acima.

O menu deve continuar sendo exibido até que o usuário use a opção de encerrar a aplicação.
O avaliado deve usar arrays para armazenar as pessoas criadas.
O avaliado deve usar herança para que um aluno aproveite todos os dados da pessoa.

Todas as informações ficam em memória. Não é necessário cadastrar em banco de dados. Ou seja, quando encerrar a aplicação, perde-se todo o histórico.
Não devee ser usado nenhum framework no projeto. Deve-se usar recursos do Java nativo somente.

 */
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       boolean continuar = true;
       AlunoService alunoService = new AlunoService(sc);

       do{
        Menu.menu1();
        int opcao1 = sc.nextInt();
        
        switch(opcao1) {
            case 1:
            System.out.println("Criando novo cadastro!");
            Thread.sleep(1500);
            System.out.println("A pessoa a ser cadastrada possui nota? (1 para SIM; 2 para NÃO)");
            int opcao2 = sc.nextInt();
            if(opcao2 == 1) {
                alunoService.cadastrarAluno();               
            }else{

            }
        }
       }while(continuar);
       sc.close();
    }
}
