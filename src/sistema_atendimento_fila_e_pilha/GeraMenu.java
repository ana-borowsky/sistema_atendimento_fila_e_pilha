package sistema_atendimento_fila_e_pilha;

public class GeraMenu {

    public void menuPrincipal() {
        System.out.println(OpcoesMenu.CABECALHO_MENU);
        String[] opcoes = {OpcoesMenu.ATENDIMENTO, OpcoesMenu.SOLICITACOES, OpcoesMenu.SAIR};
        exibirMenu(null, opcoes);
    }

    void mostrarCabecalhoSecao(String texto) {
        System.out.println("\n>> " + texto + " <<\n");
    }
    
    public void menuAtendimento() {
        String[] opcoes = {
            OpcoesMenu.ATENDER,
            OpcoesMenu.VER_PROXIMO_FILA,
            OpcoesMenu.VER_FILA,
            OpcoesMenu.VOLTAR
        };
        exibirMenu(OpcoesMenu.ATENDIMENTO, opcoes);
    }

    public void mostrarFilaAtendimento() {
        mostrarCabecalhoSecao(OpcoesMenu.VER_FILA);
    }

    public void mostrarProximoFila() {
        mostrarCabecalhoSecao(OpcoesMenu.VER_PROXIMO_FILA);
    }

    public void menuAtender() {
        mostrarCabecalhoSecao(OpcoesMenu.ATENDER);
    }
    
    public void menuPassarParaAtendimento() {
        mostrarCabecalhoSecao(OpcoesMenu.PASSAR_PARA_ATENDIMENTO);
    }

    public void menuProximoDaFila(){
        System.out.println("[ 1 ] " + OpcoesMenu.ATENDER);
        System.out.println("[ 2 ] " + OpcoesMenu.VOLTAR);
        System.out.println(OpcoesMenu.INPUT_USUARIO_MENU);
    }

    public void menuSolicitacoes() {
        String[] opcoes = {
            OpcoesMenu.NOVA_SOLICITACAO,
            OpcoesMenu.VER_PROXIMA_SOLICITACAO,
            OpcoesMenu.VER_TODAS_SOLICITACOES,
            OpcoesMenu.VOLTAR
        };
        exibirMenu(OpcoesMenu.SOLICITACOES, opcoes);
    }

    public void menuVerSolicitacao() {
        String[] opcoes = {
            OpcoesMenu.ADICIONAR_A_FILA,
            OpcoesMenu.DELETAR,
            OpcoesMenu.VOLTAR
        };
        exibirMenu(null, opcoes);
    }

    public void menuNovaSolicitacao() {
        mostrarCabecalhoSecao(OpcoesMenu.NOVA_SOLICITACAO);
    }
    
    private void exibirMenu(String titulo, String[] opcoes) {
        if (titulo != null) {
            mostrarCabecalhoSecao(titulo);
        }
        for (int i = 0; i < opcoes.length; i++) {
            System.out.printf("[ %d ] %s%n", i + 1, opcoes[i]);
        }
        System.out.println(OpcoesMenu.INPUT_USUARIO_MENU);
    }

}
