import java.io.File;
import java.util.*;

public class PokemonTest {
    public static List<String> readFile(String fileLocation) {
        List<String> pokedexEntries = new ArrayList<>();
        try {
            File file = new File(fileLocation);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                pokedexEntries.add(fileReader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Ruh roh Shaggy");
        }
        return pokedexEntries;
    }

    public static void main(String[] args) {
        String kantoDexLocation = "src/Pokedexes/Kanto Dex.txt";
        String johtoDexLocation = "src/Pokedexes/Johto Dex.txt";
        String hoennDexLocation = "src/Pokedexes/Hoenn Dex.txt";

        List<String> nationalDex = new LinkedList<>();

        List<String> regionalDex = readFile(kantoDexLocation);
        nationalDex.addAll(regionalDex);
        nationalDex.addAll(readFile(johtoDexLocation));
        nationalDex.addAll(readFile(hoennDexLocation));
    }
}
