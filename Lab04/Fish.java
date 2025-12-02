public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }
  
    public void swim() {
        System.out.println(name + " плывёт.");
    }
}
