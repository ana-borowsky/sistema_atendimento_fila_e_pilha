package sistema_atendimento_fila_e_pilha;

public class Pilha {
	public Integer dado;
    public No pilha;
    
    public Pilha(){
        dado = null;
        pilha = null;
    }
    
    public boolean vazia(){
        return pilha == null;
    }
    
    public void insere(Dado dado){
        if(!this.vazia()){
        No atual = pilha.pegarFimDaNode();
        atual.proximo = new No(dado);
        }
        else{
            pilha = new No(dado);
        }
    }
    
    public Dado remove(){
        if(this.vazia()){
            return new Dado();
        }
        
        No ultimaNode = null;
        No atual = pilha;
        
        while(atual.proximo != null){
            ultimaNode = atual;
            atual = atual.proximo;
        }
        
        if(ultimaNode != null){
            ultimaNode.proximo = null;
        }
        else{
            pilha = null;
        }
        System.out.println("Valor removido:" + atual.dado.toString() + " de Pilha!");
        return atual.dado;
    }
    
    public void imprime(){
        if(this.vazia()){
            System.out.println("Não há solicitações no momento.");
        }
        
        No atual = pilha;
        
        while(atual != null){
            System.out.println(atual.dado.toString());
            atual = atual.proximo;
        }
    }
    
    public void imprimeTopo() {
        if (this.vazia()) {
            System.out.println("Não há solicitações no momento.");
            return;
        }

        No atual = pilha;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        System.out.println(atual.dado.toString());
    }
}
