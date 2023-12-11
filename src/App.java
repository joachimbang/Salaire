import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'employés : ");
        int nombreEmployes = scanner.nextInt();

        // Tableaux pour stocker les noms et les salaires
        String[] noms = new String[nombreEmployes];
        double[] salaires = new double[nombreEmployes];

        // Saisie des noms et salaires
        for (int i = 0; i < nombreEmployes; i++) {
            System.out.print("Entrez le nom de l'employé " + (i + 1) + " : ");
            noms[i] = scanner.next();

            System.out.print("Entrez le salaire de l'employé " + (i + 1) + " : ");
            salaires[i] = scanner.nextDouble();
        }

        // Recherche de l'employé avec le salaire le plus élevé
        int SalaireMax = indexOfMax(salaires);

        // Recherche de l'employé avec le salaire le moins élevé
        int SalaireMin = indexOfMin(salaires);

        // Affichage des résultats
        System.out.println("L'employé avec le salaire le plus élevé est : " + noms[SalaireMax]
                + " avec un salaire de " + salaires[SalaireMax]);

        System.out.println("L'employé avec le salaire le moins élevé est : " + noms[SalaireMin]
                + " avec un salaire de " + salaires[SalaireMin]);

        scanner.close();
    }

    // Fonction pour trouver l'indice du salaire le plus élevé
    private static int indexOfMax(double[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
        }
        return index;
    }

    // Fonction pour trouver l'indice du salaire le moins élevé
    private static int indexOfMin(double[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
