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

    private final Scanner scanner = new Scanner(System.in);

    public void executando() {
        boolean rodaPrograma = true;
        while (rodaPrograma) {
            menu.menuPrincipal();
            int opcaoSelecionada = lerOpcao(scanner);

            switch (opcaoSelecionada) {
                case 1:
                    menuAtendimento();
                    break;

                case 2:
                    menuSolicitacao();
                    break;

                case 3:
                    rodaPrograma = false;
                    System.out.println(MensagensUsuario.ENCERRA_PROGRAMA);
                    break;

                default:
                    System.out.println(MensagensUsuario.OPCAO_INVALIDA);
                    break;
            }
        }
    }

    public void atenderCliente() {
        menu.menuAtender();
        if (filaTemCliente()) {
            fila.imprimePrimeiroElemento();
            System.out.println(MensagensUsuario.RESPOSTA_CLIENTE);
            scanner.nextLine();
            fila.remove();
        }
    }

    public void menuAtendimento() {
        menu.menuAtendimento();
        int opcaoAtendimento = lerOpcao(scanner);

        switch (opcaoAtendimento) {
            case 1:
                atenderCliente();
                break;

            case 2:
                menu.mostrarProximoFila();
                if (!fila.vazia()) {
                    fila.imprimePrimeiroElemento();
                    verProximoFila();
                } else {
                    fila.imprime();
                }
                break;

            case 3:
                menu.mostrarFilaAtendimento();
                fila.imprime();
                break;

            case 4:
                break;

            default:
                System.out.println(MensagensUsuario.OPCAO_INVALIDA);
                break;
        }
    }

    public void menuSolicitacao() {
        menu.menuSolicitacoes();
        int opcaoSolicitacao = lerOpcao(scanner);

        switch (opcaoSolicitacao) {
            case 1:
                menu.menuNovaSolicitacao();
                System.out.println(MensagensUsuario.PREENCHA_CAMPOS);
                scanner.nextLine();

                System.out.println(MensagensUsuario.ID_CLIENTE);
                String id = scanner.nextLine();

                System.out.println(MensagensUsuario.DESCRICAO);
                String descricaoSolicitacao = scanner.nextLine();

                System.out.println(MensagensUsuario.DATA);
                String data = scanner.nextLine();

                System.out.println(MensagensUsuario.HORA);
                String hora = scanner.nextLine();

                this.dadosSolicitacao = new DadosSolicitacao(id, descricaoSolicitacao, data, hora);
                pilha.insere(dadosSolicitacao);
                break;

            case 2:
                menu.mostrarCabecalhoSecao(OpcoesMenu.VER_PROXIMA_SOLICITACAO);
                if (pilhaTemSolicitacao()) {
                    pilha.imprimeTopo();
                    menu.menuVerSolicitacao();
                    verProximaSolicitacao();
                }
                break;

            case 3:
                menu.mostrarCabecalhoSecao(OpcoesMenu.VER_TODAS_SOLICITACOES);
                pilha.imprime();
                break;

            case 4:
                break;

            default:
                System.out.println(MensagensUsuario.OPCAO_INVALIDA);
                break;
        }
    }

    public void verProximoFila() {
        menu.menuProximoDaFila();
        int opcaoVerProximoFila = lerOpcao(scanner);
        switch (opcaoVerProximoFila) {
            case 1:
                atenderCliente(); 
                break;

            case 2:
                menuAtendimento();
                break;

            default:
                System.out.println(MensagensUsuario.OPCAO_INVALIDA);
                break;
        }
    }

    public void verProximaSolicitacao() {
        int opcaoProximaSolicitacao = lerOpcao(scanner);
        switch (opcaoProximaSolicitacao) {
            case 1:
                menu.menuPassarParaAtendimento();
                System.out.println(MensagensUsuario.PREENCHA_CAMPOS);
                
                scanner.nextLine();                 

                System.out.println(MensagensUsuario.ID_CLIENTE);
                String id = scanner.nextLine();

                System.out.println(MensagensUsuario.NOME_CLIENTE);
                String nome = scanner.nextLine();

                System.out.println(MensagensUsuario.MOTIVO);
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
                break;

            default:
                System.out.println(MensagensUsuario.OPCAO_INVALIDA);
                break;
        }
    }

    private boolean pilhaTemSolicitacao() {
        if (!pilha.vazia()) return true;
        pilha.imprime();
        return false;
    }

    private boolean filaTemCliente() {
        if (!fila.vazia()) return true;
        fila.imprime();
        return false;
    }

    public static int lerOpcao(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(MensagensUsuario.OPCAO_INVALIDA);
            }
        }
    }
}
