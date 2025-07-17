package ControleBancarioEx2;

public class ContaCorrenteNormal extends ContaBancaria {

    public ContaCorrenteNormal() {
        super();
    }

    public float cacularSaldoDisponivel() {
        return this.getSaldo();
    }
}
