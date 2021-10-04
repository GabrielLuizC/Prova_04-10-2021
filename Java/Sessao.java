package Prova;

public class Sessao {
    private int sala;
    private String periodo;
    private double preço;

    public Sessao() {
    }

    public Sessao(int sala, String periodo, double preço) {
        this.periodo = periodo;
        this.sala = sala;
        this.preço = preço;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "sala=" + sala +
                ", periodo='" + periodo + '\'' +
                ", preço=" + preço +
                '}';
    }
}
