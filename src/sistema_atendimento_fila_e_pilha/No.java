package sistema_atendimento_fila_e_pilha;

public class No {
    public Dado dado;
    public No proximo;
    
    public No(Dado dado) {
        this.dado = dado;
        proximo = null;
    }
    
    public No pegarFimDaNode() {
    	No atual = this;
        
        while(atual.proximo != null) {
            atual = atual.proximo;
        }
        
        return atual;
    }
    
    public int pegarTamanhoRestanteEstrutura() {
        int contador = 0;
        No atual = this;
        
        while(atual.proximo != null) {
            atual = atual.proximo;
            contador++;
        }
        return contador;
    }
}
