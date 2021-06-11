import Enums.EvolutionStones;
import Pokemon.Pokemon;
import Pokemon.Gen1.OneTwentyOne.Eevee;

public class AdvancedClassesTest {
    public static void main(String[] args) {
        Eevee eevee = new Eevee(5);
        Pokemon evolved = eevee.evolve(EvolutionStones.WATER_STONE);
        evolved.sayName();
    }
}
