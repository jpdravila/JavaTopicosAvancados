package github.io.jpdravila.Java8.TypeInterferences;

import java.util.ArrayList;
import java.util.List;

class Produto{
    public String nome;
    public Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

class ImprimeProduto{
    public static void imprime(List<Produto> lista){
        if(!lista.isEmpty()){
            lista.forEach((pUm) -> System.out.println(pUm.getNome() + "|" + pUm.getPreco()));
        }else{
            System.out.println("Lista vazia");
        }
    }
}

public class TypeInterferencesExemplo {

    public static void main(String[] args){
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("TV 42", 2000.00));
        lista.add(new Produto("Geladeira 470L", 3200.00));
        lista.add(new Produto("Fogão Quatro Bocas", 900.00));
        lista.add(new Produto("Video Game", 1999.00));
        lista.add(new Produto("Microondas", 550.00));

        ImprimeProduto.imprime(lista);
        //ImprimeProduto.imprime(new ArrayList<>());

    }

}
