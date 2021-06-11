public class Blastoise extends Pokemon {
    public Blastoise(String name, int level, Types type) {
        super(name, level, type);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Blastoise(this.name, this.level, this.type);
        }
    }
}
