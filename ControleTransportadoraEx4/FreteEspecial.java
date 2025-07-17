package ControleTransportadoraEx4;

public class FreteEspecial extends Frete{
    private float taxaEntrega;

    public FreteEspecial() {
        super();
        this.taxaEntrega = 0;
    }

    public float getTaxaEntrega() {
        return this.taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        if (taxaEntrega < 0) {
            throw new IllegalArgumentException("Taxa invalida");
        } else {
            this.taxaEntrega = taxaEntrega;
        }
    }

    public float calcularFrete() {
        return (this.getValorFrete() + this.taxaEntrega);
    }
}

