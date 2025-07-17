package ControleEstacionamentoEx6;

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
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> cliente.setCodigo(0)
        );
        assertEquals("Codigo invalido", thrown.getMessage());
    }

    @Test
    void deveAceitarNomeNaoVazio() {
        Cliente cliente = new Cliente();
        cliente.setNome("Geovana");
        assertEquals("Geovana", cliente.getNome());
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        Cliente cliente = new Cliente();
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> cliente.setNome("  ")
        );
        assertEquals("Nome vazio", thrown.getMessage());
    }

    @Test
    void deveRetornarZeroVagas() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.calcularNumeroVagas());
    }

    @Test
    void deveRetornarUmaVaga() {
        Vaga vaga = new VagaDiaria();
        Cliente cliente = new Cliente();
        cliente.reservarVaga(vaga);
        assertEquals(1, cliente.calcularNumeroVagas());
    }

    @Test
    void deveRetornarMaisDeUmaVaga() {
        Vaga vaga = new VagaDiaria();
        Vaga vaga2 = new VagaDiaria();
        Cliente cliente = new Cliente();
        cliente.reservarVaga(vaga);
        cliente.reservarVaga(vaga2);
        assertEquals(2, cliente.calcularNumeroVagas());
    }

    @Test
    void naoDeveAlocarMesmoObjeto() {
        Vaga vaga = new VagaDiaria();
        Cliente cliente = new Cliente();
        cliente.reservarVaga(vaga);
        cliente.reservarVaga(vaga);
        assertEquals(1, cliente.calcularNumeroVagas());
    }

    @Test
    void deveLiberarUmaVaga() {
        Vaga vaga = new VagaDiaria();
        Vaga vaga2 = new VagaDiaria();
        Cliente cliente = new Cliente();
        cliente.reservarVaga(vaga);
        cliente.reservarVaga(vaga2);
        cliente.liberarVaga(vaga);
        assertEquals(1, cliente.calcularNumeroVagas());
    }

    @Test
    void deveRetornarListaVagasCliente() {
        VagaDiaria vaga = new VagaDiaria();
        VagaSemanal vaga1 = new VagaSemanal();
        VagaMensal vaga2 = new VagaMensal();

        Cliente cliente = new Cliente();
        cliente.reservarVaga(vaga);
        cliente.reservarVaga(vaga1);
        cliente.reservarVaga(vaga2);

        ArrayList<String> esperado = new ArrayList<>();
        esperado.add("Vaga diária");
        esperado.add("Vaga semanal");
        esperado.add("Vaga mensal");

        assertEquals(esperado, cliente.listaVagasCliente());
    }

    @Test
    void deveRetornarListaValoresVagasCliente() {
        VagaDiaria vaga = new VagaDiaria();
        vaga.setQuantidadeDias(2);
        VagaSemanal vaga1 = new VagaSemanal();
        vaga1.setQuantidadeSemanas(3);
        VagaMensal vaga2 = new VagaMensal();
        vaga2.setQuantidadeMeses(4);

        Cliente cliente = new Cliente();
        cliente.reservarVaga(vaga);
        cliente.reservarVaga(vaga1);
        cliente.reservarVaga(vaga2);

        ArrayList<Float> esperado = new ArrayList<>();
        esperado.add(20f);   //2 dias
        esperado.add(120f);  //3 semanas
        esperado.add(600f);  //4 meses

        assertEquals(esperado, cliente.listaValorVagasCliente());
    }
}

