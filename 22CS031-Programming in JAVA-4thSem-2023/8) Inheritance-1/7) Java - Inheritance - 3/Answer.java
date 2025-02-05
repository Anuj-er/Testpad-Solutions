class C extends B {
    @Override
    public void m1() {
        super.m1(); // Call the m1 method from class B
    }
    @Override
    public void m2() {
        System.out.println("Code");
        super.m2(); // Call the m2 method from class A
    }
    @Override
    public String toString() {
        return "new" + super.toString(); // Use the toString method from class B
    }
}