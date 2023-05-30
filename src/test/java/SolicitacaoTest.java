import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolicitacaoTest {


    DiretorHotel diretorHotel;
    GerenteHotel gerenteHotel;
    CoordenadorHospedagem coordenadorHospedagem;
    Recepcionista recepcionista;

    @BeforeEach
    void setUp(){
        diretorHotel = new DiretorHotel(null);
        gerenteHotel = new GerenteHotel(diretorHotel);
        coordenadorHospedagem = new CoordenadorHospedagem(gerenteHotel);
        recepcionista = new Recepcionista(coordenadorHospedagem);
    }

    @Test
    void deveRetornarRecepcaoParaAtenderSolicitacaoChekIn(){
        assertEquals("Recepção", recepcionista.atenderSolicitacao(new Solicitacao(SolicitacaoCheckIn.getSolicitacaoCheckIn())));
    }

    @Test
    void deveRetornarCoordenacaoParaAtenderSolicitacaoAlteracaoQuarto(){
        assertEquals("Coordenação", recepcionista.atenderSolicitacao(new Solicitacao(SolicitacaoAlteracaoQuarto.getSolicitacaoAlteracaoQuarto())));
    }

    @Test
    void deveRetornarGerenciaParaAtenderSolicitacaoReclamacaoPagamento(){
        assertEquals("Gerência", recepcionista.atenderSolicitacao(new Solicitacao(SolicitacaoReclamacaoPagamento.getSolicitacaoReclamacaoPagamento())));
    }

    @Test
    void deveRetornarDirecaoParaAtenderSolicitacaoExcepcionalGrave(){
        assertEquals("Direção", recepcionista.atenderSolicitacao(new Solicitacao(SolicitacaoExcepcionalGrave.getSolicitacaoExcepcionalGrave())));
    }

    @Test
    void deveRetornarSolicitacaoInvalidaParaSolicitacaoCarroLuxo(){
        assertEquals("Solicitação inválida", recepcionista.atenderSolicitacao(new Solicitacao(SolicitacaoCarroLuxo.getSolicitacaoCarroLuxo())));
    }


}
