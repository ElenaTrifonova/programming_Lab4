/**
 * Class that extends Person
 * and objects represent people type: leader
 */
public class Leader extends Person {
    /**
     * argument is mood of leader
     */
    protected int mood;

    /**
     * Constructor that creates objects of leaders
     *
     * @param name parameter is the name of leader
     * @param age  parameter is the age of leader
     * @param sex  parameter is the sex of leader
     * @param type parameter is the type of leader
     */
    public Leader(String name, int age, String sex, String type) {
        super(name, age, sex, type);
    }

    /**
     * method that set points of leader mood
     *
     * @param m parameter is the points of mood
     */
    public void setMood(int m) {
        this.mood = m;
    }

    /**
     * method that get points of leader mood
     *
     * @return int points
     */
    public int getMood() {
        return mood;
    }

    /**
     * method of using flashlight
     *
     * @param object parameter of person location
     */
    public void light(Object object) {
        /**
         * inner local class Flashlight
         */
        class Flashlight {
            /** argument is brightness of flashlight*/
            double bright = 0;

            /**
             * method of setting brightness
             */
            public void bright() {
                bright = Math.random();
                System.out.printf("%s%s", "Leader pointed a flashlight on the ", object.getClass());
                System.out.println("\n");
                System.out.printf("%s%.2f", "Brightness of flashlight: ", bright);
                System.out.println("\n");
            }
        }

        Flashlight flashlight = new Flashlight();
        flashlight.bright();

    }

    /**
     * method that change points of leader mood
     *
     * @param temp is temperature in this moment
     * @param r    is time
     * @return int points of mood
     */
    public int influenceOnMood(Temperature temp, long r) {
        if ((temp.increaseDegree(r) >= 15) && (temp.increaseDegree(r) <= 30)) mood -= 1;
        else if (temp.increaseDegree(r) > 30) mood -= 2;
        else mood += 1;

        System.out.printf("%s%d", "Points of leader mood:", mood);
        return mood;
    }

    @Override
    public void saySth() {
        System.out.printf("%s%s", "-Go straight, we're not turning anywhere!, - said ", getName());
        System.out.println("\n");
    }

    //шаг и координата
    @Override
    public void stepAnother() {
        step = (Math.random() + 0.5) * 4.3;
        System.out.printf("%s%.3f%s", "Distance of leader: ", getX(), "\n");
        pointX += step;
    }

}