package Enums;

public enum Types {
    BUG("Bug"),
    DARK("Dark"),
    DRAGON("Dragon"),
    ELECTRIC("Electric"),
    FAIRY("Fairy"),
    FIGHTING("Fighting"),
    FIRE("Fire"),
    FLYING("Flying"),
    GHOST("Ghost"),
    GRASS("Grass"),
    GROUND("Ground"),
    ICE("Ice"),
    NORMAL("Normal"),
    POISON("Poison"),
    PSYCHIC("Psychic"),
    ROCK("Rock"),
    STEEL("Steel"),
    WATER("Water");

    private String label;
    Types(String label) {
        this.label = label;
    }
    public String label() {
        return this.label;
    }
}
