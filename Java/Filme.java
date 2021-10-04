package Prova;

public class Filme {
    private String categoria;
    private String filme;
    private int minutos;

    public Filme() {
    }

    public Filme(String categoria, String filme, int minutos) {
        this.categoria = categoria;
        this.filme = filme;
        this.minutos = minutos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "categoria='" + categoria + '\'' +
                ", filme='" + filme + '\'' +
                ", minutos=" + minutos +
                '}';
    }
}
