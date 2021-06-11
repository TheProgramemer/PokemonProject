public class Wartortle extends Pokemon implements LevelEvolvable {
    public Wartortle(String name, int level, Types type) {
        super(name, level, type);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        if (this.getLevel() >= 36) {
            evolve();
        }
    }

    @Override
    public Pokemon evolve() {
        return new Blastoise.Builder().build();
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Wartortle(this.name, this.level, this.type);
        }
    }
}
