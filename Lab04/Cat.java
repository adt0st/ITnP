public class Cat extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " издаёт звук.");
    }

    public void feed() {
        System.out.println(name + " кормится.");
    }
}
