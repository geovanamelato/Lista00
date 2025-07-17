package VideoLocadoraEx7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FitaEspecialTest {
    @Test
    void deveAceitarValorAluguelDiarioMaiorQueZero() {
        FitaEspecial fita = new FitaEspecial();
        fita.setValorAluguelDiario(0.01f);
        assertEquals(0.01f, fita.getValorAluguelDiario());
    }

    @Test
    void deveLancarExcecaoValorAluguelDiarioZeradoNegativo() {
        FitaEspecial fita = new FitaEspecial();
        try {
            fita.setValorAluguelDiario(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

}