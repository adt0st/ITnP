public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " мяукает.");
    }

    public void feed() {
        System.out.println(name + " кормится.");
    }
}
