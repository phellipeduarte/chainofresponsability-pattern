public class SolicitacaoCheckIn implements TipoSolicitacao{

    private static SolicitacaoCheckIn solicitacaoCheckIn = new SolicitacaoCheckIn();

    public SolicitacaoCheckIn() {}

    public static SolicitacaoCheckIn getSolicitacaoCheckIn(){
        return solicitacaoCheckIn;
    }
}
