package VideoLocadoraEx7;

import java.util.Date;

public abstract class Fita {
    private Date data;
    private String nomeFilme;
    private Cliente cliente;
    private int quantidadeDiasEmprestimo;
    private String tipoFita;

    public Fita() {
        this.data = new Date();
        this.nomeFilme = "";
        this.quantidadeDiasEmprestimo = 0;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeFilme() {
        return this.nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        if (nomeFilme.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome invalido");
        } else {
            this.nomeFilme = nomeFilme;
        }
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantidadeDiasEmprestimo() {
        return this.quantidadeDiasEmprestimo;
    }

    public void setQuantidadeDiasEmprestimo(int quantidadeDiasEmprestimo) {
        if (quantidadeDiasEmprestimo <= 0) {
            throw new IllegalArgumentException("Quantidade de dias invalido");
        } else {
            this.quantidadeDiasEmprestimo = quantidadeDiasEmprestimo;
        }
    }

    public String getTipoFita() {
        return this.tipoFita;
    }

    public void setTipoFita(String tipoFita) {
        if (tipoFita.trim().equals("Catalogo") || tipoFita.equals("Especial") || tipoFita.equals("Lançamento")) {
            this.tipoFita = tipoFita.trim();
        } else {
            throw new IllegalArgumentException("Tipo de fita invalida");
        }
    }

    public abstract float calcularValorEmprestimoFita();
}

