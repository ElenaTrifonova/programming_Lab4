/**
 * Class Smell
 */
public class Smell {
    /**
     * method that describes smell in the brilliant gallery
     */

    public void smellBrillGall() {
        System.out.println("There is none smell in the brilliant gallery.");
    }

    /**
     * method that describes smell in the stone gallery
     */

    public void smellStoneGall() {
        System.out.println("There is an acrid smell in the stone gallery too.");
    }

    /**
     * method that describes smell in thetunnel
     *
     * @param r time
     */

    public void smellTunnel(long r) {
        if (r < 190) {
            System.out.println("A slight unpleasant smell is felt.");
            System.out.println("\n");
        } else if ((r >= 190) && (r <= 240)) {
            System.out.println("Acrid smell intensifies.");
            System.out.println("\n");
        } else {
            System.out.println("Unbearable acrid smell.");
            System.out.println("\n");
        }
    }

    /**
     * method that describes smell in location after tunnel
     *
     * @param cave    location
     * @param student person who feel
     */
    public void smellAfterTunnel(Cave cave, Student student) {
        if ((student.pointX >= cave.x1) && (student.pointX <= cave.x2)) {
            System.out.println("Student felt new smell.\n");
        } else if (student.pointX > cave.x2) {
            System.out.println("New smell bacame stronger and it's not bad.\n");
        }
    }

}