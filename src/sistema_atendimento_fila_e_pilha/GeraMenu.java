package sistema_atendimento_fila_e_pilha;

public class GeraMenu {
    private String[] opcoes;

    public GeraMenu(String[] opcoes) {
        this.opcoes = opcoes;
    }
    
    public void menuPrincipal() {
        System.out.println("\n|--------MENU--------|");
        System.out.println("[ 1 ] " + opcoes[0]);
        System.out.println("[ 2 ] " + opcoes[1]);
        System.out.println("[ 3 ] " + opcoes[11]);
        System.out.println(opcoes[8]);
    }
    
    public void menuAtendimento() {
        this.opcaoSelecionada(0);
        System.out.println("[ 1 ] " + opcoes[2]);
        System.out.println("[ 2 ] " + opcoes[3]);
        System.out.println("[ 3 ] " + opcoes[10]);
        System.out.println(opcoes[8]);
    }
    
    public void menuAtender() {
    	this.opcaoSelecionada(2);
    	// implementar imprimir elemento para atender
        System.out.println(opcoes[13]);
    }
    
    public void menuPassarParaAtendimento() {
    	this.opcaoSelecionada(4);
    	System.out.println(opcoes[14]);
    	System.out.println(opcoes[15]);
    	//Ligação com classe da fila/ elementofila
        //System.out.println("Solicitação foi passada para a fila de atendimento com sucesso.");
    }
    
    public void menuSolicitacoes() {
    	this.opcaoSelecionada(1);
        System.out.println("[ 1 ] " + opcoes[5]);
        System.out.println("[ 2 ] " + opcoes[6]);
        System.out.println("[ 3 ] " + opcoes[10]);
        System.out.println(opcoes[8]);
    }
    
    public void menuVerSolicitacao() {
        this.opcaoSelecionada(6);
        // implementar imprimir a solicitacao
        System.out.println("[ 1 ] " + opcoes[7]);
        System.out.println("[ 2 ] " + opcoes[9]);
        System.out.println("[ 3 ] " + opcoes[10]);
        System.out.println(opcoes[8]);
    }
    
    public void menuNovaSolicitacao() {
    	this.opcaoSelecionada(5);
        System.out.println(opcoes[12]);
    }
    
    public void opcaoSelecionada(int indice) {
        System.out.println("\nOpção " + opcoes[indice].toLowerCase() + " selecionada.");
    }
    
    public class Main { // manter apenas durante os testes. Remover ao finalizar o projeto
        public static void main(String[] args) {
            String[] opcoes = {"Atendimento", "Solicitações", "Atender", "Ver próxima solicitação", 
            		           "Passar para atendimento","Nova solicitação", "Ver solicitação", 
            		           "Adicionar à fila de atendimento", "Sua opção: ", "Deletar", "Voltar", 
            		           "Sair", "Insira a descrição da solicitação: ", "Resposta ao cliente: ", "Nome do cliente: ", "Motivo do atendimento: "};

            GeraMenu menu = new GeraMenu(opcoes);
            
            menu.menuPrincipal();
            menu.menuAtendimento();
            menu.menuAtender();
            menu.menuPassarParaAtendimento();
            menu.menuSolicitacoes();
            menu.menuVerSolicitacao();
            menu.menuNovaSolicitacao();

        }
    }
}
