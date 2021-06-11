public class Vaporeon extends Pokemon {
    public Vaporeon(String name, int level, Types type) {
        super(name, level, type);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Vaporeon(this.name, this.level, this.type);
        }
    }
}