public class SolicitacaoCarroLuxo implements TipoSolicitacao{

    private static SolicitacaoCarroLuxo solicitacaoCarroLuxo = new SolicitacaoCarroLuxo();

    private SolicitacaoCarroLuxo(){}

    public static SolicitacaoCarroLuxo getSolicitacaoCarroLuxo(){ return solicitacaoCarroLuxo; }
}
