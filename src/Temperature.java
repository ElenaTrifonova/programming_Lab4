/**
 * Class Temperature
 */
public class Temperature {
    /**
     * temperature degrees
     */
    public int degree = 15;

    /**
     * method that set degrees
     *
     * @param d points of degrees
     */

    public void setDegree(int d) {
        this.degree = d;
    }

    /**
     * method that get degree
     *
     * @return int degrees
     */
    public int getDegree() {
        return degree;
    }

    /**
     * method that change temperature because of time
     *
     * @param r time
     * @return int degree
     */

    public int increaseDegree(long r) {
        if (r < 240) degree += 1;
        else if ((r >= 240) && (r <= 260)) degree += 3;
        else degree += 2;
        System.out.printf("%s%d", "Temperature of air: ", degree);
        System.out.println("\n");
        return degree;
    }

}