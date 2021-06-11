public class Glaceon extends Pokemon {
    public Glaceon(String name, int level, Types type) {
        super(name, level, type);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Glaceon(this.name, this.level, this.type);
        }
    }
}