public class Wartortle extends Pokemon {
    public Wartortle(String name, int level, String type) {
        super(name, level, type);
    }

    @Override
    public void sayName() {
        System.out.println("Wartortle");
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Wartortle(this.name, this.level, this.type);
        }
    }
}
