package ControleAcademicoEx8;

public class AlunoBolsistaIntegral extends Aluno {
    private int quantidadeParcelasIsentas;
    public AlunoBolsistaIntegral(Curso curso) {
        super(curso);
        this.quantidadeParcelasIsentas = 0;
    }

    public int getQuantidadeParcelasIsentas() {
        return this.quantidadeParcelasIsentas;
    }

    public void setQuantidadeParcelasIsentas(int quantidadeParcelasIsentas) {
        if (quantidadeParcelasIsentas < 0) {
            throw new IllegalArgumentException("Numero invalido");
        } else {
            this.quantidadeParcelasIsentas = quantidadeParcelasIsentas;
        }
    }
}