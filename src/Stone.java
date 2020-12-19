/**
 * Class that extends Side Gallery
 * and objects represent location type: Stone Gallery
 */
public class Stone extends SideGallery {
    /**
     * Constructor that creates objects of stone gallery
     *
     * @param w parameter is the width of location
     * @param h parameter is the height of location
     */
    public Stone(double w, double h) {
        super(w, h);
    }

    @Override
    public void describe() {
        System.out.printf("%s%d%s%d", "Ширина каменной галереи: ", getWidth(), " Высота каменной галереи: ", getHeight());
    }

}