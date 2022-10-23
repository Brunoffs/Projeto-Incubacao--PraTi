import java.util.Scanner;

import menu.Menu;
import model.Aluno;
import model.Pessoa;
import repository.alunosRepository;
import repository.pessoasRepository;
import service.AlunoService;
import service.PessoaService;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       boolean continuar = true;
       AlunoService alunoService = new AlunoService(sc);
       PessoaService pessoaService = new PessoaService(sc);
       pessoasRepository pessoasRepository = new pessoasRepository();
       alunosRepository alunosRepository = new alunosRepository();

       do{
        Menu.menuPrincipal();
        int opcao1 = sc.nextInt();
        switch(opcao1) {
            case 1:
            System.out.println("Criando novo cadastro!");
            Thread.sleep(1200);
            System.out.println("A pessoa a ser cadastrada possui nota? (1 para SIM; 2 para NÃO)");
            int opcao2 = sc.nextInt();
                if(opcao2 == 1) {
                    Aluno aluno = alunoService.cadastrarAluno(null, null, null, null);
                    alunosRepository.salvarAluno(aluno);
                }else if (opcao2 == 2){
                    Pessoa pessoa = pessoaService.CadastrarPessoa(null, null, null);
                    pessoasRepository.salvarPessoa(pessoa);
                }else {
                    System.out.println("Opção inválida, tente novamente!");
                }
                break;
            case 2:
            Menu.menuBuscarAlunosEPessoas();
            int opcao3 = sc.nextInt();
            if(opcao3 == 1){
                alunoService.buscarAlunos();
            }else if(opcao3 == 2){
                pessoaService.buscarPessoas();
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
            break;
            case 3:
            Menu.menuAtualizarCadastro();
            int opcao4 = sc.nextInt();
            if(opcao4 == 1) {
                alunoService.atualizarAluno(null);
            } else if(opcao4 == 2) {
                pessoaService.atualizarPessoa(null);
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
            break;
            case 4:
            Menu.menuRemoverPessoaEAluno();
            int opcao5 = sc.nextInt();
            if(opcao5 == 1) {
                alunoService.deletarAluno(null);
            }
            else if(opcao5 == 2) {
                pessoaService.deletarPessoa(null);
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
            break;
            case 5:
            Menu.menuSobre();
            break;
            case 6:
            continuar = false;
            break;
            default: 
            System.out.println("Opção inválida, tente novamente!");
        }
       }while(continuar);
       sc.close();
    }
}
