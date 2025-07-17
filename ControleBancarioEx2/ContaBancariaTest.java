package ControleBancarioEx2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
    @Test
    void deveAceitarNumeroContaMaiorQueZero() {
        ContaBancaria contaBancaria = new ContaCorrenteEspecial();
        contaBancaria.setNumeroConta(1);
        assertEquals(1, contaBancaria.getNumeroConta());
    }

    @Test
    void deveLancarExcecaoNumeroContaZeradoNegativo() {
        try {
            ContaBancaria contaBancaria = new ContaCorrenteEspecial();
            contaBancaria.setNumeroConta(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("conta invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarSaldoContaNaoNegativo() {
        ContaBancaria contaBancaria = new ContaCorrenteEspecial();
        contaBancaria.setSaldo(0);
        assertEquals(0, contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoSaldoContaNegativo() {
        try {
            ContaBancaria contaBancaria = new ContaCorrenteEspecial();
            contaBancaria.setSaldo(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("saldo invalido", e.getMessage());
        }
    }

}