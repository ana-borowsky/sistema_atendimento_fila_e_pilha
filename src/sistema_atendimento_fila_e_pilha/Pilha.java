package sistema_atendimento_fila_e_pilha;

public class Pilha {
	public Integer dado;
    public No pilha;
    
    public Pilha(){
        dado = null;
        pilha = null;
    }
    
    public void insere(Integer dado){
        if(pilha != null){
        No atual = pilha.pegarFimDaNode();
        atual.proximo = new No(dado);
        }
        else{
            pilha = new No(dado);
        }
    }
    
    public Integer remove(){
        if(pilha == null){
            return 0;
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
        if(pilha == null){
            System.out.println("Pilha Vazia!");
        }
        
        No atual = pilha;
        
        while(atual != null){
            System.out.println(atual.dado.toString());
            atual = atual.proximo;
        }
    }
}
