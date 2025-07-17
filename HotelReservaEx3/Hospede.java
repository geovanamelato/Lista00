package HotelReservaEx3;

import java.util.ArrayList;

public class Hospede {
    private String nome;
    private int codigo;
    private ArrayList<Reserva> reservas;

    public Hospede() {
        reservas = new ArrayList<Reserva>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio");
        } else {
            this.nome = nome;
        }
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Codigo invalido");
        } else {
            this.codigo = codigo;
        }
    }

    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void alocarReserva(Reserva reserva) {
        if (!this.reservas.contains(reserva)) {
            this.reservas.add(reserva);
        }
    }

    public void removerReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }

    public int numeroReservas() {
        int resultado = 0;
        for (Reserva reserva : reservas) {
            resultado++;
        }
        return resultado;
    }

    public ArrayList<String> consultarReservas() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Reserva reserva : reservas) {
            if (reserva.getClass().equals(ReservaSingle.class)) {
                resultado.add("Single");
            } else if (reserva.getClass().equals(ReservaDuplo.class)) {
                resultado.add("Duplo");
            } else if (reserva.getClass().equals(ReservaTriplo.class)) {
                resultado.add("Triplo");
            }
        }
        return resultado;
    }

    public ArrayList<Float> valorReservas() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Reserva reserva : reservas) {
            resultado.add(reserva.calcularValorReserva());
        }
        return resultado;
    }
}
