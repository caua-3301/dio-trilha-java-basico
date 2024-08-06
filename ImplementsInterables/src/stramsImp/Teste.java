package stramsImp;

public class Teste {
    private int numero;

    public Teste(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        return this.numero % 2 == 0;
    }

    @Override
    public int hashCode() {
        return numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
