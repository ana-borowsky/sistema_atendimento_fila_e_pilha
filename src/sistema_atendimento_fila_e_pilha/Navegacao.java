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
                case 1 :
                    menu.menuAtendimento();
                    int opcaoAtendimento = lerOpcao(scanner);

                    switch (opcaoAtendimento){
                        case 1:
                            menu.menuAtender();
                            scanner.nextLine();
	                        if (!fila.vazia()) {
	                        	fila.imprimePrimeiroElemento();
	                        	System.out.println(menu.opcoes[13]);
	                        	String resposta = scanner.nextLine(); 
	                        	fila.remove();
	                         } 
	                         break;
               
                        case 2:
                            System.out.println("Solicitações: ");
                            pilha.imprimeTopo();
                            menu.menuVerSolicitacao();
                            verProximaSolicitacao();
                            break;

                        case 3:
                        	menu.mostrarFilaAtendimento();
                        	fila.imprime();
                            break;

                        case 4:
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

                            System.out.println(menu.opcoes[18]);
                            String id = scanner.nextLine();


                            System.out.println(menu.opcoes[12]);
                            String descricaoSolicitacao = scanner.nextLine();

                            System.out.println(menu.opcoes[16]);
                            String data = scanner.nextLine();

                            System.out.println(menu.opcoes[17]);
                            String hora = scanner.nextLine();

                            this.dadosSolicitacao = new DadosSolicitacao(id,descricaoSolicitacao,data, hora);
                            pilha.insere(dadosSolicitacao);
                            System.out.println("Solicitação foi criada com sucesso.");
                            break;

                        case 2:
                        	pilha.imprimeTopo();
                            menu.menuVerSolicitacao();
                            verProximaSolicitacao();
                            break;
                            
                        case 3:
                            menu.opcaoSelecionada(19);
                            pilha.imprime();
                            break;
                            
                        case 4:
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
                    System.out.println("Programa encerrado, tenha um excelente dia!!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }
        
    }
    
    public void verProximaSolicitacao(){
        int opcaoProximaSolicitacao = lerOpcao(scanner);
        switch (opcaoProximaSolicitacao){
            case 1:
                System.out.println("Solicitações: ");
                pilha.imprime();
                menu.menuPassarParaAtendimento();
                scanner.nextLine();

                System.out.println(menu.opcoes[18]);
                String id = scanner.nextLine();


                System.out.println(menu.opcoes[14]);
                String nome = scanner.nextLine();

                System.out.println(menu.opcoes[15]);
                String motivo = scanner.nextLine();

                this.dadosCliente = new DadosCliente(id, nome, motivo);
                fila.insere(dadosCliente);
                pilha.remove();
                System.out.println("Solicitação passada para fila de atendimento com sucesso.");
                break;
                
            case 2:
                pilha.remove();
                System.out.println("A solicitação foi excluída com sucesso.");
                break;

            case 3:
                //Opção para voltar ao menu principal
                scanner.nextLine();
                break;
              
            case 4:
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