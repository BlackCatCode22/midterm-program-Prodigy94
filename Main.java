


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.text.ParseException;
import java.util.ArrayList;


public class Main {



    // creating the genUniqueID method()
    public static String genUniqueID(String theSpecies, int numOfSpecies){
        String prefix = "";
        int suffix = numOfSpecies + 1;

        if (theSpecies.contains("hyena")){
            prefix = "Hy";

        }

        return prefix + Integer.valueOf(suffix);



    }

    public static void main(String[] args) {
        //Lion.inputLionNames();
        //Tiger.inputTigerNames();
        //Bear.inputBearNames();
        //Hyena.inputHyenaNames();
        // String path = "C:"
        //String myFileLine="";
        // try/catch bufferReader (only things in the Main)

        System.out.println("Welcome to my Zoo warmup!");

        // How many animals do we have.
        System.out.println("\n We have " + Animal.numofAnimals + " animals!");

        // Create an Animal object.
        Animal myNewAnimal = new Animal();

        myNewAnimal.desc = "this is my description";

        System.out.println("\nthe desc of the new animal is: " +myNewAnimal.desc);

        myNewAnimal.birthSeason = "this is my birth season";

        System.out.println("\nthe birth season of this animal is: "+myNewAnimal.birthSeason);

        myNewAnimal.color = "The color of the animal";

        System.out.println("\nThe color of this animal is: " + myNewAnimal.color);

        // Create a hyena
        Hyena myHyena = new Hyena();

        Hyena myHyena02 = new Hyena();

        Hyena myHyena03 = new Hyena();

        // How many Hyenas do we have

        System.out.println("\nWe have " + Hyena.numofHyenas + " Hyenas");


        // Give the new hyena a name...
        myHyena.name = "Zig";

        System.out.println("\nMy new Hyena is named: " +myHyena.name);
        myHyena.makeNoise();

        // How many animals we have
        System.out.println("\nWe have " + Animal.numofAnimals + " animals!");



        System.out.println("\nHe makes this noise:" +myHyena.makeNoise2());

        Hyena oneMore = new Hyena();

        oneMore.setAnimalID("Hy09");

        System.out.println("\nThe ID of oneMore is " + oneMore.getAnimalID() +"\n");

        oneMore.setAnimalColor("Yellow spots");

        System.out.println("\nMy Hyena is " +oneMore.getAnimalColor() +"\n");







        //Create an Array list to hold the animal Objects!

        ArrayList<Animal> animalList = new ArrayList<>();







        // open the arrival Animals text file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BE218\\Desktop\\arrivingAnimals.txt"));
            String myLine;





            while ((myLine = reader.readLine()) !=null){
                //System.out.println(myLine);
                String[] myArray = myLine.split(",");
                //System.out.println("\n myArray[0] is " +myArray[0]);
                //System.out.println("\nmyArray[1] is" + myArray[1]);

                                 //String myStr = myArray[0];
                               // System.out.println("myStr =" +myStr);
                                //myArray = myStr.split(" ");
                                //String mySpecies = myArray[4];
                                //System.out.println("Species is " +mySpecies);
                                // System.out.println("myStr =" +myStr);


                // Create an animal object from the Animal Class

                Animal anyOldAnimal = new Animal();
                // fill the objects data fields
                anyOldAnimal.desc = myArray[0];
                anyOldAnimal.birthSeason = myArray[1];
                anyOldAnimal.color = myArray[2];
                anyOldAnimal.weight = myArray[3];
                anyOldAnimal.Origin01 = myArray[4];
                anyOldAnimal.Origin02 = myArray[5];

                // Add the newly created animal object to the array list
                animalList.add(anyOldAnimal);


            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

        // We are done with the text file
        // Output the Array List
        for (Animal animal: animalList){
            System.out.println(animal.desc);
            System.out.println(animal.birthSeason);
            System.out.println(animal.color);
            System.out.println(animal.weight);
            System.out.println(animal.Origin01);
            System.out.println(animal.Origin02);
            System.out.println("\n\n");
        }


    }
}

//Bear.inputBearNames();
// Bear.ListOut();
// String myName = Bear.popBearName();

//myName = Bear.popBearName();
//myName = Bear.popBearName();


// Tiger.inputTigerNames();
// Tiger.ListOut();
//String myName = Tiger.popTigerName();
// System.Out.println("the popped hyena name is: " +Tiger.popTigerName());