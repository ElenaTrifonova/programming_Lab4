/**
 * Class that extends Person
 * and objects represent people type: student
 */
public class Student extends Person {
    /**
     * points of speed
     */
    protected int speed;

    /**
     * Constructor that creates objects of student
     *
     * @param name parameter is the name of student
     * @param age  parameter is the age of student
     * @param sex  parameter is the sex of student
     * @param type parameter is the type of student
     */
    public Student(String name, int age, String sex, String type) {
        super(name, age, sex, type);
    }

    /**
     * method that sets speed of student
     *
     * @param sp speed
     */


    public void setSpeed(int sp) {
        this.speed = sp;
    }

    /**
     * method that gets speed of student
     *
     * @return int speed
     */


    public int getSpeed() {
        return speed;
    }

    /**
     * method that changes points of speed
     *
     * @return int speed
     */


    public int influenceOnSpeed() {
        if (getX() % 2 == 0) speed += 1;
        else if (getX() % 2 == 1) speed -= 1;
        System.out.printf("%s%d", "Speed of student:", speed);

        return speed;
    }

    /**
     * method that describe student in the brilliant gallery and smell there
     *
     * @param bril location
     */


    public void comeIntoBrilliant(Brilliant bril) {
        if ((pointX >= bril.x1) && (pointX <= bril.x2)) {
            System.out.printf("%s%s", getName(), " is into brilliant gallery.\n");
            Smell smell1 = new Smell();
            smell1.smellBrillGall();
            System.out.printf("%s%s", getName(), " informed the others about it.");

        }
    }

    /**
     * method that describe student in the stone gallery and smell there
     *
     * @param stone location
     */

    public void comeIntoStone(Stone stone) {
        if ((pointX >= stone.x1) && (pointX <= stone.x2)) {
            System.out.printf("%s%s", getName(), " is into stone gallery.\n");
            Smell smell2 = new Smell();
            smell2.smellStoneGall();
            System.out.printf("%s%s", getName(), " informed the others about it.");
        }
    }

    @Override
    public void saySth() {
        System.out.printf("%s%s", "-I have wanted to catch an adventure for so long!!!, - said ", getName());
        System.out.println("\n");
    }

    //шаг и координата
    @Override
    public void stepAnother() {
        step = (Math.random() + 0.5) * speed;
        System.out.printf("%s%.3f%s", "Distance of student: ", getX(), "\n");
        //ошибка нахождения вне локации
        pointX += step;
    }

}