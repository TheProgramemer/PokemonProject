package Pokemon.Gen6.SixNinety;

import Enums.Types;
import Pokemon.Pokemon;

public class Sylveon extends Pokemon {
    public Sylveon(int level) {
        super("Sylveon", level, Types.FAIRY);
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Sylveon(this.level);
        }
    }
}
