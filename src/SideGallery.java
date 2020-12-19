/**
 * Class that extends Location
 * and objects represent location type: side galleries
 */
public class SideGallery extends Location {
    /**
     * size of side gallery
     */
    public double sizeSideGallery;
    /**
     * counter of side galleries
     */
    static int countGallery = 0;
    /**
     * type of side gallery(brilliant/stone)
     */
    public String type;
    /**
     * coordinate x1 of side gallery(left one)
     */
    protected double x1;
    /**
     * coordinate x1 of side gallery(right one)
     */
    protected double x2;
    /**
     * coordinate y
     */
    protected double y;

    /**
     * Constructor that creates objects of side gallery
     *
     * @param w parameter is the width of side gallery
     * @param h parameter is the height of side gallery
     */
    public SideGallery(double w, double h) {
        super(w, h);
    }

    /**
     * method that hets type of side gallery
     *
     * @return String type
     */


    public String getType() {
        return type;
    }

    @Override
    public void setSize(double s) {
        this.sizeSideGallery = s;
    }

    @Override
    public double getSize() {
        return sizeSideGallery;
    }

    /**
     * method that sets coordinates of side gallery
     *
     * @param x1 left x coordinate
     * @param y  coordinate y
     */


    public void setXY(double x1, double y) {
        this.x1 = x1;
        this.y = y;
        this.x2 = x1 + this.sizeSideGallery;
    }

    /**
     * method that get left coordinate of side gallery
     *
     * @return double x1
     */


    public double getX1() {
        return x1;
    }

    /**
     * method that get right coordinate of side gallery
     *
     * @return double x2
     */
    public double getX2() {
        return x2;
    }

    @Override
    public void describe() {
        System.out.printf("%s%.2f%s%.2f", "Width of side gallery: ", getWidth(), " Height of side gallery: ", getHeight());
        System.out.println("\n");
    }

    /**
     * method that get width of side gallery
     *
     * @return double width of side gallery
     */
    public double getWidth() { //получаем высоту
        return w;
    }

    /**
     * method that get height of side gallery
     *
     * @return double height of side gallery
     */
    public double getHeight() { //получаем ширину
        return h;
    }

    /**
     * non-static inner class
     */
    public class Rezba {
        /**
         * what is rezba about
         */
        private String content;
        /**
         * age of rezba
         */
        private int age;
        /**
         * points of beauty
         */
        private double points = 10;

        /**
         * Constructor Rezba
         *
         * @param content first parameter
         * @param age     second parameter
         */

        public Rezba(String content, int age) {
            this.age = age;
            this.content = content;
        }

        /**
         * method that changes points of beauty
         *
         * @return double points
         */


        public double pointsSkill() {
            if (SideGallery.this.countGallery == 1) {

                points = 10;
                System.out.printf("%s%d", "Rezba is so fascinating! Points of master's skill: ", points);
                System.out.println('\n');

            } else if ((SideGallery.this.countGallery > 1) && (SideGallery.this.countGallery < 4)) {
                points -= 0.5;
                System.out.printf("%s%d", "Rezba is good. Points of master's skill: ", points);
                System.out.println('\n');
            } else {
                points -= 1;
                System.out.printf("%s%.2f", "Rezba has degraded, they are much less beautiful. Points of master's skill: ", points);
                System.out.println('\n');

            }

            if (points < 0) points = 0;
            return points;
        }

        /**
         * method that gets content of rezba
         *
         * @return String content
         */


        public String getContent() {
            return content;
        }

        /**
         * method that gets age of rezba
         *
         * @return int age
         */


        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            System.out.println("Information about rezba: ");
            return "Content(what is rezba about): " + getContent() + ' ' + "Age: " + getAge() + '\n';
        }


    }

}