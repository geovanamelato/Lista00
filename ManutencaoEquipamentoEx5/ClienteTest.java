package ManutencaoEquipamentoEx5;

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
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cliente.setCodigo(0);
        });
        assertEquals("Codigo invalido", exception.getMessage());
    }

    @Test
    void deveAceitarNomeNaoVazio() {
        Cliente cliente = new Cliente();
        cliente.setNome("Kamila");
        assertEquals("Kamila", cliente.getNome());
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        Cliente cliente = new Cliente();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cliente.setNome(" ");
        });
        assertEquals("Nome vazio", exception.getMessage());
    }

    @Test
    void deveRetornarZeroManutencoes() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.numeroManutencoes());
    }

    @Test
    void deveRetornarUmaManutencao() {
        Cliente cliente = new Cliente();
        cliente.alocarManutencao(new ManutencaoCPU());
        assertEquals(1, cliente.numeroManutencoes());
    }

    @Test
    void deveRetornarMaisDeUmaManutencao() {
        Cliente cliente = new Cliente();
        cliente.alocarManutencao(new ManutencaoCPU());
        cliente.alocarManutencao(new ManutencaoImpressora());
        assertEquals(2, cliente.numeroManutencoes());
    }

    @Test
    void naoDeveRetornarMesmoObjeto() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao = new ManutencaoCPU();
        cliente.alocarManutencao(manutencao);
        cliente.alocarManutencao(manutencao);
        assertEquals(1, cliente.numeroManutencoes());
    }

    @Test
    void deveRemoverUmaManutencao() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao1 = new ManutencaoCPU();
        ManutencaoImpressora manutencao2 = new ManutencaoImpressora();
        cliente.alocarManutencao(manutencao1);
        cliente.alocarManutencao(manutencao2);
        cliente.removerManutencao(manutencao1);
        assertEquals(1, cliente.numeroManutencoes());
    }

    @Test
    void deveRetornarListaValorManutencaoCliente() {
        Cliente cliente = new Cliente();

        ManutencaoCPU m1 = new ManutencaoCPU();
        m1.setValorPecasTrocadas(10);
        m1.setValorMaoDeObra(5);

        ManutencaoImpressora m2 = new ManutencaoImpressora();
        m2.setValorPecasTrocadas(16);
        m2.setValorMaoDeObra(4);

        ManutencaoMonitor m3 = new ManutencaoMonitor();
        m3.setValorMaoDeObra(40);

        cliente.alocarManutencao(m1);
        cliente.alocarManutencao(m2);
        cliente.alocarManutencao(m3);

        ArrayList<Float> esperado = new ArrayList<>();
        esperado.add(15f);
        esperado.add(20f);
        esperado.add(40f);

        assertEquals(esperado, cliente.listaValoresManutencaoCliente());
    }

    @Test
    void deveRetornarListaManutencaoCliente() {
        Cliente cliente = new Cliente();
        cliente.alocarManutencao(new ManutencaoCPU());
        cliente.alocarManutencao(new ManutencaoImpressora());
        cliente.alocarManutencao(new ManutencaoMonitor());

        ArrayList<String> esperado = new ArrayList<>();
        esperado.add("Manutenção de CPU");
        esperado.add("Manutenção de Impressora");
        esperado.add("Manutenção de Monitor");

        assertEquals(esperado, cliente.listaManutencaoCliente());
    }
}
