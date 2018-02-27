package ru.itis;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new NewThread(i+"");
        }

//        new NewThread("One");
//        new NewThread("Two");
//        new NewThread("Three");

        try {
            Thread.sleep(10000);
            System.out.println("главный поток завершен");
        }
        catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
    }

    static class NewThread implements Runnable {

        String name;
        Thread t;

        NewThread (String threadname) {
            name = threadname;
            t = new Thread(this, name);
            System.out.println("Новый поток " + t);
            t.start();
        }

        @Override
        public void run() {
            try {
                for (int i = 50; i > 0 ; i--) {
                    System.out.println(name + " :" + i);
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e) {
                System.out.println(name + " прерван");
            }
            System.out.println(name + " завершен");
        }


    }
}
