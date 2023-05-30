public class SolicitacaoExcepcionalGrave implements TipoSolicitacao{

    private static SolicitacaoExcepcionalGrave solicitacaoExcepcionalGrave = new SolicitacaoExcepcionalGrave();

    public SolicitacaoExcepcionalGrave(){}

    public static SolicitacaoExcepcionalGrave getSolicitacaoExcepcionalGrave(){
        return solicitacaoExcepcionalGrave;
    }

}
