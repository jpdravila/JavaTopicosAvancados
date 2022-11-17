package github.io.jpdravila.Java10.InterferenciaTipoVarLocal;

import java.util.List;

public class InterfTiposVarLocExemplo {
    public static void main(String[] args){

        var a1 = "Programando em";

        String a2 = " Java";

        System.out.println(a1 + a2);

        /*
        -> Esse tipo de variável o compilador não tolera.
        var teste;
        teste = 10;
        */

        var listaDeMarcasCarro = List.of("Chevrolet", "Volkswagen", "Toyota", "Fiat", "Mitsubishi");
        for(String marcas : listaDeMarcasCarro){
            System.out.printf("[ %s ]",marcas);
        }

        for(var i = 0; i < listaDeMarcasCarro.size(); i++){
            System.out.println(listaDeMarcasCarro.get((i)));
        }

        //Sua maior vantagem de uso é despoluir o código;
        ArrayIndexOutOfBoundsException eUm = new ArrayIndexOutOfBoundsException();
        var eDois = new ArrayIndexOutOfBoundsException();

    }
}
