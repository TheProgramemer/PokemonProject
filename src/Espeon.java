public class Espeon extends Pokemon {
    public Espeon(String name, int level, Types type) {
        super(name, level, type);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Espeon(this.name, this.level, this.type);
        }
    }
}
