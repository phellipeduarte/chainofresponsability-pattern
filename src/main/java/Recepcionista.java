public class Recepcionista extends FuncionarioHotel{

    public Recepcionista(FuncionarioHotel funcionarioSuperior) {
        listaCapacidades.add(SolicitacaoCheckIn.getSolicitacaoCheckIn());
        setFuncionarioSuperior(funcionarioSuperior);
    }

    public String getDescricaoPosicao(){ return "Recepção"; }
}
