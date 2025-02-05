import java.util.Scanner;
class Main {
    private int carCount;
    private int cashCollected;
    public Main() {
        carCount = 0;
        cashCollected = 0;
    }
    public void payingCar() {
        carCount++;
        cashCollected += 50;
    }
    public void nopayCar() {
        carCount++;
    }
    public void display() {
        System.out.println("Total Cash : " + cashCollected + "/-");
        System.out.println("Total Cars : " + carCount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main tollBooth = new Main();
        char input;
        while (true) {
            input = scanner.next().charAt(0);
            if (input == 'p') {
                tollBooth.payingCar();
            } else if (input == 'n') {
                tollBooth.nopayCar();
            } else if (input == 'q') {
                tollBooth.display();
                break;
            }
        }
        scanner.close();
    }
}