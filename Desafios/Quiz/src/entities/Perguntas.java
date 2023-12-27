package entities;

public class Perguntas {

    private String perguntas;

    public Perguntas(String perguntas) {
        this.perguntas = perguntas;
    }

    public String getPergunta() {
        return perguntas;
    }
    @Override
    public String toString() {
        return perguntas;
    }
}
