package VideoLocadoraEx7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FitaLancamentoTest {
    @Test
    void deveAceitarValorAluguelDiarioMaiorQueZero() {
        FitaLancamento fita = new FitaLancamento();
        fita.setValorAluguelDiario(0.01f);
        assertEquals(0.01f, fita.getValorAluguelDiario());
    }

    @Test
    void deveLancarExcecaoValorAluguelDiarioZeradoNegativo() {
        FitaLancamento fita = new FitaLancamento();
        try {
            fita.setValorAluguelDiario(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

}