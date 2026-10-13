public class CompteBancaire {
    private String numeroCompte;
    private double solde;
    private Client titulaire;
    private static int nombreComptes = 0;

    // Constructeur
    public CompteBancaire(String numeroCompte, double soldeInitial, Client titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
        this.titulaire = titulaire;
        nombreComptes++;
    }

    // Getters et Setters
    public String getNumeroCompte() { return numeroCompte; }
    public double getSolde() { return solde; }
    public Client getTitulaire() { return titulaire; }
    public void setTitulaire(Client titulaire) { this.titulaire = titulaire; }
    public static int getNombreComptes() { return nombreComptes; }

    // Méthode Dépôt
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " TND effectué sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Erreur: Montant invalide.");
        }
    }

    // Méthode Retrait
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " TND effectué sur le compte " + numeroCompte + ".");
        } else {
            System.out.println("Échec : Solde insuffisant sur le compte " + numeroCompte + " (Solde actuel: " + solde + " TND).");
        }
    }

    // Méthode Virement
    public void virement(CompteBancaire destination, double montant) {
        System.out.println("Tentative de virement de " + montant + " TND vers le compte " + destination.getNumeroCompte() + "...");
        if (montant > 0 && montant <= solde) {
            this.retirer(montant);
            destination.deposer(montant);
            System.out.println("virement réussi !");
        } else {
            System.out.println("Échec du virement : Solde insuffisant.");
        }
    }

    // Méthode Afficher Details
    public void afficherDetails() {
        System.out.print("N° : " + numeroCompte + "\nTitulaire : ");
        titulaire.afficherClient();
        System.out.println("Solde Actuel : " + solde + " TND\n");
    }
}