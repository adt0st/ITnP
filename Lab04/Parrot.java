public class Parrot extends Animal {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " чирикает.");
    }

    public void fly() {
        System.out.println(name + " летает.");
    }
}
