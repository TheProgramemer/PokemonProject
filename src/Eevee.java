public class Eevee extends Pokemon implements StoneEvolvable {
    public Eevee() { super("Eevee", 5, Types.NORMAL); }
    public Eevee(String name, int level, Types type) {
        super(name, level, type);
    }

    @Override
    public Pokemon evolve(EvolutionStones stone) {
        Pokemon evolution = this;
        switch (stone) {
            case WATER_STONE:
                evolution = new Vaporeon.Builder()
                        .name("Vaporeon")
                        .level(this.getLevel())
                        .build();
                break;
            case FIRE_STONE:
                evolution =  new Flareon.Builder()
                        .name("Flareon")
                        .level(this.getLevel())
                        .build();
                break;
            case THUNDER_STONE:
                evolution =  new Jolteon.Builder()
                        .name("Jolteon")
                        .level(this.getLevel())
                        .build();
                break;
            case PSYCHIC_STONE:
                evolution =  new Espeon.Builder()
                        .name("Espeon")
                        .level(this.getLevel())
                        .build();
                break;
            case DARK_STONE:
                evolution =  new Umbreon.Builder()
                        .name("Umbreon")
                        .level(this.getLevel())
                        .build();
                break;
            case ICE_STONE:
                evolution =  new Glaceon.Builder()
                        .name("Glaceon")
                        .level(this.getLevel())
                        .build();
                break;
            case LEAF_STONE:
                evolution =  new Leafeon.Builder()
                        .name("Leafeon")
                        .level(this.getLevel())
                        .build();
                break;
            case FAIRY_STONE:
                evolution =  new Sylveon.Builder()
                        .name("Sylveon")
                        .level(this.getLevel())
                        .build();
                break;
        }
        return evolution;
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Eevee(this.name, this.level, this.type);
        }
    }
}
