/**
 * @author Danny Roy
 */
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fouille;
        String[] chaineTab = {"2", "4", "5", "3", "12", "8", "26", "41"};

        Tableaux.trierCroissantSSS(chaineTab);

        System.out.print("Tri croissant : ");
        for (String elem:chaineTab){
            System.out.print(elem + " ");
        }

        System.out.println();

        Tableaux.trierDeCroissantSSS(chaineTab);
        System.out.print("Tri décroissant : ");
        for (String elem:chaineTab){
            System.out.print(elem + " ");
        }

        System.out.println();

        System.out.println("Max : " + Tableaux.maximum(chaineTab));

        System.out.println("Min : " + Tableaux.minimum(chaineTab));

        System.out.println("Moyenne : " + Tableaux.moyenne(chaineTab));

        System.out.print("Entrez un nombre voulu : ");
        fouille = scan.next();

        System.out.println("Fouille sequentiel : " + Tableaux.fouilleSeq(Integer.parseInt(chaineTab)), Integer.parseInt(fouille)));
    }
}
