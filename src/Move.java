/**
 * Interface of moving
 */
public interface Move {
    /**
     * method that set step in the tunnel
     * and change coordinate of person
     *
     * @param tunnel location
     */
    void step(Tunnel tunnel);

    /**
     * method that set step in other locations
     * and change coordinate of person
     */
    void stepAnother();
}