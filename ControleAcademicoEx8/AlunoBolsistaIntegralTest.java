package ControleAcademicoEx8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaIntegralTest {
    Curso curso;
    @BeforeEach
    void setUp() {
        curso = new Curso();
    }

    @Test
    void deveAceitarNumeroParcelarIsentasNaoNegativas() {
        AlunoBolsistaIntegral aluno = new AlunoBolsistaIntegral(curso);
        aluno.setQuantidadeParcelasIsentas(0);
        assertEquals(0, aluno.getQuantidadeParcelasIsentas());
    }

    @Test
    void deveLancarExcecaoNumeroParcelarIsentasNegativas() {
        AlunoBolsistaIntegral aluno = new AlunoBolsistaIntegral(curso);
        try {
            aluno.setQuantidadeParcelasIsentas(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero invalido", e.getMessage());
        }
    }

}