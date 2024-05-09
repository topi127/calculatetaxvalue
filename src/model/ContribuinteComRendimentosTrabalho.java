package model;
public abstract class ContribuinteComRendimentosTrabalho extends Contribuinte{
    private float rendimentosTrabalho;
    public ContribuinteComRendimentosTrabalho() {
        this.rendimentosTrabalho = 0;
    }
    public ContribuinteComRendimentosTrabalho(String nome, String morada, float outrosRendimentos, float rendimentosTrabalho) {
        super(nome, morada, outrosRendimentos);
        this.rendimentosTrabalho = rendimentosTrabalho;
    }
    public float getRendimentosTrabalho() {
        return rendimentosTrabalho;
    }
    public void setRendimentosTrabalho(float rendimentosTrabalho) {
        this.rendimentosTrabalho = rendimentosTrabalho;
    }
    @Override
    public String toString() {
        return "ContribuinteComRendimentosTrabalho{" +
                "rendimentosTrabalho=" + rendimentosTrabalho +
                '}';
    }
    public float calcularImposto(){
        return 0;
    }
    public abstract float obterTaxaRendimentosTrabalho();
    public abstract float obterTaxaOutrosRendimentos();
}