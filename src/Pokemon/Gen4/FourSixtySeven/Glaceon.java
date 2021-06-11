package Pokemon.Gen4.FourSixtySeven;

import Enums.Types;
import Pokemon.Pokemon;

public class Glaceon extends Pokemon {
    public Glaceon(int level) {
        super("Glaceon", level, Types.ICE);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Glaceon(this.level);
        }
    }
}