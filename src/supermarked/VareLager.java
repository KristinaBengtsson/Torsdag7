package supermarked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Variabler
public class VareLager {
    ArrayList<Vare> alleVarer;
    HashMap<String, Vare> tilbudsVarer;

    //Constructor
    public VareLager(){
        alleVarer = new ArrayList<>();
        tilbudsVarer = new HashMap<>();

    //Kald metoder
        loadVarer("varer.csv");
        loadTilbud("tilbud.csv");
    }
//Metoder til indlæsning - disse skal Åbne CSV filerne, læse linjerne og oprette er vare objekt for hver linje
    private void loadVarer(String filnavn){
        System.out.println("Åbner fil: " + filnavn);//test kode
        //scanner
        File file = new File("data/" + filnavn);
        try {
            Scanner scanner = new Scanner(new File("src/data/" + filnavn)); //åbner filen og gør den klar til at blive læst
            System.out.println("Åbnede filen!"); //test kode
            if (scanner.hasNextLine()) {//test kode
                ;//Læs første linje
                String line = scanner.nextLine();//test kode
                System.out.println("Første linje i filen: ");//test kode
                System.out.println(line); //test kode - Print første linje
            }

            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(" loadVarer test slut"); //test kode
    }
    private void loadTilbud(String filnavn) {}
}

