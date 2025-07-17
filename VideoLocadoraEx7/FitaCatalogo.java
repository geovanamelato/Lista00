package VideoLocadoraEx7;

public class FitaCatalogo extends Fita {
    public FitaCatalogo() {
        super();
    }

    public float calcularValorEmprestimoFita() {
        return (this.getQuantidadeDiasEmprestimo() * 5);
    }
}