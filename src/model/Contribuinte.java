package model;
public abstract class Contribuinte {
    private String nome;
    private String morada;
    private double outrosRendimentos;
    public Contribuinte() {
        this.nome = "Sem nome";
        this.morada = "Sem morada";
        this.outrosRendimentos = 0;
    }
    public Contribuinte(String nome, String morada, double outrosRendimentos) {
        this.nome = nome;
        this.morada = morada;
        this.outrosRendimentos = outrosRendimentos;
    }
    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", morada='" + morada + '\'' +
                ", outrosRendimentos=" + outrosRendimentos +
                '}';
    }
    public abstract double calcularImposto();
}
