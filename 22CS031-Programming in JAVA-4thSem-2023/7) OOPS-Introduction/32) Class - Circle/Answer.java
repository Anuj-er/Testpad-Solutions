class Circle {
    private double radius;
    public Circle(double r) {
        this.radius = r;
    }
    public double area() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }
    public double circumference() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }
    public double getRadius() {
        return Math.round(radius * 10.0) / 10.0;
    }
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
        System.out.println("Radius: " + c.getRadius());
        System.out.println("String Representation: " + c.toString());
    }
}