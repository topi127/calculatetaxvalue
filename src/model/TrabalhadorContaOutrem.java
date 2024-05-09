package model;
public class TrabalhadorContaOutrem extends ContribuinteComRendimentosTrabalho{
    private String empresa;
    private float escalao1OutrosRendimentos = 30000;
    private float taxaRendimentosTrabalho = 1;
    private float taxaOutrosRendimentos1 = 2;
    private float taxaOutrosRendimentos2 = 2;
    public TrabalhadorContaOutrem() {this.empresa ="sem empresa";}
    public TrabalhadorContaOutrem(String nome, String morada, float outrosRendimentos, float rendimentosTrabalho, String empresa, float escalao1OutrosRendimentos, float taxaRendimentosTrabalho, float taxaOutrosRendimentos1, float taxaOutrosRendimentos2) {
        super(nome, morada, outrosRendimentos, rendimentosTrabalho);
        this.empresa = empresa;
        this.escalao1OutrosRendimentos = escalao1OutrosRendimentos;
        this.taxaRendimentosTrabalho = taxaRendimentosTrabalho;
        this.taxaOutrosRendimentos1 = taxaOutrosRendimentos1;
        this.taxaOutrosRendimentos2 = taxaOutrosRendimentos2;
    }
    @Override
    public String toString() {
        return "TrabalhadorContaOutrem{" +
                "empresa='" + empresa + '\'' +
                ", escalao1OutrosRendimentos=" + escalao1OutrosRendimentos +
                ", taxaRendimentosTrabalho=" + taxaRendimentosTrabalho +
                ", taxaOutrosRendimentos1=" + taxaOutrosRendimentos1 +
                ", taxaOutrosRendimentos2=" + taxaOutrosRendimentos2 +
                '}';
    }
    public float obterTaxaRendimentosTrabalho(){
        float RT = super.getRendimentosTrabalho();
        if (RT <= 30000){
            this.taxaRendimentosTrabalho = 0.01f;
        }else{
            this.taxaRendimentosTrabalho = 0.02f;
        }
        return RT * this.taxaRendimentosTrabalho;
    }
    public  float obterTaxaOutrosRendimentos(){
        return super.getOutrosRendimentos() * 0.02f;
    }
}