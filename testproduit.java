public class testproduit {
    private String ref;
    private String des;
    private double prix;
    private int qte;

    public testproduit(String ref, String des, double prix, int qte) {
        this.ref = ref;
        this.des = des;
        this.prix = prix;
        this.qte = qte;
    }

    public String getref() { return ref; }
    public String getdes() { return des; }
    public double getprix() { return prix; }
    public int getqte() { return qte; }

    public double calculer() {
        return this.prix * this.qte;
    }

    public double calculerAvecRemise(double tauxRemise) {
        double totalHT = calculer();
        double montantRemise = totalHT * (tauxRemise / 100);
        return totalHT - montantRemise;
    }
}