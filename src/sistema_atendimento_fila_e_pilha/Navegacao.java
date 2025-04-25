package sistema_atendimento_fila_e_pilha;

import java.util.Scanner;

public class Navegacao {
    public Fila fila;
    public Pilha pilha;
    public GeraMenu menu;
    public DadosCliente dadosCliente;
    public DadosSolicitacao dadosSolicitacao;

    public Navegacao(Fila fila, Pilha pilha, GeraMenu menu) {
        this.fila = fila;
        this.pilha = pilha;
        this.menu = menu;
    }

    Scanner scanner = new Scanner(System.in);

    public void executando(){
        boolean rodaPrograma = true;
        while (rodaPrograma) {
            menu.menuPrincipal();
            int opcaoSelecionada = lerOpcao(scanner);

            switch (opcaoSelecionada){
                case 1:
                    menuAtendimento();
                    break;

                case 2:
                    menuSolicitacao();
                    break;


                case 3:
                    rodaPrograma = false;
                    System.out.println("Programa encerrado, tenha um excelente dia!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public void menuAtendimento(){
        menu.menuAtendimento();
        int opcaoAtendimento = lerOpcao(scanner);

        switch (opcaoAtendimento){
            case 1:
                scanner.nextLine();
                if (!fila.vazia()) {
                    menu.menuAtender();
                    fila.imprimePrimeiroElemento();
                    System.out.println(OpcoesMenu.RESPOSTA_CLIENTE);
                    scanner.nextLine();
                    fila.remove();
                } else {
                    menu.menuAtender();
                    fila.imprime();
                }
                break;

            case 2:
                menu.mostrarProximoFila();
                if (!fila.vazia()){
                    fila.imprimePrimeiroElemento();
                } else {
                    fila.imprime();
                }
                break;

            case 3:
                menu.mostrarFilaAtendimento();
                fila.imprime();
                break;

            case 4:
                scanner.nextLine(); // voltar
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public void menuSolicitacao(){
        menu.menuSolicitacoes();
        int opcaoSolicitacao = lerOpcao(scanner);

        switch (opcaoSolicitacao){
            case 1:
                menu.menuNovaSolicitacao();
                System.out.println("Complete os campos abaixo\n");
                scanner.nextLine();

                System.out.println(OpcoesMenu.ID_CLIENTE);
                String id = scanner.nextLine();

                System.out.println(OpcoesMenu.DESCRICAO);
                String descricaoSolicitacao = scanner.nextLine();

                System.out.println(OpcoesMenu.DATA);
                String data = scanner.nextLine();

                System.out.println(OpcoesMenu.HORA);
                String hora = scanner.nextLine();

                this.dadosSolicitacao = new DadosSolicitacao(id, descricaoSolicitacao, data, hora);
                pilha.insere(dadosSolicitacao);
                break;

            case 2:
                menu.opcaoSelecionada(OpcoesMenu.VER_PROXIMA_SOLICITACAO);
                if (!pilha.vazia()) {
                    pilha.imprimeTopo();
                    menu.menuVerSolicitacao();
                    verProximaSolicitacao();
                } else {
                    pilha.imprime();
                }
                break;

            case 3:
                menu.opcaoSelecionada(OpcoesMenu.VER_TODAS_SOLICITACOES);
                pilha.imprime();
                break;

            case 4:
                scanner.nextLine(); // voltar
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }


    }

    public void verProximaSolicitacao(){
        int opcaoProximaSolicitacao = lerOpcao(scanner);
        switch (opcaoProximaSolicitacao){
            case 1:
                menu.menuPassarParaAtendimento();
                System.out.println("Complete os campos abaixo\n");
                scanner.nextLine();

                System.out.println(OpcoesMenu.ID_CLIENTE);
                String id = scanner.nextLine();

                System.out.println(OpcoesMenu.NOME_CLIENTE);
                String nome = scanner.nextLine();

                System.out.println(OpcoesMenu.MOTIVO);
                String motivo = scanner.nextLine();

                this.dadosCliente = new DadosCliente(id, nome, motivo);
                fila.insere(dadosCliente);
                pilha.remove();
                break;

            case 2:
                pilha.remove();
                break;

            case 3:
                menuSolicitacao();
                scanner.nextLine(); // voltar
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
            throw new RuntimeException("Entrada inválida.");
        }
    }
}
