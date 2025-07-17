package ControleBancarioEx2;

public class ContaCorrenteEspecial extends ContaBancaria{
    private float limiteCredito;

    public ContaCorrenteEspecial() {
        super();
        this.limiteCredito = 0;
    }

    public float getLimiteCredito() {
        return this.limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        if (limiteCredito < 0) {
            throw new IllegalArgumentException("Limite invalido");
        } else {
            this.limiteCredito = limiteCredito;
        }
    }

    public float cacularSaldoDisponivel() {
        return (this.getSaldo() + this.limiteCredito);
    }
}
