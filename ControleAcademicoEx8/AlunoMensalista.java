package ControleAcademicoEx8;

public class AlunoMensalista extends Aluno {
    private float valorMensalidade;
    private int quantidadeParcelas;

    public AlunoMensalista(Curso curso) {
        super(curso);
        this.valorMensalidade = 0;
        this.quantidadeParcelas = 0;
    }

    public float getValorMensalidade() {
        return this.valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        if (valorMensalidade <= 0) {
            throw new IllegalArgumentException("Mensalidade invalida");
        } else {
            this.valorMensalidade = valorMensalidade;
        }
    }

    public int getQuantidadeParcelas() {
        return this.quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        if (quantidadeParcelas <= 0) {
            throw new IllegalArgumentException("Quantidade de parcelas invalida");
        } else {
            this.quantidadeParcelas = quantidadeParcelas;
        }
    }


}


