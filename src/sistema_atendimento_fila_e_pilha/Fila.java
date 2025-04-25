package sistema_atendimento_fila_e_pilha;

public class Fila {
	public No lista;
	    
	    public Fila(){
	        lista = null;
	    }
	    
	    public void insere(Dado elemento){
	        if(!this.vazia()){
		        No atual = lista.pegarFimDaNode();
		        atual.proximo = new No(elemento);
	        }
	        else{
	            lista = new No(elemento);
	        }
	    }
	    
	    public boolean vazia(){
	        return lista == null;
	    }
	    
	    public void imprimePrimeiroElemento() {
	        if (this.vazia()) {
	            System.out.println("A fila está vazia.\n");
	            return;
	        }

	        System.out.println(lista.dado.toString() + "\n");
	    }
	    
	    public Dado remove(){
	        return remove("");
	    }
	    
	    public Dado remove(String nome){
	        if(this.vazia()){
	            return new Dado();
	        }
	        
	        No atual = lista;
	        lista = atual.proximo; 
	        System.out.println("Atendimento realizado com sucesso!");
	        return atual.dado;
	    }
	    
	    public void imprime(){
	        if(this.vazia()){
	            System.out.println("Fila vazia!");
	            return;
	        }
	        
	        No atual = lista;
	        
	        while(atual != null){
	            System.out.println(atual.dado.toString());
	            atual = atual.proximo;
	        }
	    }
}
