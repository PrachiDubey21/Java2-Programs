
class A extends Thread {

    // in every thread we need a run method

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }

}

class B implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hii");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }

        }
    }

}

public class threads {

    public static void main(String[] args) {

        // A thread in Java is like a small unit of a program
        // that runs independently inside a bigger program.
        // You can think of a thread as a mini-task
        // running inside your application.
        // Imagine you are watching a video on YouTube:
        // One thread plays the video.
        // Another thread plays the audio.
        // Another thread may handle buffering.
        // All these work together at the same time.
        // Without threads, a program can only do one thing at a time.
        // With threads, a program can do multiple things at once (multitasking).

        // method 1
        A obj = new A();

        // method2
        Runnable obj1 = new B();

        // runnig parallel
        obj.start();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
        }

        Thread t1 = new Thread(obj1);
        t1.start();



        // In Java, thread-safe means that a piece of code, object, or class
        // can be safely used by multiple threads at the same time
        // without causing unexpected behavior, errors, or data corruption.

        // Imagine two people (threads) trying to withdraw money from
        // the same bank account (shared resource) at the same time.
        // If the account balance is not handled properly, both people
        // might withdraw more than what’s actually there.
        // A thread-safe account system would make sure that only one
        // withdrawal happens at a time, so the balance always stays correct.


        

    }

}
