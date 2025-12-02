class Fish extends Animal {
    private String species;
    private boolean isFreshwater;

    public Fish() {
        super();
        this.species = "Unknown";
        this.isFreshwater = true;
    }

    public Fish(String name, int age, String habitat, String species, boolean isFreshwater) {
        super(name, age, habitat);
        this.species = species;
        this.isFreshwater = isFreshwater;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isFreshwater() {
        return isFreshwater;
    }

    public void setFreshwater(boolean freshwater) {
        isFreshwater = freshwater;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " булькает.");
    }

    @Override
    public void move() {
        System.out.println(name + " плывёт.");
    }
}
