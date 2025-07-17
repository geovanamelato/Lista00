package HotelReservaEx3;

public class ReservaTriplo extends Reserva {
    private int numeroRefeicoes;

    public int getNumeroRefeicoes() {
        return this.numeroRefeicoes;
    }

    public void setNumeroRefeicoes(int numeroRefeicoes) {
        if (numeroRefeicoes < 0) {
            throw new IllegalArgumentException("Numero de refeições invalido");
        } else {
            this.numeroRefeicoes = numeroRefeicoes;
        }
    }

    public float calcularValorReserva() {
        return ((this.getDiasHospedagem() * 100) + (this.numeroRefeicoes * 10));
    }
}

