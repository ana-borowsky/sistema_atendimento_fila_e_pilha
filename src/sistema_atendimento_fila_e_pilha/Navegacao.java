package sistema_atendimento_fila_e_pilha;

import java.util.Random;
import java.util.Scanner;

public class Navegacao {
    public Fila fila;
    public Pilha pilha;
    public DadosCliente dadosCliente;
    public DadosSolicitacao dadosSolicitacao;

    public Navegacao(Fila fila, Pilha pilha) {
        this.fila = fila;
        this.pilha = pilha;

    }

    String[] opcoes = {"Atendimento", "Solicitações", "Atender", "Ver próxima solicitação",
            "Passar para atendimento","Nova solicitação", "Ver solicitação",
            "Adicionar à fila de atendimento", "Sua opção: ", "Deletar", "Voltar",
            "Sair", "Insira a descrição da solicitação: ", "Resposta ao cliente: ", "Nome do cliente: ", "Motivo do atendimento: ",
            "Data:","Hora:"};

    Scanner scanner = new Scanner(System.in);
    GeraMenu menu = new GeraMenu(opcoes);

    public void executando(){
        boolean rodaPrograma = true;
        while (rodaPrograma) {
            menu.menuPrincipal();
            int opcaoSelecionada = lerOpcao(scanner);

            switch (opcaoSelecionada){
                case 1 :
                    menu.menuAtendimento();
                    int opcaoAtendimento = lerOpcao(scanner);

                    switch (opcaoAtendimento){
                        case 1:
                            menu.menuAtender();
                            scanner.nextLine();
                            String resposta = scanner.nextLine();
                            break;

                        case 2:
                            menu.menuVerSolicitacao();
                            proximaSolicitacao();
                            break;

                        case 3:
                            //Opção para voltar ao menu principal
                            scanner.nextLine();
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;

                    }
                    break;

                case 2:
                    menu.menuSolicitacoes();
                    int opcaoSolicitacao = lerOpcao(scanner);

                    switch (opcaoSolicitacao){
                        case 1:
                            menu.menuNovaSolicitacao();
                            scanner.nextLine();



                            System.out.println(opcoes[12]);
                            String descricaoSolicitacao = scanner.nextLine();

                            System.out.println(opcoes[16]);
                            String data = scanner.nextLine();

                            System.out.println(opcoes[17]);
                            String hora = scanner.nextLine();

                            System.out.println("Solicitação foi criada e adicionada na pilha de solicitções com sucesso.");

                            break;

                        case 2:
                            menu.menuVerSolicitacao();
                            proximaSolicitacao();
                            break;

                        case 3:
                            //Opção para voltar ao menu principal
                            scanner.nextLine();
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;

                    }
                    break;

                case 3:
                    rodaPrograma = false;
                    System.out.println("Programa Encerrado, tenha um excelente dia!!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }
    }
    public void proximaSolicitacao(){
        int opcaoProximaSolicitacao = lerOpcao(scanner);
        switch (opcaoProximaSolicitacao){
            case 1:
                menu.menuPassarParaAtendimento();
                scanner.nextLine();

                System.out.println(opcoes[14]);
                String nome = scanner.nextLine();

                System.out.println(opcoes[15]);
                String motivo = scanner.nextLine();

                //Chamar a funcao de inserir na o elemnto na fila
                System.out.println("Solicitação foi passada para a fila de atendimento com sucesso.");


                break;
            case 2:
                //Adicionar o metodo para excluir a solicitacao da pilha
                System.out.println("A solicitação foi excluida com sucesso."); // Print para teste.
                break;

            case 3:
                //Opção para voltar ao menu principal
                scanner.nextLine();
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
    public static int lerOpcao(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            throw new RuntimeException();
        }
    }


}