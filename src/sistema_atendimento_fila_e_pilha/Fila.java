package sistema_atendimento_fila_e_pilha;

public class Fila {
	public No lista;
	    
	    public Fila(){
	        lista = null;
	    }
	    
	    public void insere(Dado elemento){
	        if(lista != null){
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
	    
	    public Dado remove(){
	        return remove("");
	    }
	    
	    public Dado remove(String nome){
	        if(lista == null){
	            return new Dado();
	        }
	        
	        No atual = lista;
	        lista = atual.proximo; 
	        System.out.println("Atendimento de - " + atual.dado.toString() + " -  realizado com sucesso!");
	        return atual.dado;
	    }
	    
	    public void imprime(){
	        if(lista == null){
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
