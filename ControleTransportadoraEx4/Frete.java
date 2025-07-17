package ControleTransportadoraEx4;

public abstract class Frete {
    private int numero;
    private Cliente cliente;
    private float valorFrete;

    public Frete() {
        this.numero = 0;
        this.valorFrete = 0;
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

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorFrete() {
        return this.valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        if (valorFrete < 0) {
            throw new IllegalArgumentException("Frete invalido");
        } else {
            this.valorFrete = valorFrete;
        }
    }

    public abstract float calcularFrete();
}

