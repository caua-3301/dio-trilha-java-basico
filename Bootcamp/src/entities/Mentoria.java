package entities;

public class Mentoria {
    private int id;
    private String professor;
    private Curso curso;

    public Mentoria(int id, String professor, Curso curso) {
        this.id = id;
        this.professor = professor;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
