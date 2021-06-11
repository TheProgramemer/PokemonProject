package Pokemon.Gen1.One;

import Enums.Types;
import Evolvable.LevelEvolvable;
import Pokemon.Pokemon;

public class Wartortle extends Pokemon implements LevelEvolvable {
    public Wartortle(int level) {
        super("Wartortle", level, Types.WATER);
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
            return new Wartortle(this.level);
        }
    }
}
