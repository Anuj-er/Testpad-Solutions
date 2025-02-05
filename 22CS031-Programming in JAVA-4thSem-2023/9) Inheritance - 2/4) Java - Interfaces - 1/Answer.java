class Car implements Vehicle {
    private int gear;
    private int speed;
    public Car() {
        this.gear = 0;
        this.speed = 0;
    }
    @Override
    public void changeGear(int a) {
        this.gear = a;
    }
    @Override
    public void speedUp(int a) {
        this.speed += a;
    }
    @Override
    public void applyBrakes(int a) {
        this.speed -= a;
    }
    @Override
    public String toString() {
        return this.speed + "kmph";
    }
}
class Bike implements Vehicle {
    private int gear;
    private int speed;
    public Bike() {
        this.gear = 0;
        this.speed = 0;
    }
    @Override
    public void changeGear(int a) {
        this.gear = a;
    }
    @Override
    public void speedUp(int a) {
        this.speed += a;
    }
    @Override
    public void applyBrakes(int a) {
        this.speed -= a;
    }
    @Override
    public String toString() {
        return this.speed + "kmph";
    }
}