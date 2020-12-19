/**
 * Class that extends person
 * and objects represent people type: scientist
 */
public class Scientist extends Person {
    /**
     * points of happiness
     */
    protected int happy = 0;

    /**
     * Constructor that creates objects of scientist
     *
     * @param name parameter is the name of scientist
     * @param age  parameter is the age of scientist
     * @param sex  parameter is the sex of scientist
     * @param type parameter is the type of scientist
     */
    public Scientist(String name, int age, String sex, String type) {
        super(name, age, sex, type);
    }

    /**
     * method that gets points of scientist happiness
     *
     * @return int points
     */


    public int getHappy() {
        return happy;
    }

    /**
     * method that changes points of happiness
     *
     * @param pen number of penguins has influence on points
     * @return int points
     */


    public int influenceOnHappy(Penguin pen) {
        if (Penguin.countPen == 0) happy -= 1;
        else if ((Penguin.countPen >= 1) && (Penguin.countPen <= 3)) happy += 10;
        else happy += 13;

        if (happy >= 15) {
            System.out.printf("%s%s", getName(), " cried from happiness.");
            System.out.println("\n");
        }

        System.out.printf("%s%d", "Points of scientist  happiness:", happy);
        return happy;
    }

    @Override
    public void saySth() {
        System.out.printf("%s%s", "-I just wanted to relax... What did I join them for??? - sighed ", getType());
        System.out.println("\n");
    }


    @Override
    public void stepAnother() {
        step = (Math.random() + 0.5) * 3;
        System.out.printf("%s%.3f%s", "Distance of scientist: ", getX(), "\n");
        //ошибка нахождения вне локации
        pointX += step;
    }

    /**
     * method of writing number of penguins in the book
     *
     * @param pen to get number of penguins
     * @return int number of penguins
     */


    public int count(Penguin pen) {

        System.out.printf("%s%s%d", getType(), " wrote the information about penguins and their amount in notebook. Amount: ", pen.countPen);
        System.out.println("\n");
        return pen.countPen;

    }

    /**
     * method of throwing lists
     */


    public void throwLists() {
        System.out.printf("%s%s", getType(), " ripped the paper and threw it on the floor.\n");
    }
}