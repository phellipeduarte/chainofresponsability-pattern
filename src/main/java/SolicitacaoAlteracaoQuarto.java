public class SolicitacaoAlteracaoQuarto implements TipoSolicitacao{

    private static SolicitacaoAlteracaoQuarto solicitacaoAlteracaoQuarto = new SolicitacaoAlteracaoQuarto();

    public SolicitacaoAlteracaoQuarto(){}

    public static SolicitacaoAlteracaoQuarto getSolicitacaoAlteracaoQuarto(){
        return solicitacaoAlteracaoQuarto;
    }

}
