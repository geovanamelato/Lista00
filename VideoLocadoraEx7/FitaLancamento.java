package VideoLocadoraEx7;

public class FitaLancamento extends Fita {
    private float valorAluguelDiario;
    public FitaLancamento() {
        super();
        this.valorAluguelDiario = 0;
    }

    public float getValorAluguelDiario() {
        return this.valorAluguelDiario;
    }

    public void setValorAluguelDiario(float valorAluguelDiario) {
        if (valorAluguelDiario <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        } else {
            this.valorAluguelDiario = valorAluguelDiario;
        }
    }

    public float calcularValorEmprestimoFita() {
        return (this.getQuantidadeDiasEmprestimo() * this.valorAluguelDiario);
    }
}