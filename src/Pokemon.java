public class Pokemon {
    private String name;
    private int level;
    private String type;

    public Pokemon() {
        this.name = "Wartortle";
        this.level = 16;
        this.type = "Water";
    }

    public Pokemon(String name, int level, String type) {
        this.name = name;
        this.level = level;
        this.type = type;
    }

    public void sayName() {
        System.out.println("Pokemon");
    }

    public void levelUp() {
    }

    public Pokemon evolve() {
        return new Pokemon();
    }

    public String getType() {
        return this.type;
    }

    public int getLevel() {
        return this.level;
    }

    public static class Builder {
        protected String name;
        protected int level;
        protected String type;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder level(int level) {
            this.level = level;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Pokemon build() {
            return new Pokemon(this.name, this.level, this.type);
        }
    }
}
