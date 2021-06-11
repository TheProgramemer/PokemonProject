package Pokemon.Gen4.FourSixtySeven;

import Enums.Types;
import Pokemon.Pokemon;

public class Leafeon extends Pokemon {
    public Leafeon(int level) {
        super("Leafeon", level, Types.GRASS);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Leafeon(this.level);
        }
    }
}
