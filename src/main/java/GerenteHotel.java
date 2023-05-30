public class GerenteHotel extends FuncionarioHotel{

    public GerenteHotel(FuncionarioHotel funcionarioSuperior){
        listaCapacidades.add(SolicitacaoReclamacaoPagamento.getSolicitacaoReclamacaoPagamento());
        setFuncionarioSuperior(funcionarioSuperior);
    }

    public String getDescricaoPosicao(){ return "Gerência"; }
}
