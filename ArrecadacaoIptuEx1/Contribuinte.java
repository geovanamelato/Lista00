package ArrecadacaoIptuEx1;

import java.util.ArrayList;

public class Contribuinte {
    private int codigo;
    private String nome;
    private ArrayList<Imovel> imoveis;

    public Contribuinte() {
        this.codigo = 0;
        this.nome = "";
        this.imoveis = new ArrayList<Imovel>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Codigo invalido");
        } else {
            this.codigo = codigo;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio");
        } else {
            this.nome = nome;
        }
    }

    public ArrayList<Imovel> getImoveis() {
        return this.imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public void alocarImovel(Imovel imovel) {
        if (!this.imoveis.contains(imovel)) {
            this.imoveis.add(imovel);
        }
    }

    public void removerImovel(Imovel imovel) {
        this.imoveis.remove(imovel);
    }

    public int getNumeroImoveis() {
        return this.imoveis.size();
    }

    public ArrayList<String> getImoveisPorCliente() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Imovel imovel : this.imoveis) {
            if (imovel.getClass() == Lote.class) {
                resultado.add("Lote");
            } else if (imovel.getClass() == Casa.class) {
                resultado.add("Casa");
            } else if (imovel.getClass() == Apartamento.class) {
                resultado.add("Apartamento");
            }
        }
        return resultado;
    }

    public ArrayList<Float> getValorImoveis() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Imovel imovel : this.imoveis) {
            resultado.add(imovel.calcularValorImovel());
        }
        return resultado;
    }
}


