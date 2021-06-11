package Pokemon.Gen1.OneTwentyOne;

import Enums.Types;
import Pokemon.Pokemon;

public class Jolteon extends Pokemon {
    public Jolteon(int level) {
        super("Jolteon", level, Types.ELECTRIC);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Jolteon(this.level);
        }
    }
}
