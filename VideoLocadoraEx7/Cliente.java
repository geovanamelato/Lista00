package VideoLocadoraEx7;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Fita> fitas;

    public Cliente() {
        this.codigo = 0;
        this.nome = "";
        this.fitas = new ArrayList<Fita>();
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

    public ArrayList<Fita> getFitas() {
        return this.fitas;
    }

    public void setFitas(ArrayList<Fita> fitas) {
        this.fitas = fitas;
    }

    public void alugarFita(Fita fita) {
        if (!this.fitas.contains(fita)) {
            this.fitas.add(fita);
        }
    }

    public void devolverFita(Fita fita) {
        this.fitas.remove(fita);
    }

    public int calcularQuantiadeFitasAlugadas() {
        return this.fitas.size();
    }

    public ArrayList<String> listaFitasAlugadas() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Fita fita : fitas) {
            if (fita.getClass().equals(FitaCatalogo.class)) {
                resultado.add("Fita Catalogo");
            } else if (fita.getClass().equals(FitaLancamento.class)) {
                resultado.add("Fita Lançamento");
            } else if (fita.getClass().equals(FitaEspecial.class)) {
                resultado.add("Fita Especial");
            }
        }
        return resultado;
    }

    public ArrayList<Float> listaValoresFitasAlugadas() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Fita fita : fitas) {
            resultado.add(fita.calcularValorEmprestimoFita());
        }
        return resultado;
    }
}
