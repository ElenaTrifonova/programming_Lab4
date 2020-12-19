/**
 * Class that extends Location
 * and objects represent location type: caves
 */
public class Cave extends Location {
    /**
     * cave size argument
     */
    public double sizeCave;
    /**
     * argument is counter of caves
     */
    static int countCave = 0;
    /**
     * coordinate x1 of cave(left one)
     */
    protected double x1;
    /**
     * coordinate x2 of cave(right one)
     */
    protected double x2;

    /** non-static block where we count the number of caves    */ {
        countCave += 1;
    }

    /**
     * Constructor that creates objects of cave
     *
     * @param w parameter is the width of cave
     * @param h parameter is the height of cave
     */
    public Cave(double w, double h) {
        super(w, h);
    }


    @Override
    public void setSize(double s) {
        this.sizeCave = s;
    }

    @Override
    public double getSize() {
        return sizeCave;
    }

    /**
     * method that set coordinates of cave that is after corridor
     *
     * @param corr parameter is object of class Corridor
     */
    public void setXcorr(Corridor corr) {
        this.x1 = corr.x2;
        this.x2 = x1 + this.sizeCave;
    }

    /**
     * method that set coordinates of cave that is after tunnel
     *
     * @param tunnel parameter is object of class Tunnel
     */
    public void setXtunn(Tunnel tunnel) {
        this.x1 = tunnel.x2;
        this.x2 = x1 + this.sizeCave;

    }

    /**
     * method that get first coordinate of cave
     *
     * @return double first coordinate of cave
     */
    public double getX1() {
        return x1;
    }

    /**
     * method that get second coordinate of cave
     *
     * @return double second coordinate of cave
     */
    public double getX2() {
        return x2;
    }

    /**
     * method that get width of cave
     *
     * @return double width of cave
     */
    public double getWidth() { //получаем ширину
        return w;
    }

    /**
     * method that get height of cave
     *
     * @return double height of cave
     */
    public double getHeight() { //получаем высоту
        return h;
    }

    @Override
    public void describe() {
        System.out.printf("%s%.2f%s%.2f", "Width of сave: ", getWidth(), " Height of cave: ", getHeight());
        System.out.println("\n");
    }

    /**
     * inner static class that creates objects barelief
     */

    public static class Barelief {
        /**
         * argument is figure of barelief
         */
        private String figure;
        /**
         * argument is age of barelief
         */
        private int age;
        /**
         * argument is points of barelief beauty
         */
        private int beauty = 10;

        /**
         * Constructor that creates objects of barelief
         *
         * @param figure first parameter
         * @param age    second parameter
         */
        public Barelief(String figure, int age) {
            this.age = age;
            this.figure = figure;
        }

        /**
         * method that changes beauty points
         *
         * @return int points of beauty
         */
        public int pointsBeauty() {
            if (countCave == 1) {

                beauty = 10;
                System.out.printf("%s%d", "Bareliefs are so amazing! Points of beauty: ", beauty);
                System.out.println('\n');


            } else if ((countCave > 1) && (countCave < 4)) {
                beauty -= 1;
                System.out.printf("%s%d", "Bareliefs are nice. Points of beauty: ", beauty);
                System.out.println('\n');
            } else {
                beauty -= 2;
                System.out.printf("%s%d", "Bareliefs have degraded, they are much less beautiful. Points of beauty: ", beauty);
                System.out.println('\n');

            }

            if (beauty < 0) {
                beauty = 0;
            }
            ;
            return beauty;
        }

        /**
         * method that get figure of barelief
         *
         * @return String figure of barelief
         */
        public String getFigure() {
            return figure;
        }

        /**
         * method that get age of barelief
         *
         * @return int age of barelief
         */
        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            System.out.println("Information about bareliefs: ");
            return "Form: " + getFigure() + ' ' + "Age: " + getAge() + '\n';
        }


    }

}