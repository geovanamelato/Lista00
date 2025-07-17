package ControleAcademicoEx8;

public abstract class Aluno {
    private int matricula;
    private String nome;
    private String endereco;
    private Curso curso;

    public Aluno(Curso curso) {
        this.matricula = 0;
        this.nome = "";
        this.endereco = "";
        this.curso = curso;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula <= 0) {
            throw new IllegalArgumentException("Matricula invalida");
        } else {
            this.matricula = matricula;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome invalido");
        } else {
            this.nome = nome;
        }
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Endereço invalido");
        } else {
            this.endereco = endereco;
        }
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int pegarCodigoCurso() {
        return curso.getCodigo();
    }
}


