package HotelReservaEx3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {
    @Test
    void deveVerificarNumeroDiasValido() {
        Reserva reserva = new ReservaTriplo();
        reserva.setDiasHospedagem(1);
        assertEquals(1, reserva.getDiasHospedagem());
    }

    @Test
    void deveLancarExcecaoNumeroDiasZeradoNegativo() {
        Reserva reserva = new ReservaTriplo();
        try {
            reserva.setDiasHospedagem(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Dias invalidos", e.getMessage());
        }

    }

}