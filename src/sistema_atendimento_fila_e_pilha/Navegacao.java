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
                            scanner.nextLine();
	                        if (!fila.vazia()) {
	                            menu.menuAtender();
	                        	fila.imprimePrimeiroElemento();
	                        	System.out.println(menu.opcoes[8]);//
	                        	scanner.nextLine(); 
	                        	fila.remove();
	                         } else {
                                menu.menuAtender();
                                fila.imprime();
                            }
	                         break;
               
                        case 2:
                            if (!fila.vazia()){
                                menu.mostrarProximoFila();
                                fila.imprimePrimeiroElemento();
                            } else {
                                menu.mostrarProximoFila();
                                fila.imprime();
                            }

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
                            System.out.println("Opção inválida.");////////
                            break;

                    }
                    
                    break;

                case 2:
                    menu.menuSolicitacoes();
                    int opcaoSolicitacao = lerOpcao(scanner);

                    switch (opcaoSolicitacao){
                        case 1:
                            menu.menuNovaSolicitacao();
                            System.out.println("Complete os campos abaixo\n");/////////
                            scanner.nextLine();

                            System.out.println(menu.opcoes[14]);//
                            String id = scanner.nextLine();

                            System.out.println(menu.opcoes[10]);//
                            String descricaoSolicitacao = scanner.nextLine();

                            System.out.println(menu.opcoes[11]);//
                            String data = scanner.nextLine();

                            System.out.println(menu.opcoes[12]);//
                            String hora = scanner.nextLine();

                            this.dadosSolicitacao = new DadosSolicitacao(id,descricaoSolicitacao,data, hora);
                            pilha.insere(dadosSolicitacao);
                            break;

                        case 2:
                            menu.opcaoSelecionada(16);//
                            if(!pilha.vazia()){
                                pilha.imprimeTopo();
                                menu.menuVerSolicitacao();
                                verProximaSolicitacao();
                            } else {
                                pilha.imprime();
                            }
                            break;
                            
                        case 3:
                            menu.opcaoSelecionada(7);//
                            pilha.imprime();
                            break;
                            
                        case 4:
                            //Opção para voltar ao menu principal
                            scanner.nextLine();
                            break;

                        default:
                            System.out.println("Opção inválida.");////////
                            break;

                    }
                    
                    break;

                case 3:
                    rodaPrograma = false;
                    System.out.println("Programa encerrado, tenha um excelente dia!");///////
                    break;

                default:
                    System.out.println("Opção inválida.");///////
                    break;
            }

        };
        
    }
    
    public void verProximaSolicitacao(){
        int opcaoProximaSolicitacao = lerOpcao(scanner);
        switch (opcaoProximaSolicitacao){
            case 1:
                menu.menuPassarParaAtendimento();
                System.out.println("Complete os campos abaixo\n");///////
                scanner.nextLine();

                System.out.println(menu.opcoes[9]);//
                String id = scanner.nextLine();


                System.out.println(menu.opcoes[13]);//
                String nome = scanner.nextLine();

                System.out.println(menu.opcoes[14]);//
                String motivo = scanner.nextLine();

                this.dadosCliente = new DadosCliente(id, nome, motivo);
                fila.insere(dadosCliente);
                pilha.remove();
                break;
                
            case 2:
                pilha.remove();
                break;

            case 3:
                //Opção para voltar ao menu principal
                scanner.nextLine();
                break;   

            default:
                System.out.println("Opção inválida.");////////
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