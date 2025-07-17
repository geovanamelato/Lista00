package ControleTransportadoraEx4;

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
                () -> cliente.setNome(" ")
        );
        assertEquals("Nome vazio", thrown.getMessage());
    }

    @Test
    void deveRetornarZeroFretes() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.calcularQuantidadeFretes());
    }

    @Test
    void deveRetornarUmFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal();
        cliente.alocarFrete(frete);
        assertEquals(1, cliente.calcularQuantidadeFretes());
    }

    @Test
    void deveRetornarMaisDeUmFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal();
        FreteNormal frete2 = new FreteNormal();
        cliente.alocarFrete(frete);
        cliente.alocarFrete(frete2);
        assertEquals(2, cliente.calcularQuantidadeFretes());
    }

    @Test
    void naoDeveAlocarMesmoObjeto() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal();
        cliente.alocarFrete(frete);
        cliente.alocarFrete(frete);
        assertEquals(1, cliente.calcularQuantidadeFretes());
    }

    @Test
    void deveRemoverUmFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal();
        FreteNormal frete2 = new FreteNormal();
        cliente.alocarFrete(frete);
        cliente.alocarFrete(frete2);
        cliente.removerFrete(frete);
        assertEquals(1, cliente.calcularQuantidadeFretes());
    }

    @Test
    void deveRetornarListaFretesCliente() {
        FreteNormal frete1 = new FreteNormal();
        FreteEspecial frete2 = new FreteEspecial();
        FreteUrgente frete3 = new FreteUrgente();

        Cliente cliente = new Cliente();
        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);
        cliente.alocarFrete(frete3);

        ArrayList<String> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add("Frete normal");
        resultadoEsperado.add("Frete especial");
        resultadoEsperado.add("Frete urgente");

        assertEquals(resultadoEsperado, cliente.verificarFretesCliente());
    }

    @Test
    void deveRetornarListaValoresFrete() {
        FreteNormal frete1 = new FreteNormal();
        frete1.setValorFrete(10);

        FreteEspecial frete2 = new FreteEspecial();
        frete2.setValorFrete(10);
        frete2.setTaxaEntrega(5);

        FreteUrgente frete3 = new FreteUrgente();
        frete3.setValorFrete(10);
        frete3.setTaxaEntrega(5);
        frete3.setQuantidadeItens(2);

        Cliente cliente = new Cliente();
        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);
        cliente.alocarFrete(frete3);

        ArrayList<Float> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(10f);
        resultadoEsperado.add(15f);
        resultadoEsperado.add(35f);

        assertEquals(resultadoEsperado, cliente.verificarValoresFrete());
    }
}
