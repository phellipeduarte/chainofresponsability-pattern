public class CoordenadorHospedagem extends FuncionarioHotel{

    public CoordenadorHospedagem(FuncionarioHotel funcionarioSuperior){
        listaCapacidades.add(SolicitacaoAlteracaoQuarto.getSolicitacaoAlteracaoQuarto());
        setFuncionarioSuperior(funcionarioSuperior);
    }

    public String getDescricaoPosicao(){ return "Coordenação"; }

}
