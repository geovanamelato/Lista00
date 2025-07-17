package ControleTransportadoraEx4;

public class FreteUrgente extends Frete{
    private float taxaEntrega;
    private int quantidadeItens;

    public FreteUrgente() {
        super();
        this.taxaEntrega = 0;
        this.quantidadeItens = 0;
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

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        if (quantidadeItens <= 0) {
            throw new IllegalArgumentException("Numero invalido de itens");
        } else {
            this.quantidadeItens = quantidadeItens;
        }
    }

    public float calcularFrete() {
        return (this.getValorFrete() + this.taxaEntrega + (this.quantidadeItens * 10));
    }
}
