package ArrecadacaoIptuEx1;

public class Casa extends Imovel{
    private float metragemQuadradaTerreno;
    private float metragemQuadradaConstrucao;

    public Casa() {
        this.metragemQuadradaTerreno = 0;
        this.metragemQuadradaConstrucao = 0;
    }

    public float getMetragemQuadradaTerreno() {
        return this.metragemQuadradaTerreno;
    }

    public void setMetragemQuadradaTerreno(float metragemQuadradaTerreno) {
        if (metragemQuadradaTerreno <= 0) {
            throw new IllegalArgumentException("Metragem do terreno invalida");
        } else {
            this.metragemQuadradaTerreno = metragemQuadradaTerreno;
        }
    }

    public float getMetragemQuadradaConstrucao() {
        return this.metragemQuadradaConstrucao;
    }

    public void setMetragemQuadradaConstrucao(float metragemQuadradaConstrucao) {
        if (metragemQuadradaConstrucao <= 0) {
            throw new IllegalArgumentException("Metragem da construção invalida");
        } else {
            this.metragemQuadradaConstrucao = metragemQuadradaConstrucao;
        }
    }

    public float calcularValorImovel(){
        return ((this.metragemQuadradaTerreno * 30) + (this.metragemQuadradaConstrucao * 50));
    }
}





