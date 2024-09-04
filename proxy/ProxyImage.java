// Classe ProxyImage - le proxy
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // Chargement paresseux de l'image
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}