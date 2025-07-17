package ControleBancarioEx2;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
        super();
    }

    public float cacularSaldoDisponivel() {
        return this.getSaldo();
    }
}


