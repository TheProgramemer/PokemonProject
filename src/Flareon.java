public class Flareon extends Pokemon {
    public Flareon(String name, int level, Types type) {
        super(name, level, type);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Flareon(this.name, this.level, this.type);
        }
    }
}