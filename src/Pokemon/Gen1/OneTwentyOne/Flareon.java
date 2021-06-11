package Pokemon.Gen1.OneTwentyOne;

import Enums.Types;
import Pokemon.Pokemon;

public class Flareon extends Pokemon {
    public Flareon(int level) {
        super("Flareon", level, Types.FIRE);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Flareon(this.level);
        }
    }
}