package ArrecadacaoIptuEx1;

public class Apartamento extends Imovel{

    private float metragemQuadradaApartamento;
    private int andar;

    public Apartamento() {
        super();
        this.metragemQuadradaApartamento = 0;
        this.andar = 0;
    }

    public float getMetragemQuadradaApartamento() {
        return this.metragemQuadradaApartamento;
    }

    public void setMetragemQuadradaApartamento(float metragemQuadradaApartamento) {
        if (metragemQuadradaApartamento <= 0) {
            throw new IllegalArgumentException("Metragem invalida");
        } else {
            this.metragemQuadradaApartamento = metragemQuadradaApartamento;
        }
    }

    public int getAndar() {
        return this.andar;
    }

    public void setAndar(int andar) {
        if (andar <= 0) {
            throw new IllegalArgumentException("Andar invalido");
        } else {
            this.andar = andar;
        }
    }

    public float calcularValorImovel() {
        float valor = (this.metragemQuadradaApartamento * 40);
        if (this.andar > 1 && this.andar <= 10) {
            valor -= (valor * (this.andar-1) * 0.1f);
        } else if (this.andar > 10) {
            valor -= (valor * 0.9f);
        }
        return valor;
    }
}
