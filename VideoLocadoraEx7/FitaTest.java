package VideoLocadoraEx7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FitaTest {
    @Test
    void deveAceitarNomeFilmeNaoVazio() {
        Fita fita = new FitaCatalogo();
        fita.setNomeFilme("Barbie");
        assertEquals("Barbie", fita.getNomeFilme());
    }

    @Test
    void deveLancarExcecaoNomeFilmeVazio() {
        Fita fita = new FitaCatalogo();
        try {
            fita.setNomeFilme(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarQuantidadeDiasEmprestimoMaiorQueZero() {
        Fita fita = new FitaCatalogo();
        fita.setQuantidadeDiasEmprestimo(1);
        assertEquals(1, fita.getQuantidadeDiasEmprestimo());
    }

    @Test
    void deveLancarExcecaoQuantidadeDiasEmprestimoZeradoNegativo() {
        Fita fita = new FitaCatalogo();
        try {
            fita.setQuantidadeDiasEmprestimo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de dias invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarTipoFitaCatalogo() {
        Fita fita = new FitaCatalogo();
        fita.setTipoFita("Catalogo");
        assertEquals("Catalogo", fita.getTipoFita());
    }

    @Test
    void deveVerificarTipoFitaEspecial() {
        Fita fita = new FitaEspecial();
        fita.setTipoFita("Especial");
        assertEquals("Especial", fita.getTipoFita());
    }

    @Test
    void deveVerificarTipoFitaLancamento() {
        Fita fita = new FitaLancamento();
        fita.setTipoFita("Lançamento");
        assertEquals("Lançamento", fita.getTipoFita());
    }

    @Test
    void deveLancarExcecaoTipoFitaInvalida() {
        Fita fita = new FitaCatalogo();
        try {
            fita.setTipoFita("b");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de fita invalida", e.getMessage());
        }
    }

}