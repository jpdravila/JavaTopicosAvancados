package github.io.jpdravila;

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

*/
