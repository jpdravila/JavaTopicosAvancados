package github.io.jpdravila.Exemplo02;

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

public class Exemplo02 {

    public static void main(String[] args){
       List<Produto> lista = new ArrayList<>();

       lista.add(new Produto("TV 42", 2000.00));
       lista.add(new Produto("Geladeira 470L", 3200.00));
       lista.add(new Produto("Gogão Quatro bocas", 900.00));
        lista.add(new Produto("Video Game", 1999.00));
        lista.add(new Produto("Microondas", 550.00));
        //Lmbda expretion com argumento
        lista.forEach((p) -> System.out.println(p.getNome() + " = " + p.getPreco()));
    }

}
