import java.util.ArrayList;

public abstract class FuncionarioHotel {

    protected ArrayList listaCapacidades = new ArrayList();
    private FuncionarioHotel funcionarioSuperior;

    public FuncionarioHotel getFuncionarioSuperior(){ return funcionarioSuperior; }

    public void setFuncionarioSuperior(FuncionarioHotel funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoPosicao();

    public String atenderSolicitacao(Solicitacao solicitacao){
        if(listaCapacidades.contains(solicitacao.getTipoSolicitacao())){
            return getDescricaoPosicao();
        }
        else{
            if(funcionarioSuperior != null){
                return funcionarioSuperior.atenderSolicitacao(solicitacao);
            }
            else{
                return "Solicitação inválida";
            }
        }
    }
}
