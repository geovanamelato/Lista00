package ControleAcademicoEx8;

public class AlunoBolsistaParcial extends Aluno {
    private float valorMensalidade;
    private float quantidadeParcelas;
    private float percentualDesconto;

    public AlunoBolsistaParcial(Curso curso) {
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

    public float getQuantidadeParcelas() {
        return this.quantidadeParcelas;
    }

    public void setQuantidadeParcelas(float quantidadeParcelas) {
        if (quantidadeParcelas <= 0) {
            throw new IllegalArgumentException("Quantidade de parcelas invalida");
        } else {
            this.quantidadeParcelas = quantidadeParcelas;
        }
    }

    public float getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(float percentualDesconto) {
        if (percentualDesconto <= 0) {
            throw new IllegalArgumentException("Desconto invalido");
        }
        else if (percentualDesconto > 50) {
            throw new IllegalArgumentException("O desconto nao pode ser superior a 50%");
        } else {
            this.percentualDesconto = percentualDesconto;
        }
    }

    public float calcularMensalidade() {
        return (this.valorMensalidade - (this.valorMensalidade * (this.percentualDesconto/100)));
    }
}

