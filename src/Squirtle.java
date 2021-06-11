public class Squirtle extends Pokemon implements LevelEvolvable {
    public Squirtle(String name, int level, Types type) {
        super(name, level, type);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        if (this.getLevel() >= 16) {
            evolve();
        }
    }

    @Override
    public Pokemon evolve() {
        return new Wartortle.Builder().build();
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Squirtle(this.name, this.level, this.type);
        }
    }
}
