package model;
public class TrabalhadorContaOutrem extends ContribuinteComRendimentosTrabalho{
    private String empresa;
    private float escalao1OutrosRendimentos = 30000;
    private float taxaRendimentosTrabalho = 1;
    private float taxaOutrosRendimentos1 = 2;
    private float taxaOutrosRendimentos2 = 2;

    public float obterTaxaRendimentosTrabalho(){
        return 0;
    }
    public  float obterTaxaOutrosRendimentos(){
        return 0;
    }
}
