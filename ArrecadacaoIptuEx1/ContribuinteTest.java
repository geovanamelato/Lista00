package ArrecadacaoIptuEx1;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {
    @Test
    void deveAceitarCodigoMaiorQueZero() {
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.setCodigo(1);
        assertEquals(1, contribuinte.getCodigo());
    }

    @Test
    void deveLancarExcecaoCodigoZeradoNegativo() {
        Contribuinte contribuinte = new Contribuinte();
        try {
            contribuinte.setCodigo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarNomeNaoVazio() {
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.setNome("Kamila");
        assertEquals("Kamila", contribuinte.getNome());
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        Contribuinte contribuinte = new Contribuinte();
        try {
            contribuinte.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveRetornarZeroImoveis(){
        Contribuinte contribuinte = new Contribuinte();
        assertEquals(0, contribuinte.getNumeroImoveis());
    }

    @Test
    void deveRetornarUmImovel(){
        Contribuinte contribuinte = new Contribuinte();
        Imovel imovel = new Casa();
        contribuinte.alocarImovel(imovel);
        assertEquals(1, contribuinte.getNumeroImoveis());
    }

    @Test
    void deveRetornarMaisDeUmImovel(){
        Contribuinte contribuinte = new Contribuinte();
        Imovel imovel = new Apartamento();
        contribuinte.alocarImovel(imovel);
        Imovel imovel2 = new Lote();
        contribuinte.alocarImovel(imovel2);
        assertEquals(2, contribuinte.getNumeroImoveis());
    }

    @Test
    void naoDeveAlocarMesmoObjeto(){
        Contribuinte contribuinte = new Contribuinte();
        Imovel imovel = new Apartamento();
        contribuinte.alocarImovel(imovel);
        contribuinte.alocarImovel(imovel);
        assertEquals(1, contribuinte.getNumeroImoveis());
    }

    @Test
    void deveRemoverImovel(){
        Contribuinte contribuinte = new Contribuinte();
        Imovel imovel = new Apartamento();
        contribuinte.alocarImovel(imovel);
        Imovel imovel2 = new Lote();
        contribuinte.alocarImovel(imovel2);
        contribuinte.removerImovel(imovel);
        assertEquals(1, contribuinte.getNumeroImoveis());
    }

    @Test
    void deveRetornarListaValoresImoveis() {
        Lote lote = new Lote();
        lote.setMetragemQuadradaTerreno(10);

        Casa casa = new Casa();
        casa.setMetragemQuadradaTerreno(10);
        casa.setMetragemQuadradaConstrucao(2);

        Apartamento apartamento = new Apartamento();
        apartamento.setAndar(4);
        apartamento.setMetragemQuadradaApartamento(10);

        Contribuinte contribuinte = new Contribuinte();
        contribuinte.alocarImovel(lote);
        contribuinte.alocarImovel(casa);
        contribuinte.alocarImovel(apartamento);

        ArrayList<Float> resposta = new ArrayList<Float>();
        resposta.add(300.0f);
        resposta.add(400.0f);
        resposta.add(280.0f);
        assertEquals(resposta, contribuinte.getValorImoveis());
    }

    @Test
    void deveRetornarListaImoveis() {
        Lote lote = new Lote();
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();

        Contribuinte contribuinte = new Contribuinte();
        contribuinte.alocarImovel(lote);
        contribuinte.alocarImovel(casa);
        contribuinte.alocarImovel(apartamento);

        ArrayList<String> resposta = new ArrayList<String>();
        resposta.add("Lote");
        resposta.add("Casa");
        resposta.add("Apartamento");
        assertEquals(resposta, contribuinte.getImoveisPorCliente());
    }

}