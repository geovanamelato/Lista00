package ControleTransportadoraEx4;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Frete> fretes;

    public Cliente() {
        this.codigo = 0;
        this.nome = "";
        this.fretes = new ArrayList<Frete>();
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

    public ArrayList<Frete> getFretes() {
        return this.fretes;
    }

    public void setFretes(ArrayList<Frete> fretes) {
        this.fretes = fretes;
    }

    public void alocarFrete(Frete frete) {
        if (!this.fretes.contains(frete)) {
            this.fretes.add(frete);
        }
    }

    public void removerFrete(Frete frete) {
        this.fretes.remove(frete);
    }

    public int calcularQuantidadeFretes() {
        return this.fretes.size();
    }

    public ArrayList<String> verificarFretesCliente() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Frete frete : fretes) {
            if (frete.getClass().equals(FreteNormal.class)) {
                resultado.add("Frete normal");
            } else if (frete.getClass().equals(FreteEspecial.class)) {
                resultado.add("Frete especial");
            } else if (frete.getClass().equals(FreteUrgente.class)) {
                resultado.add("Frete urgente");
            }
        }
        return resultado;
    }

    public ArrayList<Float> verificarValoresFrete() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Frete frete : fretes) {
            resultado.add(frete.calcularFrete());
        }
        return resultado;
    }
}



