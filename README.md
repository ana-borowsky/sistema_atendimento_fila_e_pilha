# Sistema de Atendimento com Fila e Pilha
Trabalho da disciplina Resolução de Problemas Estruturados em Computação, com objetivo de implementar um sistema de atendimento ao cliente utilizando as estruturas de fila e pilha, ambas com lista encadeada, da seguinte forma:

- Fila: usada para controlar a ordem de atendimento dos clientes (primeiro a chegar, primeiro a ser atendido).
- Pilha: utilizada para armazenar o histórico de solicitações feitas pelos clientes (último a entrar, primeiro a ser atendido).

## Classes
As classes utilizadas no trabalho são:
 - Pilha: responsável pelo histórico de solicitação de clientes.
 - Fila: responsável pela fila de atendimento aos clientes.
 - No: classe que é o nó das listas encadeadas da Fila e da Pilha. Recebe a informação em formato de Dado.
 - Dado: classe utilizada para criação dos dados da Pilha e Fila e classe pai de:
    - DadosCliente: Dados do cliente na fila de atendimento
    - DadosSolicitação: Dados da solicitação registrada na pilha (histórico de solicitações)
 - GeraMenu: classe utilizada para gerar os menus do sistema
 - Navegacao: classe responsável pela navegação dos menus do sistema.
 - Main: Classe principal para iniciar o sistema

## Como Usar
1. Execute a classe Main
2. Escolha entre Atendimento, Solicitações ou Sair no menu principal
3. Na opção de Atendimento, você pode:
    - Atender um cliente: ao atender, o cliente é removido da fila
    - Ver o próximo da fila
        - Ao visualizar o próximo da fila, você pode optar entre atender ou voltar ao menu de Atendimento
    - Visualizar a fila atual
    - Voltar ao menu principal
4. Na opção de Solicitações, você pode:
    - Registrar uma nova solicitação (ela entrará na pilha)
    - Ver a próxima solicitação registrada
        - Ao vizualizar a próxima solicitação você pode:
            - Adicionar à fila de atendimento (ela será removida do histórico de solicitações)
            - Deletar
            - Voltar ao menu de Solicitações
    - Ver todas as solicitações
5. Na opção Sair, o programa é encerrado

## IDE
A IDE escolhida para fazer o projeto foi o Eclipse.