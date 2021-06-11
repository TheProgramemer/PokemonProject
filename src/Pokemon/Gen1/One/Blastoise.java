package Pokemon.Gen1.One;

import Enums.Types;
import Pokemon.Pokemon;

public class Blastoise extends Pokemon {
    public Blastoise(int level) {
        super("Blastoise", level, Types.WATER);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Blastoise(this.level);
        }
    }
}
