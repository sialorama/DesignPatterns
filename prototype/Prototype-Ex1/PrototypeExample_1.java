
interface Prototype extends Cloneable {

    Prototype clone();
}

class ConcretePrototype implements Prototype {

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Implémentation de la méthode clone
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

// Exemple d'utilisation du pattern Prototype
public class PrototypeExample_1 {

    public static void main(String[] args) {
        // Création d'un prototype initial
        ConcretePrototype prototype1 = new ConcretePrototype("Prototype 1");
        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();
        System.out.println("Before modification:");
        System.out.println("Prototype 1 name: " + prototype1.getName());
        System.out.println("Prototype 2 name: " + prototype2.getName());

        // Modification du nom du prototype cloné
        prototype2.setName("Prototype 2");
        // // Affichage des informations après modification
        System.out.println("After modification:");
        System.out.println("Prototype 1 name: " + prototype1.getName());
        System.out.println("Prototype 2 name: " + prototype2.getName());
    }
}
