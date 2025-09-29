import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //losuj 10 liczb do tablicy
        int[] tablicaWylosowanychLiczb = new int[10];
        Random random =new Random();
        for (int i = 0; i < tablicaWylosowanychLiczb.length; i++) {
            tablicaWylosowanychLiczb[i] = random.nextInt(100)+1; // od 1 do 101
        }

        //wypisz elementy tablicy
        System.out.println("Wylosowana tablica:");
        for (int i = 0; i < tablicaWylosowanychLiczb.length; i++) {
            System.out.print(tablicaWylosowanychLiczb[i]+", ");
        }

    }
}