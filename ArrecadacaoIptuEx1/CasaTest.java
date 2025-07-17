package ArrecadacaoIptuEx1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CasaTest {
    @Test
    void deveAceitarMetragemTerrenoMaiorQueZero() {
        Casa casa = new Casa();
        casa.setMetragemQuadradaTerreno(0.01f);
        assertEquals(0.01f, casa.getMetragemQuadradaTerreno());
    }

    @Test
    void deveLancarExcecaoMetragemTerrenoZeradaNegativa() {
        try {
            Casa casa = new Casa();
            casa.setMetragemQuadradaTerreno(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Metragem do terreno invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarMetragemConstrucaoMaiorQueZero() {
        Casa casa = new Casa();
        casa.setMetragemQuadradaConstrucao(0.01f);
        assertEquals(0.01f, casa.getMetragemQuadradaConstrucao());
    }

    @Test
    void deveLancarExcecaoMetragemConstrucaoZeradaNegativa() {
        try {
            Casa casa = new Casa();
            casa.setMetragemQuadradaConstrucao(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Metragem da construção invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorCasa() {
        Casa casa = new Casa();
        casa.setMetragemQuadradaTerreno(10);
        casa.setMetragemQuadradaConstrucao(2);
        assertEquals(400, casa.calcularValorImovel());
    }

}