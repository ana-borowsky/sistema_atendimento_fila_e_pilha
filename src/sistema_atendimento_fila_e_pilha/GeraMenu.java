package sistema_atendimento_fila_e_pilha;

public class GeraMenu {
    public String[] opcoes;

    public GeraMenu(String[] opcoes) {
        this.opcoes = opcoes;
    }

    public void menuPrincipal() {
        System.out.println("\n|--------MENU--------|");
        System.out.println("[ 1 ] Atendimento");
        System.out.println("[ 2 ] Solicitações");
        System.out.println("[ 3 ] Sair");
        System.out.println("Sua opção: ");
    }
    
    public void menuAtendimento() {
        this.opcaoSelecionada(0);
        System.out.println("[ 1 ] Atender");
        System.out.println("[ 2 ] Ver próximo da fila");
        System.out.println("[ 3 ] Ver fila de atendimento");
        System.out.println("[ 4 ] Voltar");
        System.out.println("Sua opção: ");
    }
    
    public void mostrarFilaAtendimento() {
    	this.opcaoSelecionada(20);
    }

    public void mostrarProximoFila() { this.opcaoSelecionada(21);}
    
    public void menuAtender() {
    	this.opcaoSelecionada(2);
    	// implementar imprimir elemento para atender
    }
    
    public void menuPassarParaAtendimento() {
    	this.opcaoSelecionada(4);
    	//Ligação com classe da fila/ elementofila
        //System.out.println("Solicitação foi passada para a fila de atendimento com sucesso.");
    }
    
    public void menuSolicitacoes() {
    	this.opcaoSelecionada(1);
        System.out.println("[ 1 ] Nova solicitação");
        System.out.println("[ 2 ] Ver próxima solicitação");
        System.out.println("[ 3 ] Ver todas as solicitações");
        System.out.println("[ 4 ] Voltar");
        System.out.println("Sua opção: ");
    }
    
    public void menuVerSolicitacao() {
        // implementar imprimir a solicitacao
        System.out.println("[ 1 ] Adicionar à fila de atendimento");
        System.out.println("[ 2 ] Deletar");
        System.out.println("[ 3 ] Voltar");
        System.out.println("Sua opção: ");
    }
    
    public void menuNovaSolicitacao() {
    	this.opcaoSelecionada(5);
    }
    
    public void opcaoSelecionada(int indice) {
        System.out.println("\nOpção " + opcoes[indice].toLowerCase() + " selecionada.\n");
    }
}