import model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contribuinte> contribuintes = new ArrayList<Contribuinte>();
        contribuintes.add(new Desempregado("João Andrade Penafiel","Ermesinde",9000,24));
        contribuintes.add(new Desempregado("Joana Andrade Paços Ferreira","Rua Feliz",8000,12));
        contribuintes.add(new Reformado("Marta Joba","Rua Triste",1000,10000,1,3));
        contribuintes.add(new Reformado("Raquel Buna","Rua Triste Amargo",0,2000,1,3));
        contribuintes.add(new TrabalhadorContaOutrem("Boas Vski","Morada Boas",0,9000,"Fico Cables",1,1,2,2));
        contribuintes.add(new TrabalhadorContaOutrem("Ruben Helder","Moroda Dias",7000,10000,"Ficosa",1,1,2,2));
        contribuintes.add(new TrabalhadorContaPropria("Habal Hutchu", "Morarda gueste",0,14000,5,2,2,3,"Trolha"));
        contribuintes.add(new TrabalhadorContaPropria("João Silva", "Miguel Bastos",0,10000,5,2,2,3,"Canalisador"));
        for (Contribuinte contribuinte : contribuintes){
            System.out.println(contribuinte.calcularImposto());
        }
        for (Contribuinte contribuinte : contribuintes){
            if(contribuinte instanceof Desempregado){
                System.out.println(contribuinte.getNome());
                System.out.println(contribuinte.calcularImposto());
            }
        }
    }
}