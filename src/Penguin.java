/**
 * Class of penguins
 */
public class Penguin implements Move {
    /**
     * counter of penguins
     */
    static int countPen = 0;
    /**
     * coordinate of penguins
     */
    protected double pointPX;
    /**
     * step of penguins
     */
    protected double stepP = 0;
    /**
     * number of penguins
     */
    protected int number;
    /**
     * coordinate of penguins
     */
    protected String color;
    /**
     * sexof penguins
     */
    protected String sex;
    /**
     * age of penguins(adult or baby)
     */
    protected String age;
    /**
     * points of penguin health
     */
    protected int health;

    /** block which count number of penguins*/ {
        countPen += 1;
    }

    /**
     * Constructor that creates objects of penguins
     *
     * @param number parameter is the number of penguin
     * @param age    parameter is the age of penguin
     * @param sex    parameter is the sex of penguin
     * @param color  parameter is the color of penguin
     */
    public Penguin(int number, String age, String sex, String color) {
        this.number = number;
        this.age = age;
        this.sex = sex;
        this.color = color;

    }

    /**
     * method that set points of penguin health
     *
     * @param h parameter is the points of health
     */
    public void setHealth(int h) { //устанавливаем здоровье
        this.health = h;
    }

    /**
     * method that get points of penguin health
     *
     * @return int points
     */
    public int getHealth() {
        return health;
    }

    @Override
    public void step(Tunnel tunnel) {
        stepP = (Math.random() + 0.1) * 2;
        pointPX = tunnel.x1;
        if (pointPX + stepP > tunnel.x2) System.out.println("Penguin is not in the tunnel.");
        if ((pointPX + stepP <= tunnel.x2) && (pointPX + stepP >= tunnel.x1))
            System.out.println("Penguin is still in the tunnel.");
        pointPX += stepP;
    }

    @Override
    public void stepAnother() {
        System.out.println("sth");
    }

    /**
     * method of bumping penguin in sth
     *
     * @param st parameter gives coordinate of stalagmit for comparing
     */
    public void bump(Stalakt st) {
        if ((st.getCoord() >= pointPX - 0.2) && (st.getCoord() <= pointPX + 0.2)) {
            System.out.println("Penguin " + getNumber() + " bump into stalagmit.\n");
            health -= 1;
            Sound sound1 = new Sound();
            sound1.soundStalakt();
        } else {
            System.out.println("Penguin bump into wall.\n");
            Sound sound2 = new Sound();
            health -= 2;
            sound2.soundTunnel();
        }

        if (health <= 0) {
            health = 0;
            System.out.println("Penguin was tired and went to sleep.\n");
        } else System.out.println("Health of penguin: " + getHealth());


    }

    /**
     * method of meeting penguins with people
     */
    public void meet() {
        /** points of penguin kindness */
        double kindness;
        kindness = (Math.random() + 1) * 3;
        /**
         * local inner class Wings
         */
        class Wings {
            /**
             * method of greetings
             */
            public void greet() {
                System.out.printf("%s%.2f", "Penguin greeted people by wawing his wing and also show them a way. Level of penguin kindness: ", kindness);
                System.out.println("\n");
            }

        }

        Wings wings = new Wings();
        wings.greet();
    }

    /**
     * method that get number of penguin
     *
     * @return int number
     */
    public int getNumber() {
        return number;
    }

    /**
     * method that get age of penguin
     *
     * @return String age
     */
    public String getAge() {
        return age;
    }

    /**
     * method that get sex of penguin
     *
     * @return String sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * method that get color of penguin
     *
     * @return String color
     */
    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        System.out.println("Information about penguins: ");
        return "number" + getNumber() + ' ' + getAge() + ' ' + getSex() + ' ' + getColor() + '\n';
    }
}