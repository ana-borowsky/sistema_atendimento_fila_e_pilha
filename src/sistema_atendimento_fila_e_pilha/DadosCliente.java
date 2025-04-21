package sistema_atendimento_fila_e_pilha;

public class DadosCliente extends Dado {
	public int id;
	public String nome;
	public String motivo;
	
	@Override
	public String toString() {
		return String.valueOf(id) + " - " + nome + " - " + motivo;
	}
	
	@Override
	public boolean dadoVazio() {
		return false;
	}
}
