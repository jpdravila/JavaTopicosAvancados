package github.io.jpdravila.Java14.Record;

record Retangulo(double largura, double altura){

}

//Records não pode estender ou ser estendido;
//Records não podem ser abstratos;
//Não pode haver variáveis de instância na estrutura;
//Todos os atributos são definidos como privados e final;
//Permite criação de métodos estáticos

public class RecordExemplo {
    public static void main(String[] args) {
        Retangulo retUm = new Retangulo(300.0, 200.0);

        System.out.println(retUm.altura());
        System.out.println(retUm.largura());


    }
}
