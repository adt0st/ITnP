class Cat extends Animal {
    private String breed;
    private boolean isIndoor;

    public Cat() {
        super();
        this.breed = "Unknown";
        this.isIndoor = false;
    }

    public Cat(String name, int age, String habitat, String breed, boolean isIndoor) {
        super(name, age, habitat);
        this.breed = breed;
        this.isIndoor = isIndoor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу");
    }

    @Override
    public void move() {
        System.out.println(name + " ходит изящно.");
    }
}
