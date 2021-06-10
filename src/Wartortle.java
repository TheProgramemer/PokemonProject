public class Wartortle extends Pokemon implements Evolvable {
    public Wartortle(String name, int level, String type) {
        super(name, level, type);
    }

    @Override
    public void sayName() {
        System.out.println("Wartortle");
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
