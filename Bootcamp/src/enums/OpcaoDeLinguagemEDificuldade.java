package enums;

public enum OpcaoDeLinguagemEDificuldade {
    JAVA (1, "Dificil"),
    C (2, "Dificil"),
    CPP (3, "Intermediario"),
    PYTHON (4, "Intermediario"),
    JAVASCRIPT (5, "Facil");

    private final int codigo;
    private final String dificuldade;

    OpcaoDeLinguagemEDificuldade(int codigo, String dificuldade) {
        this.codigo = codigo;
        this.dificuldade = dificuldade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDificuldade() {
        return dificuldade;
    }
}
