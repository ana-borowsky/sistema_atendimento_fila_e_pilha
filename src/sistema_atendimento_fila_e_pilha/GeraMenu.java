package sistema_atendimento_fila_e_pilha;

public class GeraMenu {

    public void menuPrincipal() {
        System.out.println(OpcoesMenu.CABECALHO_MENU);
        System.out.println("[ 1 ] " + OpcoesMenu.ATENDIMENTO);
        System.out.println("[ 2 ] " + OpcoesMenu.SOLICITACOES);
        System.out.println("[ 3 ] " + OpcoesMenu.SAIR);
        System.out.println(OpcoesMenu.SUA_OPCAO);
    }

    public void menuAtendimento() {
        this.opcaoSelecionada(OpcoesMenu.ATENDIMENTO);
        System.out.println("[ 1 ] " + OpcoesMenu.ATENDER);
        System.out.println("[ 2 ] " + OpcoesMenu.VER_PROXIMO_FILA);
        System.out.println("[ 3 ] " + OpcoesMenu.VER_FILA);
        System.out.println("[ 4 ] " + OpcoesMenu.VOLTAR);
        System.out.println(OpcoesMenu.SUA_OPCAO);
    }

    public void mostrarFilaAtendimento() {
        this.opcaoSelecionada(OpcoesMenu.VER_FILA);
    }

    public void mostrarProximoFila() {
        this.opcaoSelecionada(OpcoesMenu.VER_PROXIMO_FILA);
    }

    public void menuAtender() {
        this.opcaoSelecionada(OpcoesMenu.ATENDER);
    }

    public void menuPassarParaAtendimento() {
        this.opcaoSelecionada(OpcoesMenu.PASSAR_PARA_ATENDIMENTO);
    }

    public void menuSolicitacoes() {
        this.opcaoSelecionada(OpcoesMenu.SOLICITACOES);
        System.out.println("[ 1 ] " + OpcoesMenu.NOVA_SOLICITACAO);
        System.out.println("[ 2 ] " + OpcoesMenu.VER_PROXIMA_SOLICITACAO);
        System.out.println("[ 3 ] " + OpcoesMenu.VER_TODAS_SOLICITACOES);
        System.out.println("[ 4 ] " + OpcoesMenu.VOLTAR);
        System.out.println(OpcoesMenu.SUA_OPCAO);
    }

    public void menuVerSolicitacao() {
        System.out.println("[ 1 ] " + OpcoesMenu.ADICIONAR_A_FILA);
        System.out.println("[ 2 ] " + OpcoesMenu.DELETAR);
        System.out.println("[ 3 ] " + OpcoesMenu.VOLTAR);
        System.out.println(OpcoesMenu.SUA_OPCAO);
    }

    public void menuNovaSolicitacao() {
        this.opcaoSelecionada(OpcoesMenu.NOVA_SOLICITACAO);
    }

    public void opcaoSelecionada(String texto) {
        System.out.println("\nOpção " + texto.toLowerCase() + " selecionada.\n");
    }
}
