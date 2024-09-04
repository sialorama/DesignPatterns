

public class Builder {
    public static void main(String[] args) {
    // Utilisation du Builder pour construire une maison
    House house = new HouseBuilder()
            .setWalls("Brick walls")
            .setRoof("Shingle roof")
            .setWindows("Double-pane windows")
            .setDoors("Wooden doors")
            .setGarage("Attached garage")
            .build();

    System.out.println(house);
}
}