package Pokemon.Gen2.OneNinetyTwo;

import Enums.Types;
import Pokemon.Pokemon;

public class Espeon extends Pokemon {
    public Espeon(int level) {
        super("Espeon", level, Types.PSYCHIC);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Espeon(this.level);
        }
    }
}
