import java.util.Scanner;

class Etudiant {
    String codeE;
    String nom;
    String prenom;
    int age;
    String ville;

    public Etudiant() {
    }

    public Etudiant(String codeE, String nom, String prenom, int age, String ville) {
        this.codeE = codeE;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void saisir(Scanner sc) {
        System.out.print("Code E : ");
        codeE = sc.nextLine();
        System.out.print("Nom : ");
        nom = sc.nextLine();
        System.out.print("Prenom : ");
        prenom = sc.nextLine();
        System.out.print("Age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Ville : ");
        ville = sc.nextLine();
    }

    public void afficher() {
        System.out.println("CodeE: " + codeE + " | Nom: " + nom + " | Prenom: " + prenom + " | Age: " + age + " | Ville: " + ville);
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void afficherPlusGrandAge(Etudiant[] t) {
        int max = t[0].getAge();
        for (int i = 1; i < t.length; i++) {
            if (t[i].getAge() > max) {
                max = t[i].getAge();
            }
        }
        System.out.println("La plus grande valeur de l'age est : " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int choix;

            do {
                System.out.println("--- Menu gestion etudiant ---");
                System.out.println("1) Ajout Saisir et Affichage");
                System.out.println("2) Creation et Affichage des etudiants");
                System.out.println("3) Quitter");
                System.out.print("Donnez votre choix : ");
                choix = sc.nextInt();

                switch (choix) {
                    case 1:
                        Etudiant e = new Etudiant();
                        e.saisir(sc);
                        e.afficher();
                        e.setNom("NomModifie");
                        e.setPrenom("PrenomModifie");
                        System.out.println("Apres modification getter/setter :");
                        System.out.println("Nom : " + e.getNom() + " | Prenom : " + e.getPrenom());
                        break;
                    case 2:
                        Etudiant[] tab = new Etudiant[3];
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Saisie de l'etudiant " + (i + 1) + " :");
                            tab[i] = new Etudiant();
                            tab[i].saisir(sc);
                        }
                        System.out.println("Affichage du tableau :");
                        for (int i = 0; i < 3; i++) {
                            tab[i].afficher();
                        }
                        afficherPlusGrandAge(tab);
                        break;
                    case 3:
                        System.out.println("Au revoir !");
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }
            } while (choix != 3);
        } finally {
            sc.close();
        }
    }
}