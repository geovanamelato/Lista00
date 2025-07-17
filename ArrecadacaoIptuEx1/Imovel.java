package ArrecadacaoIptuEx1;

public abstract class Imovel {
    private Contribuinte contribuinte;

    public Imovel() {
        this.contribuinte = getContribuinte();
    }

    public Contribuinte getContribuinte() {
        return this.contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    public abstract float calcularValorImovel();
}


