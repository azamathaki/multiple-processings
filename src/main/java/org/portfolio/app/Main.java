package org.portfolio.app;

public class Main {
    public static void main(String[] args) {

        Files carGame = new Files("Real Racing 3", 5);
        Files gt5 = new Files("gt5",13);
        Files soccer = new Files("Soccer",4);

        MyRunnable r1 = new MyRunnable(carGame);
        MyRunnable r2 = new MyRunnable(gt5);
        MyRunnable r3 = new MyRunnable(soccer);

        Thread thread = new Thread(r1);
        Thread thread2 = new Thread(r2);
        Thread thread3 = new Thread(r3);

        thread.start();
        thread2.start();
        thread3.start();



    }
}
