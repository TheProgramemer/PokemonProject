public class Eevee extends Pokemon implements StoneEvolvable {
    public Eevee() { super("Eevee", 5, Types.NORMAL); }
    public Eevee(String name, int level, Types type) {
        super(name, level, type);
    }

    @Override
    public Pokemon evolve(EvolutionStones stone) {
        if (stone.equals(EvolutionStones.WATER_STONE)) {
            return new Vaporeon.Builder()
                    .name("Vaporeon")
                    .level(this.getLevel())
                    .build();
        } else if (stone.equals(EvolutionStones.FIRE_STONE)) {
            return new Flareon.Builder()
                    .name("Flareon")
                    .level(this.getLevel())
                    .build();
        } else if (stone.equals(EvolutionStones.THUNDER_STONE)) {
            return new Jolteon.Builder()
                    .name("Jolteon")
                    .level(this.getLevel())
                    .build();
        } else if (stone.equals(EvolutionStones.PSYCHIC_STONE)) {
            return new Espeon.Builder()
                    .name("Espeon")
                    .level(this.getLevel())
                    .build();
        } else if (stone.equals(EvolutionStones.DARK_STONE)) {
            return new Umbreon.Builder()
                    .name("Umbreon")
                    .level(this.getLevel())
                    .build();
        } else if (stone.equals(EvolutionStones.ICE_STONE)) {
            return new Glaceon.Builder()
                    .name("Glaceon")
                    .level(this.getLevel())
                    .build();
        } else if (stone.equals(EvolutionStones.LEAF_STONE)) {
            return new Leafeon.Builder()
                    .name("Leafeon")
                    .level(this.getLevel())
                    .build();
        } else if (stone.equals(EvolutionStones.FAIRY_STONE)) {
            return new Sylveon.Builder()
                    .name("Sylveon")
                    .level(this.getLevel())
                    .build();
        } else {
            return this;
        }
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Eevee(this.name, this.level, this.type);
        }
    }
}
