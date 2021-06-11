public class Jolteon extends Pokemon {
    public Jolteon(String name, int level, Types type) {
        super(name, level, type);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Jolteon(this.name, this.level, this.type);
        }
    }
}
