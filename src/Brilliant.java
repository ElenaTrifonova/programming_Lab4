/**
 * Class that extends Side Gallery
 * and objects represent location type: Brilliant Gallery
 */
public class Brilliant extends SideGallery {
    /**
     * Constructor that creates objects of brilliant gallery
     *
     * @param w parameter is the width of location
     * @param h parameter is the height of location
     */
    public Brilliant(double w, double h) {
        super(w, h);
    }

    @Override
    public void describe() {
        System.out.printf("%s%.2f%s%.2f", "Width of brilliant side gallery: ", getWidth(), " Height of brilliant side gallery: ", getHeight());
    }

}