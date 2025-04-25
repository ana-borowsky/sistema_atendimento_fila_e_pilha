# Sistema de Atendimento com Fila e Pilha
Trabalho da disciplina Resolução de Problemas Estruturados em Computação, com objetivo de implementar um sistema de atendimento utilizando as estruturas de fila e pilha com lista encadeada da seguinte forma:

- Fila: usada para controlar a ordem de atendimento dos clientes (primeiro a chegar, primeiro a ser atendido).
- Pilha: utilizada para armazenar o histórico de solicitações feitas pelos clientes (última solicitação no topo).

## Classes
As classes utilizadas no trabalho são:
 - Pilha: responsável pelo histórico de solicitação de clientes.
 - Fila: responsável pelo atendimento aos clientes.
 - Dado: classe utilizada para criação dos dados da Pilha e Fila
    - DadosCliente: Dados do cliente na fila de atendimento
    - DadosSolicitação: Dados da solicitação registrada na pilha
 - GeraMenu: classe utilizada para gerar os menus do sistema
 - Navegacao: classe responsável pela navegação dos menus do sistema.
 - Main: Classe principal para iniciar o sistema

## Como Usar
1. Execute a classe Main.
2. Escolha entre Atendimento ou Solicitações no menu principal.
3. No menu de atendimento, você pode:
    - Atender um cliente
    - Ver o próximo da fila
    - Visualizar a fila atual
4. No menu de solicitações, você pode:
    - Registrar uma nova solicitação
    - Ver a próxima solicitação registrada
    - Ver todas as solicitações anteriores
    - Adicionar uma solicitação à fila de atendimento

## IDE
A IDE escolhida para fazer o projeto foi o Eclipse.

