import java.util.ArrayList;
import java.util.Scanner;

class Liste {

    private ArrayList<String> list = new ArrayList<>();

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String BOLD = "\u001B[1m";
    public static void main(String[] args) {
        Liste main = new Liste(); 
        main.main();
    }

    private void main() {
        Scanner scanner = new Scanner(System.in); 
        boolean quit = false; 
        do {
            System.out.println(BOLD + "Einkaufsliste: " + RESET);
            System.out.println("Schreibe 'add', 'delete' oder 'quit'");
            printListe();
            System.out.println();

            String option = scanner.nextLine(); 
            if(option.equals("add")) {
                System.out.println(BOLD + "Füge einen Artikel hinzu: " + RESET);
                addToList();
            }
            else if(option.equals("delete")) {
                System.out.println(BOLD +"Welcher Artikel soll gelöscht werden? " + RESET);
                deleteOnList();
            }
            else if(option.equals("quit")) {
                break; 
            }
            else {
                System.out.println(RED + "Fehler!" + RESET); 
            }
        } while (!false); 
    }

    private void addToList() {
        Scanner scanner = new Scanner(System.in); 
        String toAdd = scanner.nextLine(); 
        list.add(toAdd);
    }

    private void deleteOnList() {
        Scanner scanner = new Scanner(System.in); 
        String toDelete = scanner.nextLine(); 
        list.remove(toDelete); 
    }

    private void printListe() {
        for (String element : list) {
            System.out.println(GREEN + element+ RESET);
        }
    }
}
