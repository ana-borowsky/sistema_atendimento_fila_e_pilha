package sistema_atendimento_fila_e_pilha;

public class Pilha {
	public Integer dado;
    public No pilha;
    
    public Pilha() {
        dado = null;
        pilha = null;
    }
    
    public boolean vazia() {
        return pilha == null;
    }
    
    public void insere(Dado dado) {
        if (!this.vazia()) {
        No atual = pilha.pegarFimDaNode();
        atual.proximo = new No(dado);
        }
        else {
            pilha = new No(dado);
        }
        System.out.println(MensagensUsuario.SOLICITACAO_CRIADA);
    }
    
    public Dado remove() {
        if (this.vazia()) {
            return new Dado();
        }
        
        No ultimaNode = null;
        No atual = pilha;
        
        while (atual.proximo != null) {
            ultimaNode = atual;
            atual = atual.proximo;
        }
        
        if (ultimaNode != null) {
            ultimaNode.proximo = null;
        }
        else {
            pilha = null;
        }
        System.out.println(MensagensUsuario.SUCESSO);
        return atual.dado;
    }
    
    public void imprime() {
        if (this.vazia()) {
        	System.out.println(MensagensUsuario.PILHA_VAZIA);
        }
        
        No atual = pilha;
        
        while (atual != null) {
            System.out.println(atual.dado.toString());
            atual = atual.proximo;
        }
    }
    
    public void imprimeTopo() {
        if (this.vazia()) {
        	System.out.println(MensagensUsuario.PILHA_VAZIA);
            
            return;
        }

        No atual = pilha;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        System.out.println(atual.dado.toString() + "\n");
    }
    
    public boolean pilhaTemSolicitacao() {
        if (!this.vazia()) return true;
        this.imprime();
        return false;
    }
}
