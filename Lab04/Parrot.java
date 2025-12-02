class Parrot extends Animal {
    private String color;
    private boolean canTalk;
    private static int count = 0;

    public Parrot() {
        super();
        this.color = "Green";
        this.canTalk = false;
        count++;
    }

    public Parrot(String name, int age, String habitat, String color, boolean canTalk) {
        super(name, age, habitat);
        this.color = color;
        this.canTalk = canTalk;
        count++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Чирик");
    }

    @Override
    public void move() {
        System.out.println(name + " летает.");
    }
}
