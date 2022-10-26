package github.io.jpdravila.Java8.Reflections;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

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

public class ReflectionExemplo {

    public static void main(String[] args){
        //Instância da classe produto
        Produto p = new Produto("Geladeira", 3000.00);
        //Instância da classe class
        Class cl = p.getClass();
        //Todos os métodos declarados na classe produto
        Method[] method = cl.getDeclaredMethods();

        for(Method m : method){
            System.out.println(m.getName());

            Parameter[] parameter = m.getParameters();

            for(Parameter pr : parameter){
                System.out.println(pr);
            }
        }
    }

}
