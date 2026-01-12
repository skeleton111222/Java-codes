public class ThreadExample{

    // a. Implement MyThread that extends Thread class and override run() method
    static class MyThread extends Thread {
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread using Thread class");
                    Thread.sleep(1000);  // Pause for 1 second
                    System.out.println("Thread State: " + this.getState());  // Display thread state
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    // b. Implement MyRunnable that implements Runnable interface and override run() method
    static class MyRunnable implements Runnable {
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread using Runnable interface");
                    Thread.sleep(1000);  // Pause for 1 second
                    System.out.println("Thread State: " + Thread.currentThread().getState());  // Display thread state
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        // Create and start MyThread (Thread class)
        MyThread thread1 = new MyThread();
        thread1.setPriority(Thread.MAX_PRIORITY); // Set high priority
        System.out.println("MyThread State: " + thread1.getState());  // Initial state
        thread1.start();  // Start thread1

        // Create and start MyRunnable (Runnable interface)
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.setPriority(Thread.MIN_PRIORITY); // Set low priority
        System.out.println("MyRunnable Thread State: " + thread2.getState());  // Initial state
        thread2.start();  // Start thread2

        // Optionally, wait for threads to finish (to ensure all threads have completed before program ends)
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}