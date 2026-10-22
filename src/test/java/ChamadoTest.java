import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ChamadoTest {
    SuporteEspecialistaSeguranca especialistaSeguranca;
    SuporteDesenvolvedorSistemas desenvolvedorSistemas;
    SuporteTecnicoInfraestrutura tecnicoInfraestrutura;
    SuporteAtendente atendente;

    @BeforeEach
    void setUp() {
        especialistaSeguranca = new SuporteEspecialistaSeguranca(null);
        desenvolvedorSistemas = new SuporteDesenvolvedorSistemas(especialistaSeguranca);
        tecnicoInfraestrutura = new SuporteTecnicoInfraestrutura(desenvolvedorSistemas);
        atendente = new SuporteAtendente(tecnicoInfraestrutura);
    }

    @Test
    void deveRetornarAtendenteParaAssinaturaAcesso() {
        assertEquals("Atendente", atendente.assinarChamado(new Chamado(TipoChamadoAcesso.getTipoChamadoAcesso())));
    }

    @Test
    void deveRetornarTecnicoInfraestruturaParaAssinaturaHardware() {
        assertEquals("TecnicoInfraestrutura", atendente.assinarChamado(new Chamado(TipoChamadoHardware.getTipoChamadoHardware())));
    }

    @Test
    void deveRetornarDesenvolvedorSistemasParaAssinaturaBug() {
        assertEquals("DesenvolvedorSistemas", atendente.assinarChamado(new Chamado(TipoChamadoBug.getTipoChamadoBug())));
    }

    @Test
    void deveRetornarEspecialistaSegurancaParaAssinaturaVazamento() {
        assertEquals("EspecialistaSeguranca", atendente.assinarChamado(new Chamado(TipoChamadoVazamento.getTipoChamadoVazamento())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaNotificacao() {
        assertEquals("Sem correção", atendente.assinarChamado(new Chamado(TipoChamadoNotificacao.getTipoChamadoNotificacao())));
    }

}
