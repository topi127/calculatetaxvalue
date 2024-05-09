package model;
public abstract class Contribuinte {
    private String nome;
    private String morada;
    private float outrosRendimentos;
    public Contribuinte() {
        this.nome = "Sem nome";
        this.morada = "Sem morada";
        this.outrosRendimentos = 0;
    }
    public Contribuinte(String nome, String morada, float outrosRendimentos)
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMorada() {
        return morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public float getOutrosRendimentos() {
        return outrosRendimentos;
    }

    public void setOutrosRendimentos(float outrosRendimentos) {
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
    public abstract float calcularImposto();
}