package sistema_atendimento_fila_e_pilha;

public class GeraMenu {
    public String[] opcoes;

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
        System.out.println("[ 3 ] " + opcoes[20]);
        System.out.println("[ 4 ] " + opcoes[10]);
        System.out.println(opcoes[8]);
    }
    
    public void mostrarFilaAtendimento() {
    	this.opcaoSelecionada(21);
    }
    
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
        System.out.println("[ 1 ] " + opcoes[5]);
        System.out.println("[ 2 ] " + opcoes[6]);
        System.out.println("[ 3 ] " + opcoes[19]);
        System.out.println("[ 4 ] " + opcoes[10]);
        System.out.println(opcoes[8]);
    }
    
    public void menuVerSolicitacao() {
        this.opcaoSelecionada(6);
        // implementar imprimir a solicitacao
        System.out.println("[ 1 ] " + opcoes[7]);
        System.out.println("[ 2 ] " + opcoes[9]);
        System.out.println("[ 3 ] " + opcoes[19]);
        System.out.println("[ 4 ] " + opcoes[10]);
        System.out.println(opcoes[8]);
    }
    
    public void menuNovaSolicitacao() {
    	this.opcaoSelecionada(5);
    }
    
    public void opcaoSelecionada(int indice) {
        System.out.println("\nOpção " + opcoes[indice].toLowerCase() + " selecionada.\n");
    }
}