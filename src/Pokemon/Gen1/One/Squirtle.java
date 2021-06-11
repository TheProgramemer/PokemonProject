package Pokemon.Gen1.One;

import Enums.Types;
import Evolvable.LevelEvolvable;
import Pokemon.Pokemon;

public class Squirtle extends Pokemon implements LevelEvolvable {
    public Squirtle(int level) {
        super("Squirtle", level, Types.WATER);
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
            return new Squirtle(this.level);
        }
    }
}
