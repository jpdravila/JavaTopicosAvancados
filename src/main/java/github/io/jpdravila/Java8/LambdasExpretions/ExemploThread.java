package github.io.jpdravila.Java8.LambdasExpretions;

public class ExemploThread {
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 em execulção de Instância");
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> System.out.println("Thread 2 em execulção de Lambda"));
        t2.start();
    }
}
/*
 ->Lambda expressions - Sintaxe Básica<-
 ||| Sem argumentos: () -> System.out.println("Hello World");
 ||| Um argumento: () -> System.out.println(s);
 ||| Dois argumentos: (x, y) -> x + y;
*/
