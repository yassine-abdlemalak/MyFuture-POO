import java.util.Scanner;

public class appweb {

    // les champs de la class
    int Cin;
    String Nom;
    String Prenom;
    int NumCompte;
    float solde;
    static final int plafond_Retrait = 500;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    appweb client = new appweb();

    // 1. Saisie des informations de base
    System.out.print("Entrez le CIN : ");
    client.Cin = Integer.parseInt(scanner.nextLine());

    System.out.print("Entrez le Nom : ");
    client.Nom = scanner.nextLine();

    System.out.print("Entrez le Prénom : ");
    client.Prenom = scanner.nextLine();

    System.out.print("Entrez le Numéro de compte : ");
    client.NumCompte = Integer.parseInt(scanner.nextLine());

    System.out.print("Entrez le Solde : ");
    client.solde = Float.parseFloat(scanner.nextLine());

    int choix = 0;

    // 2. La boucle du menu (DO ... WHILE)
    do {
        System.out.println("\n--- MENU BANKSMART ---");
        System.out.println("1. Consulter le compte");
        System.out.println("2. Effectuer un dépôt");
        System.out.println("3. Effectuer un retrait");
        System.out.println("4. Quitter");
        
        choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                System.out.println("Client : " + client.Nom + " " + client.Prenom + " (CIN : " + client.Cin + ")");
                System.out.println("N° de Compte : " + client.NumCompte);
                System.out.println("Solde Actuel : " + client.solde + " TND");
                System.out.println("Plafond Max : " + plafond_Retrait + " TND");
        }
    } while (choix != 4);
    scanner.close();
    }
}



