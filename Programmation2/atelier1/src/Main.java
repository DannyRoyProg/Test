import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab = {2, 4, 5, 3, 12, 8, 26, 41};
        int fouille;

        Tableaux.trierCroissantSSS(tab);
        System.out.print("Tri croissant : ");
        for (int elem:tab){
            System.out.print(elem + " ");
        }

        System.out.println();

        Tableaux.trierDeCroissantSSS(tab);
        System.out.print("Tri décroissant : ");
        for (int elem:tab){
            System.out.print(elem + " ");
        }

        System.out.println();

        System.out.println("Max : " + Tableaux.maximum(tab));

        System.out.println("Min : " + Tableaux.minimum(tab));

        System.out.println("Moyenne : " + Tableaux.moyenne(tab));

        System.out.print("Entrez un nombre voulu : ");
        fouille = scan.nextInt();

        System.out.println("Fouille sequentiel : " + Tableaux.fouilleSeq(tab, fouille));
    }
}
