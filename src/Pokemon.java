public abstract class Pokemon {
    private String name;
    private int level;
    private Types type;

    public Pokemon() {
        this.name = "Eevee";
        this.level = 5;
        this.type = Types.NORMAL;
    }

    public Pokemon(String name, int level, Types type) {
        this.name = name;
        this.level = level;
        this.type = type;
    }

    public void sayName() {
        System.out.println(this.name);
    }

    public void levelUp() {
    }

    public Types getType() {
        return this.type;
    }

    public int getLevel() {
        return this.level;
    }

    public abstract static class Builder {
        protected String name;
        protected int level;
        protected Types type;

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

        public Builder type(Types type) {
            this.type = type;
            return this;
        }

        public abstract Pokemon build();
    }
}
