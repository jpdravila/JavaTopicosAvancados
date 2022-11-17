package github.io.jpdravila.Java9.MelhoriasAPIStream;

import java.util.ArrayList;
import java.util.List;

class Produto {
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

public class ApiStreamExemplo {
    public static void main(String[] args){
        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Geladeira 470L", 2999.00));
        listaProdutos.add(new Produto("TV UHD 50", 3500.00));
        listaProdutos.add(new Produto("Computador i5 4gb, 2TB", 2.699));
        listaProdutos.add(new Produto("Geladeira 120L", 900.00));
        listaProdutos.add(new Produto("Microondas 20L", 499.66));
        listaProdutos.add(new Produto("Geladeira 500L", 3100.00));

        listaProdutos.stream()
                .dropWhile(p -> p.getNome().contains("Geladeira"))
                .map(p-> p.getNome())
                .forEach(System.out::println);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        listaProdutos.stream()
                .dropWhile(p -> p.getNome().contains("Geladeira"))
                .map(p-> p.getNome())
                .forEach(System.out::println);

    }
}
