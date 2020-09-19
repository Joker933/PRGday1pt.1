import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Santa {

    public static void main(String[] args) throws IOException {

        BufferedReader objReader = null;
        try {
         String aktualniRadek;
         int vysledek = 0;
      
         objReader = new BufferedReader(new FileReader("cisla.txt"));
      
         while ((aktualniRadek = objReader.readLine()) != null) {
            int cislo = Integer.parseInt(aktualniRadek.trim());
            cislo = (int)Math.floor((double)cislo / 3.0);
            cislo -= 2;
            vysledek += cislo;
         }
         System.out.println(vysledek);

        } catch (IOException e) {
      
         e.printStackTrace();
      
        }
    }
}