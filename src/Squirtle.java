public class Squirtle extends Pokemon {
    public Squirtle(String name, int level, String type) {
        super(name, level, type);
    }

    @Override
    public void sayName() {
        System.out.println("Squirtle");
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Squirtle(this.name, this.level, this.type);
        }
    }
}
