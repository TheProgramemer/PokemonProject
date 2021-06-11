public class Sylveon extends Pokemon {
    public Sylveon(String name, int level, Types type) {
        super(name, level, type);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Sylveon(this.name, this.level, this.type);
        }
    }
}
