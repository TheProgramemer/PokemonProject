package Pokemon.Gen2.OneNinetyTwo;

import Enums.Types;
import Pokemon.Pokemon;

public class Umbreon extends Pokemon {
    public Umbreon(int level) {
        super("Umbreon", level, Types.DARK);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Umbreon(this.level);
        }
    }
}
