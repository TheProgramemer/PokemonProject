public class Leafeon extends Pokemon {
    public Leafeon(String name, int level, Types type) {
        super(name, level, type);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Leafeon(this.name, this.level, this.type);
        }
    }
}
