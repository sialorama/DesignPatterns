
// Classe de démonstration
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // 1er affichage de l'image, charge et affiche
        System.out.println("1er affichage de photo1:");
        image1.display();

        // 2e affichage, affiche sans rechargement
        System.out.println("\n2nd affichage de photo1:");
        image1.display();

        // Affichage de la 2e image
        System.out.println("\nAffichage de photo2:");
        image2.display();
    }
}