package ControleEstacionamentoEx6;

public class VagaMensal extends Vaga {
    private int quantidadeMeses;

    public VagaMensal() {
        super();
        this.quantidadeMeses = 0;
    }

    public int getQuantidadeMeses() {
        return this.quantidadeMeses;
    }

    public void setQuantidadeMeses(int quantidadeMeses) {
        if (quantidadeMeses <= 0) {
            throw new IllegalArgumentException("Numero de meses invalido");
        } else {
            this.quantidadeMeses = quantidadeMeses;
        }
    }

    public float calcularAluguel(){
        return (this.quantidadeMeses * 150);
    }
}