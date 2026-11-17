public class tableau {
    public static void main(String[] args) {
        //Q1:Affichage du tableau
        double[] tableau = {10.50, 11.50, 14.0};
        System.out.println("Affichage du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
        //Q2:longeur du tableau

        System.out.println("La longueur du tableau est : ");
        System.out.println(tableau.length);

        //Q3:Creer un autre tableau de 3 reéls itroduit par l'utilisateur

        double[] tableau2 = new double[3];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Veuillez entrer 3 nombres réels :");
        for (int i = 0; i < tableau2.length; i++) {
            tableau2[i] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println("Affichage du deuxième tableau :");
        for (int i = 0; i < tableau2.length; i++) {
            System.out.println(tableau2[i]);
        }
        //Q4:Rénialiser la 2éme valeur du tableau1

        tableau[1] = 12.0;
        System.out.println("Affichage du tableau après modification :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
        //Q5:La somme des elements du deux tableaux

        double somme = tableau[0] + tableau[1];
        System.out.println("La somme des éléments du premier tableau est : " + somme);
    }
}
