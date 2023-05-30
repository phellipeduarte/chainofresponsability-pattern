public class SolicitacaoReclamacaoPagamento implements TipoSolicitacao{

    private static SolicitacaoReclamacaoPagamento solicitacaoReclamacaoPagamento = new SolicitacaoReclamacaoPagamento();

    public SolicitacaoReclamacaoPagamento(){}

    public static SolicitacaoReclamacaoPagamento getSolicitacaoReclamacaoPagamento(){
        return solicitacaoReclamacaoPagamento;
    }
}
