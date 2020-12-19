/**
 * Class that extends Location
 * and objects represent location type: corridors
 */
public class Corridor extends Location {

    /**
     * corridor size argument
     */
    public double sizeCorridor;
    /**
     * coordinate x1 of cave(left one)
     */
    protected double x1 = 0;
    /**
     * coordinate x2 of cave(right one)
     */
    protected double x2;

    /**
     * Constructor that creates objects of corridors
     *
     * @param w parameter is the width of location
     * @param h parameter is the height of location
     */
    public Corridor(double w, double h) {
        super(w, h);
    }

    @Override
    public void setSize(double s) {
        this.sizeCorridor = s;
    }

    @Override
    public double getSize() {
        return sizeCorridor;
    }

    /**
     * method that set right coordinate of corridor(left is 0)
     */
    public void setX() {
        this.x2 = this.x1 + this.sizeCorridor;
    }

    /**
     * method that get first coordinate of corridor
     *
     * @return double first coordinate of corridor
     */
    public double getX1() {
        return x1;
    }

    /**
     * method that get second coordinate of corridor
     *
     * @return double second coordinate of corridor
     */
    public double getX2() {
        return x2;
    }

    /**
     * method that get width of corridor
     *
     * @return double width of corridor
     */
    public double getWidth() { //получаем высоту
        return w;
    }

    /**
     * method that get height of corridor
     *
     * @return double height of corridor
     */
    public double getHeight() { //получаем ширину
        return h;
    }

    @Override
    public void describe() {
        System.out.printf("%s%.2f%s%.2f", "Width of corridor: ", getWidth(), " Height of corridor: ", getHeight());
        System.out.println("\n");
    }

    /**
     * non-static inner class that creates objects armchair
     */
    public class Armchair {
        /**
         * armchair style argument
         */
        private String style;
        /**
         * armchair coordinate argument
         */
        private double x;

        /**
         * Constructor that creates objects of armchairs
         *
         * @param style parameter is the style of armchair
         */
        public Armchair(String style) {
            this.style = style;
        }

        /**
         * method that get coordinate of armchair
         *
         * @return double coordinate
         * @throws ArmchairException
         */
        public double getArmchair() throws ArmchairException { //добавить ошибку
            x = (Math.random() + 1) * 4;
            if ((x <= Corridor.this.x2) && (x >= Corridor.this.x1)) {
                System.out.println("Armchair is in the corridor.");
            } else throw new ArmchairException();
            return x;
        }

        /**
         * method that get style of armchair
         *
         * @return String style
         */
        public String getStyle() {
            return style;
        }

        @Override
        public String toString() {
            System.out.println("Information about armchair: ");
            String result = String.format("%.2f", x);
            return "Style: " + getStyle() + ' ' + "Coordinat x: " + result + '\n';


        }


    }

}