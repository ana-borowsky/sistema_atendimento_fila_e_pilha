package sistema_atendimento_fila_e_pilha;

public class GeraMenu {
	
	public String[] opcoes = {
            "Atendimento", "Solicitações", "Atender", 
            "Ver fila de atendimento", "Ver próximo da fila", "Passar para atendimento", 
            "Nova solicitação", "Ver todas as solicitações", "Resposta ao cliente: ", 
            "ID do cliente: ", "Insira a descrição da solicitação: ", "Data: ", 
            "Hora: ", "Nome do cliente: ", "Motivo do atendimento: ", 
            "Deletar", "Ver próxima solicitação"
			};


    public void menuPrincipal() {
        System.out.println("\n|--------MENU--------|");
        System.out.println("[ 1 ] Atendimento");
        System.out.println("[ 2 ] Solicitações");
        System.out.println("[ 3 ] Sair");
        System.out.println("Sua opção: ");
    }
    
    public void menuAtendimento() {
        this.opcaoSelecionada(0);//
        System.out.println("[ 1 ] Atender");
        System.out.println("[ 2 ] Ver próximo da fila");
        System.out.println("[ 3 ] Ver fila de atendimento");
        System.out.println("[ 4 ] Voltar");
        System.out.println("Sua opção: ");
    }
    
    public void mostrarFilaAtendimento() {
    	this.opcaoSelecionada(3);//
    }

    public void mostrarProximoFila() { this.opcaoSelecionada(4);}//
    
    public void menuAtender() {
    	this.opcaoSelecionada(2);//
    }
    
    public void menuPassarParaAtendimento() {
    	this.opcaoSelecionada(5);//
    }
    
    public void menuSolicitacoes() {
    	this.opcaoSelecionada(1);//
        System.out.println("[ 1 ] Nova solicitação");
        System.out.println("[ 2 ] Ver próxima solicitação");
        System.out.println("[ 3 ] Ver todas as solicitações");
        System.out.println("[ 4 ] Voltar");
        System.out.println("Sua opção: ");
    }
    
    public void menuVerSolicitacao() {
        System.out.println("[ 1 ] Adicionar à fila de atendimento");
        System.out.println("[ 2 ] Deletar");
        System.out.println("[ 3 ] Voltar");
        System.out.println("Sua opção: ");
    }
    
    public void menuNovaSolicitacao() {
    	this.opcaoSelecionada(6);
    }
    
    public void opcaoSelecionada(int indice) {
        System.out.println("\nOpção " + opcoes[indice].toLowerCase() + " selecionada.\n");
    }
}