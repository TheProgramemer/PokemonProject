package Pokemon.Gen1.OneTwentyOne;

import Enums.Types;
import Pokemon.Pokemon;

public class Vaporeon extends Pokemon {
    public Vaporeon(int level) {
        super("Vaporeon", level, Types.WATER);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Vaporeon(this.level);
        }
    }
}