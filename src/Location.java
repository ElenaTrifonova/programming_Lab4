/**
 * Abstract class of locations
 */
public abstract class Location {
    /**
     * width of location
     */
    protected double w;
    /**
     * height of location
     */
    protected double h;

    /**
     * Constructor that creates objects of location
     * (but we can't create exemplar of abstract class)
     *
     * @param w parameter is the width of location
     * @param h parameter is the height of location
     */
    public Location(double w, double h) {
        this.w = w;
        this.h = h;
        if ((w < 0) || (h < 0)) {
            throw new WrongContentException("Oops, try to change value of w or h.");
        }
    }

    /**
     * abstract method that will give us information
     * about width and height of location
     */
    public abstract void describe();

    /**
     * method that will set size of location
     */
    public abstract void setSize(double s);

    /**
     * method that will get size of location
     *
     * @return double size
     */
    public abstract double getSize();


}