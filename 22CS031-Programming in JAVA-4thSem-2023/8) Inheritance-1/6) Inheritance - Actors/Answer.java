class Person {
    protected String name;
    protected String color;
    protected int numberOfEyes;
    protected int debutYear;
    public Person(String name, String color, int numberOfEyes, int debutYear) {
        this.name = name;
        this.color = color;
        this.numberOfEyes = numberOfEyes;
        this.debutYear = debutYear;
    }
}
class Actor extends Person {
    public Actor(String name, String color, int numberOfEyes, int debutYear) {
        super(name, color, numberOfEyes, debutYear);
    }
    @Override
    public String toString() {
        return "The person " + name + " is an Actor. He is " + color + " in color, has " +
               numberOfEyes + " eyes and debut in " + debutYear;
    }
}
class Actress extends Person {
    public Actress(String name, String color, int numberOfEyes, int debutYear) {
        super(name, color, numberOfEyes, debutYear);
    }
    @Override
    public String toString() {
        return "The person " + name + " is an Actress. She is " + color + " in color, has " +
               numberOfEyes + " eyes and debut in " + debutYear;
    }
}