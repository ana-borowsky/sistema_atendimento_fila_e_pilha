package sistema_atendimento_fila_e_pilha;

public class DadosSolicitacao extends Dado {
	public int id;
	public String descricao;
	public String data;
	public String hora;
	
	public DadosSolicitacao(int id, String descricao, String data, String hora) {
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id) + " - " + descricao + " - " + data + " - " + hora;
	}
	
	@Override
	public boolean dadoVazio() {
		return false;
	}
}
