package ManutencaoEquipamentoEx5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoTest {
    @Test
    void deveAceitarNumeroManutencaoMaiorZero() {
        Manutencao manutencao = new ManutencaoCPU();
        manutencao.setNumeroManutencao(1);
        assertEquals(1, manutencao.getNumeroManutencao());
    }

    @Test
    void deveLancarExcecaoNumeroManutencaoZeradoNegativo() {
        Manutencao manutencao = new ManutencaoCPU();
        try {
            manutencao.setNumeroManutencao(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de manutenção invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarValorMaoObraMaiorZero() {
        Manutencao manutencao = new ManutencaoCPU();
        manutencao.setValorMaoDeObra(1);
        assertEquals(1, manutencao.getValorMaoDeObra());
    }

    @Test
    void deveLancarExcecaoValorMaoObraZeradoNegativo() {
        Manutencao manutencao = new ManutencaoCPU();
        try {
            manutencao.setValorMaoDeObra(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarTipoEquipamentoCPU() {
        Manutencao manutencao = new ManutencaoCPU();
        manutencao.setTipoEquipamento("CPU");
        assertEquals("CPU", manutencao.getTipoEquipamento());
    }

    @Test
    void deveVerificarTipoEquipamentoImpressora() {
        Manutencao manutencao = new ManutencaoImpressora();
        manutencao.setTipoEquipamento("Impressora");
        assertEquals("Impressora", manutencao.getTipoEquipamento());
    }

    @Test
    void deveVerificarTipoEquipamentoMonitor() {
        Manutencao manutencao = new ManutencaoMonitor();
        manutencao.setTipoEquipamento("Monitor");
        assertEquals("Monitor", manutencao.getTipoEquipamento());
    }

    @Test
    void deveLancarExcecaoTipoEquipamentoInvalido() {
        Manutencao manutencao = new ManutencaoMonitor();
        try {
            manutencao.setTipoEquipamento("mouse");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de equipamento invalido", e.getMessage());
        }
    }

}