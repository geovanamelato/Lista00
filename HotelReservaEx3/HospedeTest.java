package HotelReservaEx3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {
    @Test
    void deveAceitarCodigoMaiorQueZero() {
        Hospede hospede = new Hospede();
        hospede.setCodigo(1);
        assertEquals(1, hospede.getCodigo());
    }

    @Test
    void deveLancarExcecaoCodigoZeradoNegativo() {
        Hospede hospede = new Hospede();
        try {
            hospede.setCodigo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarNomeNaoVazio() {
        Hospede hospede = new Hospede();
        hospede.setNome("Geovana");
        assertEquals("Geovana", hospede.getNome());
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        Hospede hospede = new Hospede();
        try {
            hospede.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }


    @Test
    void deveRetornarZeroReservas() {
        Hospede hospede = new Hospede();
        assertEquals(0, hospede.numeroReservas());
    }

    @Test
    void deveRetornarUmaReserva() {
        Hospede hospede = new Hospede();
        Reserva reserva = new ReservaDuplo();
        hospede.alocarReserva(reserva);
        assertEquals(1, hospede.numeroReservas());
    }

    @Test
    void deveRetornarDuasReservas() {
        Reserva reserva = new ReservaSingle();
        Reserva reserva1 = new ReservaTriplo();

        Hospede hospede = new Hospede();
        hospede.alocarReserva(reserva);
        hospede.alocarReserva(reserva1);

        assertEquals(2, hospede.numeroReservas());
    }

    @Test
    void naoDeveAlocarMesmoObjeto() {
        Reserva reserva = new ReservaSingle();

        Hospede hospede = new Hospede();
        hospede.alocarReserva(reserva);
        hospede.alocarReserva(reserva);

        assertEquals(1, hospede.numeroReservas());
    }

    @Test
    void deveRemoverReserva() {
        Reserva reserva = new ReservaSingle();
        Reserva reserva1 = new ReservaTriplo();

        Hospede hospede = new Hospede();
        hospede.alocarReserva(reserva);
        hospede.alocarReserva(reserva1);
        hospede.removerReserva(reserva1);

        assertEquals(1, hospede.numeroReservas());
    }

    @Test
    void deveRetornarReservasHospede() {
        ReservaSingle reserva = new ReservaSingle();
        ReservaDuplo reserva1 = new ReservaDuplo();
        ReservaTriplo reserva2 = new ReservaTriplo();

        Hospede hospede = new Hospede();
        hospede.alocarReserva(reserva);
        hospede.alocarReserva(reserva1);
        hospede.alocarReserva(reserva2);

        ArrayList<String> esperado = new ArrayList<String>();
        esperado.add("Single");
        esperado.add("Duplo");
        esperado.add("Triplo");

        assertEquals(hospede.consultarReservas(), esperado);
    }

    @Test
    void deveRetornarValorReservasHospede() {
        ReservaSingle reserva = new ReservaSingle();
        reserva.setDiasHospedagem(1);
        ReservaDuplo reserva1 = new ReservaDuplo();
        reserva1.setDiasHospedagem(2);
        reserva1.setNumeroRefeicoes(4);
        ReservaTriplo reserva2 = new ReservaTriplo();
        reserva2.setDiasHospedagem(10);
        reserva2.setNumeroRefeicoes(30);

        Hospede hospede = new Hospede();
        hospede.alocarReserva(reserva);
        hospede.alocarReserva(reserva1);
        hospede.alocarReserva(reserva2);

        ArrayList<Float> esperado = new ArrayList<Float>();
        esperado.add(50f);
        esperado.add(200f);
        esperado.add(1300f);

        assertEquals(hospede.valorReservas(), esperado);
    }

}