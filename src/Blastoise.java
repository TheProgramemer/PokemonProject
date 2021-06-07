public class Blastoise extends Pokemon {
    public Blastoise(String name, int level, String type) {
        super(name, level, type);
    }

    @Override
    public void sayName() {
        System.out.println("Blastoise");
    }

    public static class Builder extends Pokemon.Builder {
        @Override
        public Pokemon build() {
            return new Blastoise(this.name, this.level, this.type);
        }
    }

}
