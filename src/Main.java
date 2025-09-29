import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //losuj 10 liczb do tablicy
        int[] tablicaWylosowanychLiczb = losujLiczbyDoTablicy(5);

        //wypisz elementy tablicy
        wypisz(tablicaWylosowanychLiczb);
        System.out.println();

        //losuj 30 liczb z zakresu 1,40 bez powtorzen

        ArrayList<Integer> wylosowaneLiczby = wylosujLiczbyBezPowtorzenDoListy(30);
        wypisz(wylosowaneLiczby);

        HashSet<Integer> wylosowaneLiczbyZbior = wylosujLiczbyBezPowtorzenDoZbioru(20);
        wypisz(wylosowaneLiczbyZbior);
    }

    private static HashSet<Integer>wylosujLiczbyBezPowtorzenDoZbioru(int ileLiczb){
        HashSet<Integer> liczbyWylosowane = new HashSet<>();
        //elementy w zbiorze się nie powtarzają
        //elementy są nie indeksowane, nieuporządkowane
        Random random = new Random();
        while (liczbyWylosowane.size()<ileLiczb){
            int liczba = random.nextInt(20);
            liczbyWylosowane.add(liczba);
        }
        return liczbyWylosowane;
    }

    private static ArrayList<Integer> wylosujLiczbyBezPowtorzenDoListy(int ileLiczb){
        ArrayList<Integer> liczbyWylosowane = new ArrayList<>();
        //nie musi być znany rozmiar listy,
        //może być zmieniony w trakcie działania programu
        //w każdej kolekcji tylko typy zlozone
        //typ zlozony pisany wielką literą
        Random random = new Random();
        for (int i = 0; i < ileLiczb; i++) {
            int liczba =random.nextInt(40)+1;
            while (liczbyWylosowane.contains(liczba)){
                liczba = random.nextInt(40)+1;
            }
            liczbyWylosowane.add(liczba);
        }
        return liczbyWylosowane;
    }
    private static void wypisz(int[] tablica){
        System.out.println("Wylosowana tablica:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i]+", ");
        }
    }
private static void wypisz(HashSet<Integer> zbior){
    System.out.println("Wypisane liczby ze zbioru");
    for (int liczba:zbior) {
        System.out.print(liczba+", ");
    }
    System.out.println();
}
    private static void wypisz(ArrayList<Integer> lista){
        System.out.println("Wypisywana lista:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+", ");
        }
        System.out.println();
    }

    private static int[] losujLiczbyDoTablicy(int ileLiczb){
        int[] liczbyWylosowane = new int[ileLiczb];
        Random random = new Random();
        for (int i = 0; i < liczbyWylosowane.length; i++) {
            liczbyWylosowane[i] = random.nextInt(100)+1;
        }
        return liczbyWylosowane;
    }
}