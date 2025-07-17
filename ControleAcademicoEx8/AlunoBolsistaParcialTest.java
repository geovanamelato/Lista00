package ControleAcademicoEx8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaParcialTest {
    Curso curso;
    @BeforeEach
    void setUp() {
        curso = new Curso();
    }

    @Test
    void deveAceitarValorMensalidadeMaiorZero() {
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        aluno.setValorMensalidade(0.01f);
        assertEquals(0.01f, aluno.getValorMensalidade());
    }

    @Test
    void deveLancarExcecaoValorMensalidadeZeradoNegativo() {
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        try {
            aluno.setValorMensalidade(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Mensalidade invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarQuantidadeParcelasMaiorZero() {
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        aluno.setQuantidadeParcelas(1);
        assertEquals(1, aluno.getQuantidadeParcelas());
    }

    @Test
    void deveLancarExcecaoQuantidadeParcelasZeradoNegativo() {
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        try {
            aluno.setQuantidadeParcelas(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de parcelas invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarPercentualDescontoMaiorZero() {
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        aluno.setPercentualDesconto(0.01f);
        assertEquals(0.01f, aluno.getPercentualDesconto());
    }

    @Test
    void deveLancarExcecaoPercentualDescontoZeradoNegativo() {
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        try {
            aluno.setPercentualDesconto(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Desconto invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarPercentualDescontoCinquentaPorcento() {
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        aluno.setPercentualDesconto(50f);
        assertEquals(50f, aluno.getPercentualDesconto());
    }

    @Test
    void deveLancarExcecaoDescontoMaiorCinquentaPorcento() {
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        try {
            aluno.setPercentualDesconto(50.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O desconto nao pode ser superior a 50%", e.getMessage());
        }
    }

}