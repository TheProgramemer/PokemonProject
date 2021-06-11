package Pokemon.Gen1.OneTwentyOne;

import Enums.Types;
import Enums.EvolutionStones;
import Evolvable.StoneEvolvable;
import Pokemon.Gen2.OneNinetyTwo.Espeon;
import Pokemon.Gen2.OneNinetyTwo.Umbreon;
import Pokemon.Gen4.FourSixtySeven.Glaceon;
import Pokemon.Gen4.FourSixtySeven.Leafeon;
import Pokemon.Gen6.SixNinety.Sylveon;
import Pokemon.Pokemon;

public class Eevee extends Pokemon implements StoneEvolvable {
    public Eevee(int level) { super("Eevee", level, Types.NORMAL); }

    @Override
    public Pokemon evolve(EvolutionStones stone) {
        Pokemon evolution = this;
        switch (stone) {
            case WATER_STONE:
                evolution = new Vaporeon.Builder()
                        .level(this.getLevel())
                        .build();
                break;
            case FIRE_STONE:
                evolution =  new Flareon.Builder()
                        .level(this.getLevel())
                        .build();
                break;
            case THUNDER_STONE:
                evolution =  new Jolteon.Builder()
                        .level(this.getLevel())
                        .build();
                break;
            case PSYCHIC_STONE:
                evolution =  new Espeon.Builder()
                        .level(this.getLevel())
                        .build();
                break;
            case DARK_STONE:
                evolution =  new Umbreon.Builder()
                        .level(this.getLevel())
                        .build();
                break;
            case ICE_STONE:
                evolution =  new Glaceon.Builder()
                        .level(this.getLevel())
                        .build();
                break;
            case LEAF_STONE:
                evolution =  new Leafeon.Builder()
                        .level(this.getLevel())
                        .build();
                break;
            case FAIRY_STONE:
                evolution =  new Sylveon.Builder()
                        .level(this.getLevel())
                        .build();
                break;
        }
        return evolution;
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Eevee(this.level);
        }
    }
}
