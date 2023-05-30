public class DiretorHotel extends FuncionarioHotel{

    public DiretorHotel(FuncionarioHotel funcionarioSuperior){
        listaCapacidades.add(SolicitacaoExcepcionalGrave.getSolicitacaoExcepcionalGrave());
        setFuncionarioSuperior(funcionarioSuperior);
    }

    public String getDescricaoPosicao(){ return "Direção"; }
}