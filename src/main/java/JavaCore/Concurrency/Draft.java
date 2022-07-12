package JavaCore.Concurrency;

import java.time.Duration;

public class Draft {
    public static void main(String[] args) {

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++){
                    System.out.println("thread1: " + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread1.start();

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++){
                    System.out.println("thread2: " + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread2.start();
    }

}
