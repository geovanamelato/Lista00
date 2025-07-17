package HotelReservaEx3;

public class ReservaSingle extends Reserva {

    public float calcularValorReserva() {
        return (this.getDiasHospedagem() * 50);
    }
}


