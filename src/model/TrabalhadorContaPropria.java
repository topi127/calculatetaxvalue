package model;
public class TrabalhadorContaPropria extends ContribuinteComRendimentosTrabalho{
    private String profissao;
    private float escalao1OutrosRendimentos = 50000;
    private float taxaRendimentosTrabalho = 3;
    private float taxaOutrosRendimentos1 = 2;
    private float taxaOutrosRendimentos2 = 5;
    public TrabalhadorContaPropria() {
        this.profissao = "sem profissão";
    }
    public TrabalhadorContaPropria(String nome, String morada, float outrosRendimentos, float rendimentosTrabalho, float taxaOutrosRendimentos2, float taxaOutrosRendimentos1, float taxaRendimentosTrabalho, float escalao1OutrosRendimentos, String profissao) {
        super(nome, morada, outrosRendimentos, rendimentosTrabalho);
        this.taxaOutrosRendimentos2 = taxaOutrosRendimentos2;
        this.taxaOutrosRendimentos1 = taxaOutrosRendimentos1;
        this.taxaRendimentosTrabalho = taxaRendimentosTrabalho;
        this.escalao1OutrosRendimentos = escalao1OutrosRendimentos;
        this.profissao = profissao;
    }
    @Override
    public String toString() {
        return "TrabalhadorContaPropria{" +
                "profissao='" + profissao + '\'' +
                ", escalao1OutrosRendimentos=" + escalao1OutrosRendimentos +
                ", taxaRendimentosTrabalho=" + taxaRendimentosTrabalho +
                ", taxaOutrosRendimentos1=" + taxaOutrosRendimentos1 +
                ", taxaOutrosRendimentos2=" + taxaOutrosRendimentos2 +
                '}';
    }
    public float obterTaxaRendimentosTrabalho(){
        return 0;
    }
    public  float obterTaxaOutrosRendimentos(){
        return 0;
    }
}