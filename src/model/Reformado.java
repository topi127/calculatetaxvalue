package model;
public class Reformado extends ContribuinteComRendimentosTrabalho{
    private float taxaRendimentosTrabalho = 1;
    private float taxaOutrosRendimentos = 3;
    public Reformado() {}
    public Reformado(String nome, String morada, float outrosRendimentos, float rendimentosTrabalho, float taxaRendimentosTrabalho, float taxaOutrosRendimentos) {
        super(nome, morada, outrosRendimentos, rendimentosTrabalho);
        this.taxaRendimentosTrabalho = taxaRendimentosTrabalho;
        this.taxaOutrosRendimentos = taxaOutrosRendimentos;
    }
    @Override
    public String toString() {
        return "Reformado{" +
                "taxaRendimentosTrabalho=" + taxaRendimentosTrabalho +
                ", taxaOutrosRendimentos=" + taxaOutrosRendimentos +
                '}';
    }
    public float obterTaxaRendimentosTrabalho(){
        return super.getRendimentosTrabalho() * (taxaRendimentosTrabalho/100);
    }
    public  float obterTaxaOutrosRendimentos(){
        return super.getRendimentosTrabalho() * (taxaOutrosRendimentos/100);
    }
}