/**
 * Class that extends person
 * and objects represent people type: professor
 */
public class Professor extends Person {
    /**
     * points of emotional state
     */
    protected int emoState;

    /**
     * Constructor that creates objects of professor
     *
     * @param name parameter is the name of professor
     * @param age  parameter is the age of professor
     * @param sex  parameter is the sex of professor
     * @param type parameter is the type of professor
     */
    public Professor(String name, int age, String sex, String type) {
        super(name, age, sex, type);
    }

    @Override
    public void saySth() {
        System.out.printf("%s%s", "-I will finally see penguins in their natural habitat! - exclaimed ", getType());
        System.out.println("\n");
    }

    /**
     * method that set points of professor emotional state
     *
     * @param e parameter of emotional state
     */


    public void setEmoState(int e) {
        this.emoState = e;
    }

    /**
     * method that get points of emotional state
     *
     * @return int emotional state
     */
    public int getEmoState() {
        return emoState;
    }

    /**
     * method that change points of emotional state in tunnel
     *
     * @param tunnel location
     * @return int points
     */


    public int influenceOnState(Tunnel tunnel) {
        if (getX() <= tunnel.sizeTunnel / 2) emoState -= 1;
        else if (getX() >= tunnel.sizeTunnel / 2) emoState -= 2;

        if (emoState <= -5) {
            System.out.printf("%s%s", getName(), " couldn't stand it and started to pray.");
        }

        System.out.printf("%s%d", "Points of professor emotional state:", emoState);

        return emoState;
    }

    @Override
    public void stepAnother() {
        step = (Math.random() + 0.5) * 3;
        System.out.printf("%s%.3f%s", "Distance of professor: ", getX(), "\n");
        //ошибка нахождения вне локации
        pointX += step;
    }


}