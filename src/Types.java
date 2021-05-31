public enum Types {
    FIRE("Fire"),
    WATER("Water"),
    GRASS("Grass"),
    ELECTRIC("Electric"),
    NORMAL("Normal");

    private String label;
    Types(String label) {
        this.label = label;
    }
    public String label() {
        return this.label;
    }
}
