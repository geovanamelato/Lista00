package ManutencaoEquipamentoEx5;

public class ManutencaoMonitor extends Manutencao {

    public ManutencaoMonitor() {
        super();
    }
    public float calcularValorManutencao() {
        return this.getValorMaoDeObra();
    }
}
