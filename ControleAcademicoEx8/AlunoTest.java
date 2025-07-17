package ControleAcademicoEx8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    Curso curso;
    @BeforeEach
    void setUp() {
        curso = new Curso();
    }

    @Test
    void deveAceitarMatriculaMaiorQueZero() {
        Aluno aluno = new AlunoBolsistaIntegral(curso);
        aluno.setMatricula(1);
        assertEquals(1, aluno.getMatricula());
    }

    @Test
    void deveLancarExcecaoMatriculaZeradaNegativa() {
        Aluno aluno = new AlunoBolsistaIntegral(curso);
        try {
            aluno.setMatricula(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Matricula invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarNomeNaoVazio() {
        Aluno aluno = new AlunoBolsistaIntegral(curso);
        aluno.setNome("Maria T");
        assertEquals("Maria T", aluno.getNome());
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        Aluno aluno = new AlunoBolsistaIntegral(curso);
        try {
            aluno.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarEnderecoNaoVazio() {
        Aluno aluno = new AlunoBolsistaIntegral(curso);
        aluno.setEndereco("rua");
        assertEquals("rua", aluno.getEndereco());
    }

    @Test
    void deveLancarExcecaoEnderecoVazio() {
        Aluno aluno = new AlunoBolsistaIntegral(curso);
        try {
            aluno.setEndereco(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Endereço invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCodigoCurso() {
        curso.setCodigo(1);
        Aluno aluno = new AlunoBolsistaIntegral(curso);
        assertEquals(1, aluno.pegarCodigoCurso());
    }

}