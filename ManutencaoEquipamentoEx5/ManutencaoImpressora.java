package ManutencaoEquipamentoEx5;

public class ManutencaoImpressora extends Manutencao {
    private float valorPecasTrocadas;

    public ManutencaoImpressora() {
        super();
        this.valorPecasTrocadas = 0;
    }

    public float getValorPecasTrocadas() {
        return this.valorPecasTrocadas;
    }

    public void setValorPecasTrocadas(float valorPecasTrocadas) {
        if (valorPecasTrocadas <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        } else {
            this.valorPecasTrocadas = valorPecasTrocadas;
        }
    }

    public float calcularValorManutencao() {
        return (this.valorPecasTrocadas + this.getValorMaoDeObra());
    }
}


