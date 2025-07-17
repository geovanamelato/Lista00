package HotelReservaEx3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservaTriploTest {
    @Test
    void deveVerificarNumeroValidoRefeicoes() {
        ReservaTriplo reservaTriplo = new ReservaTriplo();
        reservaTriplo.setNumeroRefeicoes(0);
        assertEquals(0, reservaTriplo.getNumeroRefeicoes());
    }

    @Test
    void deveLancarExcecaoNumeroRefeicoesNegativo() {
        ReservaTriplo reservaTriplo = new ReservaTriplo();
        try {
            reservaTriplo.setNumeroRefeicoes(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de refeições invalido", e.getMessage());
        }
    }

}