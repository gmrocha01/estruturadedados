package hashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Fusca"));
        listaCarros.add(new Carro("Ka"));
        System.out.println(listaCarros.contains(new Carro("Fusca")));
        System.out.println(listaCarros.contains(new Carro("Celta")));
        System.out.println(new Carro("Ka").hashCode());
        System.out.println(new Carro("Fusca").hashCode());

        Carro carro1 = new Carro("Civic");
        Carro carro2 = new Carro("Ferrari");


        System.out.println("\n" +carro1.equals(carro2)); //Vai retornar se é igual.
        System.out.println(carro1.equals(carro1)); //Vai retornar se é igual.

    }
}
