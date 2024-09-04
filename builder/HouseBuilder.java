public class HouseBuilder {
    public String walls;
    public String roof;
    public String windows;
    public String doors;
    public String garage;

    public HouseBuilder () {};

    public HouseBuilder setWalls(String walls) {
        this.walls = walls;
        return this;
    }

    public HouseBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }

    public HouseBuilder setWindows(String windows) {
        this.windows = windows;
        return this;
    }

    public HouseBuilder setDoors(String doors) {
        this.doors = doors;
        return this;
    }

    public HouseBuilder setGarage(String garage) {
        this.garage = garage;
        return this;
    }

    // Méthode pour construire l'objet House
    public House build() {
        return new House(this);
    }
}