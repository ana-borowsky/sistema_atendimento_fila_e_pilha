package sistema_atendimento_fila_e_pilha;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
        String[] opcoes = {"Atendimento", "Solicitações", "Atender", "Ver próxima solicitação",
                            "Passar para atendimento","Nova solicitação", "Ver solicitação",
                            "Adicionar à fila de atendimento", "Sua opção: ", "Deletar", "Voltar",
                            "Sair", "Insira a descrição da solicitação: ", "Resposta ao cliente: ", 
                            "Nome do cliente: ", "Motivo do atendimento: ", "Data: ","Hora: ", 
                            "ID do cliente: ", "Ver todas as solicitações", "Ver fila de atendimento", 
                            "Fila de atendimento"
        };

        Dado[] historico = {
			new DadosSolicitacao("REQ001", "Instalação de software", "2024-08-20", "10:30"),
			new DadosSolicitacao("REQ002", "Manutenção preventiva", "2024-08-20", "11:00"),
			new DadosSolicitacao("REQ003", "Atualização de sistema", "2024-08-20", "11:30"),
			new DadosSolicitacao("REQ004", "Suporte técnico", "2024-08-20", "12:00"),
			new DadosSolicitacao("REQ005", "Troca de equipamento", "2024-08-20", "12:30"),
			new DadosSolicitacao("REQ006", "Consulta de garantia", "2024-08-20", "13:00"),
			new DadosSolicitacao("REQ007", "Reparo de impressora", "2024-08-20", "13:30"),
			new DadosSolicitacao("REQ008", "Configuração de rede", "2024-08-20", "14:00"),
			new DadosSolicitacao("REQ009", "Restauração de dados", "2024-08-20", "14:30"),
			new DadosSolicitacao("REQ010", "Consulta técnica", "2024-08-20", "15:00")
        };
		 
        Dado[] filaAtendimento = {
			new DadosCliente("CLI001", "Maria Silva", "Dúvida sobre produto"),
			new DadosCliente("CLI002", "João Souza", "Reclamação de serviço"),
			new DadosCliente("CLI003", "Ana Costa", "Solicitação de reembolso"),
			new DadosCliente("CLI004", "Pedro Alves", "Informações de entrega"),
			new DadosCliente("CLI005", "Carla Dias", "Agendamento de visita"),
			new DadosCliente("CLI006", "Lucas Martins", "Alteração de pedido"),
			new DadosCliente("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
			new DadosCliente("CLI008", "Rafael Lima", "Renovação de assinatura"),
			new DadosCliente("CLI009", "Fernanda Gomes", "Suporte para instalação"),
			new DadosCliente("CLI010", "Carlos Eduardo", "Pedido de orçamento")
        };

        Fila fila = new Fila();
        Pilha pilha = new Pilha();
       
        GeraMenu menu = new GeraMenu(opcoes);
        
        // adiciona todas as solicitacoes
    	for ( Dado d: historico) {
        	pilha.insere(d);
        }
    	
    	// adicona todos os clientes e seus dados
    	for ( Dado d: filaAtendimento) {
    		fila.insere(d);
    	}
    	
        Navegacao navegacao = new Navegacao(fila, pilha, menu); 
        
        navegacao.executando();
        	
        	
	}

}
