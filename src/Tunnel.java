/**
 * Class that extends Location
 * and objects represent location type: tunnel
 */
public class Tunnel extends Location {
    /**
     * size of tunnel
     */
    public double sizeTunnel;
    /**
     * left coordinate of tunnel
     */
    protected double x1;
    /**
     * right coordinate of tunnel
     */
    protected double x2;

    /**
     * Constructor that creates objects of tunnel
     *
     * @param w parameter is the width of tunnel
     * @param h parameter is the height of tunnel
     */
    public Tunnel(double w, double h) {
        super(w, h);
    }

    /**
     * method that get width of tunnel
     *
     * @return double width of tunnel
     */
    public double getWidth() { //получаем высоту
        return w;
    }

    /**
     * method that get height of tunnel
     *
     * @return double height of tunnel
     */
    public double getHeight() { //получаем ширину
        return h;
    }

    @Override
    public void setSize(double s) {
        this.sizeTunnel = s;
    }

    @Override
    public double getSize() {
        return sizeTunnel;
    }

    /**
     * method that set coordinates of tunnel
     *
     * @param cave location before tunnel
     */
    public void setX(Cave cave) {
        this.x1 = cave.x2;
        this.x2 = x1 + this.sizeTunnel;
    }

    /**
     * method that get left coordinate of tunnel
     *
     * @return double x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * method that get right coordinate of tunnel
     *
     * @return double x2
     */
    public double getX2() {
        return x2;
    }

    @Override
    public void describe() {
        System.out.printf("%s%.2f%s%.2f", "Width of tunnel: ", getWidth(), " Height of tunnel: ", getHeight());
    }

    /**
     * method that change width and height of tunnel because of time
     *
     * @param r time
     */

    public void depict(long r) {
        if (r < 200) {
            System.out.printf("%s%.2f%s%.2f", "Width of tunnel: ", getWidth(), " Height of tunnel: ", getHeight());
            System.out.println("\n");
        } else if ((r >= 200) && (r <= 250)) {
            System.out.printf("%s%.2f%s%.2f", "Width of tunnel: ", getWidth(), " Height of tunnel: ", getHeight() - 0.1);
            System.out.println("\n");
            h = h - 0.1;

        } else {
            System.out.printf("%s%.2f%s%.2f", "Width of tunnel: ", getWidth() - 0.2, " Height of tunnel: ", getHeight() - 0.2);
            System.out.println("\n");
            w = w - 0.2;
            h = h - 0.2;
        }
    }

}