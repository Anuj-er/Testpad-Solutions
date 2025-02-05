import java.util.Scanner;
class ReverseGreet extends Thread {
    private int threadNumber;
    ReverseGreet(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    public void run() {
        System.out.println("CodeQuotient Thread" + threadNumber);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ReverseGreet[] threads = new ReverseGreet[n];
        for (int i = 0; i < n; i++) {
            threads[i] = new ReverseGreet(n - i);
            threads[i].start();
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}