public class AdvancedClassesTest {
    public static void main(String[] args) {
        Pokemon.Builder builder = new Pokemon.Builder();
        Pokemon wartortle = builder.level(16)
                                   .name("Wartortle")
                                   .type(Types.WATER.label())
                                   .build();
        wartortle.sayName();
        System.out.println(wartortle.getType());
    }
}
