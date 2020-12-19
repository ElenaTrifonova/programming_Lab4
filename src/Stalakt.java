/**
 * Class of stalagmite
 */
public class Stalakt {
    /**
     * coordinate
     */
    public double x;

    /**
     * method that set coordinate by random
     */
    public void setCoord() {
        x = (Math.random() + 1) * 11;

    }

    /**
     * method that get coordinate
     *
     * @return double coordinate
     */
    public double getCoord() {
        return x;
    }

}