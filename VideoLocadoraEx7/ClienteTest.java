package VideoLocadoraEx7;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveAceitarCodigoMaiorQueZero() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        assertEquals(1, cliente.getCodigo());
    }

    @Test
    void deveLancarExcecaoCodigoZeradoNegativo() {
        Cliente cliente = new Cliente();
        try {
            cliente.setCodigo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarNomeNaoVazio() {
        Cliente cliente = new Cliente();
        cliente.setNome("Maria T");
        assertEquals("Maria T", cliente.getNome());
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        Cliente cliente = new Cliente();
        try {
            cliente.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveAlugarZeroFitas() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.calcularQuantiadeFitasAlugadas());
    }

    @Test
    void deveAlugarUmaFita() {
        Cliente cliente = new Cliente();
        Fita fita = new FitaCatalogo();
        cliente.alugarFita(fita);
        assertEquals(1, cliente.calcularQuantiadeFitasAlugadas());
    }

    @Test
    void deveAlugarMaisDeUmaFita() {
        Cliente cliente = new Cliente();
        Fita fita = new FitaCatalogo();
        Fita fita2 = new FitaCatalogo();
        cliente.alugarFita(fita);
        cliente.alugarFita(fita2);
        assertEquals(2, cliente.calcularQuantiadeFitasAlugadas());
    }

    @Test
    void naoDeveAlocarMesmoObjeto() {
        Cliente cliente = new Cliente();
        Fita fita = new FitaCatalogo();
        cliente.alugarFita(fita);
        cliente.alugarFita(fita);
        assertEquals(1, cliente.calcularQuantiadeFitasAlugadas());
    }

    @Test
    void deveDevolverUmaFita() {
        Cliente cliente = new Cliente();
        Fita fita = new FitaCatalogo();
        Fita fita2 = new FitaCatalogo();
        cliente.alugarFita(fita);
        cliente.alugarFita(fita2);
        cliente.devolverFita(fita);
        assertEquals(1, cliente.calcularQuantiadeFitasAlugadas());
    }

    @Test
    void deveRetornarListaFitasAlugadas() {
        FitaCatalogo fita = new FitaCatalogo();
        FitaEspecial fita2 = new FitaEspecial();
        FitaLancamento fita3 = new FitaLancamento();

        Cliente cliente = new Cliente();
        cliente.alugarFita(fita);
        cliente.alugarFita(fita2);
        cliente.alugarFita(fita3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("Fita Catalogo");
        resultadoEsperado.add("Fita Especial");
        resultadoEsperado.add("Fita Lançamento");

        assertEquals(resultadoEsperado, cliente.listaFitasAlugadas());
    }

    @Test
    void deveRetornarListaValorFitasAlugadas() {
        FitaCatalogo fita = new FitaCatalogo();
        fita.setQuantidadeDiasEmprestimo(2);
        FitaEspecial fita2 = new FitaEspecial();
        fita2.setQuantidadeDiasEmprestimo(2);
        fita2.setValorAluguelDiario(10);
        FitaLancamento fita3 = new FitaLancamento();
        fita3.setQuantidadeDiasEmprestimo(3);
        fita3.setValorAluguelDiario(10);

        Cliente cliente = new Cliente();
        cliente.alugarFita(fita);
        cliente.alugarFita(fita2);
        cliente.alugarFita(fita3);

        ArrayList<Float> resultadoEsperado = new ArrayList<Float>();
        resultadoEsperado.add(10f);
        resultadoEsperado.add(20f);
        resultadoEsperado.add(30f);

        assertEquals(resultadoEsperado, cliente.listaValoresFitasAlugadas());
    }

}