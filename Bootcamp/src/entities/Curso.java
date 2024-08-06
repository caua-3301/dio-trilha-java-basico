package entities;

import enums.OpcaoDeLinguagemEDificuldade;

public class Curso {
    private int id;
    private String nome;
    private String descricao;
    private OpcaoDeLinguagemEDificuldade opcao;

    public Curso(int id, String nome, String descricao, OpcaoDeLinguagemEDificuldade opcao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.opcao = opcao;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", opcao=" + opcao +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public OpcaoDeLinguagemEDificuldade getOpcao() {
        return opcao;
    }

    public void setOpcao(OpcaoDeLinguagemEDificuldade opcao) {
        this.opcao = opcao;
    }
}
