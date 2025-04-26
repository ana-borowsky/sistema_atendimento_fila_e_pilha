package sistema_atendimento_fila_e_pilha;

public class Fila {
	public No lista;
	    
	    public Fila() {
	        lista = null;
	    }
	    
	    public void insere(Dado elemento) {
	        if(!this.vazia()) {
		        No atual = lista.pegarFimDaNode();
		        atual.proximo = new No(elemento);
	        }
	        else {
	            lista = new No(elemento);
	        }
	    }
	    
	    public boolean vazia() {
	        return lista == null;
	    }
	    
	    public void imprimePrimeiroElemento() {
	        if (this.vazia()) {
	        	System.out.println(MensagensUsuario.FILA_VAZIA);
	            return;
	        }

	        System.out.println(lista.dado.toString() + "\n");
	    }
	    
	    public Dado remove() {
	        return remove("");
	    }
	    
	    public Dado remove(String nome) {
	        if(this.vazia()) {
	            return new Dado();
	        }
	        
	        No atual = lista;
	        lista = atual.proximo; 
	        System.out.println(MensagensUsuario.ATENDIMENTO_REALIZADO);
	        return atual.dado;
	    }
	    
	    public void imprime() {
	        if(this.vazia()) {
	        	System.out.println(MensagensUsuario.FILA_VAZIA);
	            return;
	        }
	        
	        No atual = lista;
	        
	        while(atual != null) {
	            System.out.println(atual.dado.toString());
	            atual = atual.proximo;
	        }
	    }
	    
	    public boolean filaTemCliente() {
	        if (!this.vazia()) return true;
	        this.imprime();
	        return false;
	    }
}
