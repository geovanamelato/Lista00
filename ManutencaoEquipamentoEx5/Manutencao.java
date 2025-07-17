package ManutencaoEquipamentoEx5;

public abstract class Manutencao {
    private Cliente cliente;
    private int numeroManutencao;
    private float valorMaoDeObra;
    private String tipoEquipamento;

    public Manutencao() {
        this.numeroManutencao = 0;
        this.valorMaoDeObra = 0;
        this.tipoEquipamento = "";
    }


    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroManutencao() {
        return this.numeroManutencao;
    }

    public void setNumeroManutencao(int numeroManutencao) {
        if (numeroManutencao <= 0) {
            throw new IllegalArgumentException("Numero de manutenção invalido");
        } else {
            this.numeroManutencao = numeroManutencao;
        }
    }

    public float getValorMaoDeObra() {
        return this.valorMaoDeObra;
    }

    public void setValorMaoDeObra(float valorMaoDeObra) {
        if (valorMaoDeObra <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        } else {
            this.valorMaoDeObra = valorMaoDeObra;
        }
    }

    public String getTipoEquipamento() {
        return this.tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        if (tipoEquipamento.trim().equals("CPU") || tipoEquipamento.equals("Impressora") || tipoEquipamento.equals("Monitor")) {
            this.tipoEquipamento = tipoEquipamento.trim();
        } else {
            throw new IllegalArgumentException("Tipo de equipamento invalido");
        }
    }

    public abstract float calcularValorManutencao();


}
