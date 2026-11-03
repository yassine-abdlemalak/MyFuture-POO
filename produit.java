import java.util.Scanner;

class testproduit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Saisie des informations du produit ---");

        System.out.print("Donner la reference : ");
        String ref = scanner.nextLine();

        System.out.print("Donner la designation : ");
        String des = scanner.nextLine();

        System.out.print("Donner le prix HT : ");
        double prix = scanner.nextDouble();

        System.out.print("Donner la quantite : ");
        int qte = scanner.nextInt();

        System.out.print("Donner le pourcentage de remise (%) : ");
        double remise = scanner.nextDouble();

        // Création de l'objet
        Produit p = new Produit(ref, des, prix, qte);

        System.out.println("\n--- Affichage des resultats ---");
        System.out.println("reference : " + p.getref());
        System.out.println("designation : " + p.getdes());
        System.out.println("prix HT : " + p.getprix());
        System.out.println("quantite : " + p.getqte());
        System.out.println("resultat (total HT sans remise) : " + p.calculer());
        System.out.println("resultat avaec remise  (" + remise + "%) : " + p.calculerAvecRemise(remise));

        scanner.close();
    }
}

class Produit {
    private final String ref;
    private final String des;
    private final double prix;
    private final int qte;

    Produit(String ref, String des, double prix, int qte) {
        this.ref = ref;
        this.des = des;
        this.prix = prix;
        this.qte = qte;
    }

    String getref() { return ref; }
    String getdes() { return des; }
    double getprix() { return prix; }
    int getqte() { return qte; }
    double calculer() { return prix * qte; }
    double calculerAvecRemise(double remise) {
        return calculer() * (1 - remise / 100);
    }
}