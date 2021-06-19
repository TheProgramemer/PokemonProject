import java.io.File;
import java.util.Scanner;

public class PokemonTest {
    public static void readFile(String fileLocation) {
        try {
            File file = new File(fileLocation);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Ruh roh Shaggy");
        }
    }

    public static void main(String[] args) {
        String kantoDexLocation = "src/Pokedexes/Kanto Dex.txt";
        String johtoDexLocation = "src/Pokedexes/Johto Dex.txt";
        String hoennDexLocation = "src/Pokedexes/Hoenn Dex.txt";

        readFile(kantoDexLocation);

        readFile(johtoDexLocation);

        readFile(hoennDexLocation);
    }
}
