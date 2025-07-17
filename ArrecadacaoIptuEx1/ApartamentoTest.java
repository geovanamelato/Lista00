package ArrecadacaoIptuEx1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApartamentoTest {
    @Test
    void deveAceitarMetragemMaiorQueZero() {
        Apartamento apartamento = new Apartamento();
        apartamento.setMetragemQuadradaApartamento(0.01f);
        assertEquals(0.01f, apartamento.getMetragemQuadradaApartamento());
    }

    @Test
    void deveLancarExcecaoMetragemZeradaNegativa() {
        try {
            Apartamento apartamento = new Apartamento();
            apartamento.setMetragemQuadradaApartamento(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Metragem invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarAndarMaiorQueZero() {
        Apartamento apartamento = new Apartamento();
        apartamento.setAndar(1);
        assertEquals(1, apartamento.getAndar());
    }

    @Test
    void deveLancarExcecaoAndarZeradoNegativo() {
        try {
            Apartamento apartamento = new Apartamento();
            apartamento.setAndar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Andar invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorApartamentoAndarUm() {
        Apartamento apartamento = new Apartamento();
        apartamento.setAndar(1);
        apartamento.setMetragemQuadradaApartamento(10);
        assertEquals(400, apartamento.calcularValorImovel());
    }

    @Test
    void deveCalcularValorApartamentoAndarAcimaDeUmMenorQueOnze() {
        Apartamento apartamento = new Apartamento();
        apartamento.setAndar(2);
        apartamento.setMetragemQuadradaApartamento(10);
        assertEquals(360, apartamento.calcularValorImovel());
    }

    @Test
    void deveCalcularValorApartamentoAndarMaiorQueDez() {
        Apartamento apartamento = new Apartamento();
        apartamento.setAndar(11);
        apartamento.setMetragemQuadradaApartamento(10);
        assertEquals(40, apartamento.calcularValorImovel());
    }

}