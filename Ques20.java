
class MyThread extends Thread {

    volatile boolean running = true;

    public void run() {
        System.out.println("Thread started...");
        while (running) {
        }
        System.out.println("Thread stopped!");
    }
}

class Ques20 {

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(2000); 

        t.running = false;
        System.out.println("Main thread changed 'running' to false.");
    }
}