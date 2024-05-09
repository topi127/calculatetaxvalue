package model;
public class Desempregado extends Contribuinte{
    private int mesesParagem;
    private float taxaOutrosRendimentos;
    public Desempregado() {
        this.mesesParagem = 0;
        this.taxaOutrosRendimentos = 2;
    }
    public Desempregado(String nome, String morada, float outrosRendimentos, int mesesParagem){ //float taxaOutrosRendimentos (?)
        super(nome, morada, outrosRendimentos);
        this.mesesParagem = mesesParagem;
        this.taxaOutrosRendimentos = taxaOutrosRendimentos;
    }
    @Override
    public String toString() {
        return "Desempregado{" +
                "mesesParagem=" + mesesParagem +
                ", taxaOutrosRendimentos=" + taxaOutrosRendimentos +
                '}';
    }
    public float calcularImposto() {
        float OR = this.getOutrosRendimentos();
        return OR * (this.taxaOutrosRendimentos/100);
    }
}