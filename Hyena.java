import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hyena extends Animal {

    // Create a static member variable that accumulate the number of hyenas
    public static int numofHyenas = 0;

    // Lets create a constructor
    public Hyena() {
        System.out.println("\nA new Hyena object was created.");
        numofHyenas++;
    }

    String hyenaHouse;

    public String makeNoise2() {
        return "\nHUEHUEHUE\n";
    }

    public int getNumofHyenas() {
        return numofHyenas;
    }

    // create a method that input hyena names from a file named: animalNames.txt
    public static void inputHyenaNames() {
        // open animalNames.txt
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BE218\\Desktop\\animalNames.txt"));
            String myLine;

            while ((myLine = reader.readLine()) != null) {
                String[] myArray = myLine.split(",");


            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        }
    }






