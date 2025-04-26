package sistema_atendimento_fila_e_pilha;

public class DadosCliente extends Dado {
	public String id;
	public String nome;
	public String motivo;
	
	public DadosCliente(String id, String nome, String motivo) {
		this.id = id;
		this.nome = nome;
		this.motivo = motivo;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id) + " - " + nome + " - " + motivo;
	}
	
	@Override
	public boolean dadoVazio() {
		return false;
	}
}
