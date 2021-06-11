public class AdvancedClassesTest {
    public static void main(String[] args) {
        Eevee eevee = new Eevee();
        Pokemon evolved = eevee.evolve(EvolutionStones.WATER_STONE);
        evolved.sayName();
    }
}
