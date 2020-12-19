/**
 * Class of maps
 */
public class Map {
    /**
     * method that creates map of location
     */
    public void showMap(Corridor corridor, Cave cave1, Tunnel tunnel, Cave cave2, Stone stone) {
        System.out.println("Map of location:\n");
        System.out.printf("%s%.1f%s%.1f%s", "Coordinates of corridor:", corridor.getX1(), " ", corridor.getX2(), "\n");
        System.out.printf("%s%.1f%s%.1f%s", "Coordinates of first cave:", cave1.getX1(), " ", cave1.getX2(), "\n");
        System.out.printf("%s%.1f%s%.1f%s", "Coordinates of tunnel:", tunnel.getX1(), " ", tunnel.getX2(), "\n");
        System.out.printf("%s%.1f%s%.1f%s", "Coordinates of second cave:", cave2.getX1(), " ", cave2.getX2(), "\n");
        System.out.printf("%s%.1f%s%.1f%s", "Coordinates of side gallery:", stone.getX1(), " ", stone.getX2(), "\n");
    }
}
