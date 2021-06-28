import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

        for (String entry : nationalDex) {
            System.out.println(entry);
        }

        System.out.println(nationalDex.size());

        for (int i = 1; i < 386; i++) {
            String pokemon = nationalDex.get(i - 1);
            if (pokemon.contains(String.valueOf(i))) {
                continue;
            }
            System.out.println("Missing pokemon with Dex number " + i);
            break;
        }

        if (!nationalDex.contains("359 absol")) {
            System.out.println("Yep, Absol is missing");
        }

        nationalDex.add(358, "359 absol");
        System.out.println(nationalDex.size());
    }
}
