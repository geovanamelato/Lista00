package ControleEstacionamentoEx6;

public abstract class Vaga {
    private int numero;
    private String placaVeiculo;
    private Cliente cliente;
    private String tipoVaga;

    public Vaga() {
        this.numero = 0;
        this.placaVeiculo = "";
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Numero invalido");
        } else {
            this.numero = numero;
        }
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        if (placaVeiculo.trim().isEmpty()) {
            throw new IllegalArgumentException("Placa invalida");
        } else {
            this.placaVeiculo = placaVeiculo;
        }
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoVaga() {
        return this.tipoVaga;
    }

    public void setTipoVaga(String tipoVaga) {
        if (tipoVaga.trim().equals("Diaria") || tipoVaga.equals("Mensal") || tipoVaga.equals("Semanal")) {
            this.tipoVaga = tipoVaga.trim();
        } else {
            throw new IllegalArgumentException("Tipo de vaga invalida");
        }
    }

    public abstract float calcularAluguel();
}
