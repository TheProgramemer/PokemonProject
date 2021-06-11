public class Umbreon extends Pokemon {
    public Umbreon(String name, int level, Types type) {
        super(name, level, type);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Umbreon(this.name, this.level, this.type);
        }
    }
}
