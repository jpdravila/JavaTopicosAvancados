package github.io.jpdravila.StreamPackage;

import java.util.*;

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
/*class OrdenaProdutoPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2){
        return p1.getPreco().compareTo(p2.getPreco());
    }
}*/


public class ExemploUm {

    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("Geladeira 470L", 2999.00));
        listaProdutos.add(new Produto("Geladeira 120L", 900.00));
        listaProdutos.add(new Produto("Geladeira 500L", 3100.00));

        /*//Lista de geladeira
        List<Produto> listaGeladeiras = new ArrayList<Produto>();
        for(Produto p : listaProdutos) {
            if(p.getNome().contains("Geladeira")){
                listaGeladeiras.add(p);
            }
        }

        //Ordena a lsita de geladeira
        Collections.sort(listaGeladeiras, new OrdenaProdutoPorPreco());

        //Lista dos nomes das geladeira
        List<String> listaNomesGeladeiras = new ArrayList<String>();
        for(Produto p : listaGeladeiras){
            listaNomesGeladeiras.add(p.getNome().toUpperCase());
        }

        //Existe os nomes das geladeiras
        for(String nome : listaNomesGeladeiras){
            System.out.println(nome);
        }*/

        listaProdutos.stream().filter(p -> p.getNome().contains("Geladeira"))
                .sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco())).map(p -> p.getNome().toUpperCase())
                .forEach(System.out::println);

    }
}
