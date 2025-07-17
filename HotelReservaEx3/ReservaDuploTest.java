package HotelReservaEx3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservaDuploTest {
    @Test
    void deveVerificarNumeroValidoRefeicoes() {
        ReservaDuplo reservaDuplo = new ReservaDuplo();
        reservaDuplo.setNumeroRefeicoes(0);
        assertEquals(0, reservaDuplo.getNumeroRefeicoes());
    }

    @Test
    void deveLancarExcecaoNumeroRefeicoesNegativo() {
        ReservaDuplo reservaDuplo = new ReservaDuplo();
        try {
            reservaDuplo.setNumeroRefeicoes(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de refeições invalido", e.getMessage());
        }
    }

}