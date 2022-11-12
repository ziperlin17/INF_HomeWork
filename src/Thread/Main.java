package Thread;

import java.util.Scanner;

public class Main {

    static boolean exit = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (exit == false) {
                System.out.println("TEST MESSAGE");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        new Scanner(System.in).nextLine();
        exit = true;
    }
}

