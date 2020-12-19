/**
 * Abstract class of persons
 */
abstract public class Person implements Move, SaySth {
    /**
     * age of person
     */
    protected int age;
    /**
     * sex of person
     */
    protected String sex;
    /**
     * name of person
     */
    protected String name;
    /**
     * type of person (student/leader/professor/scientist)
     */
    protected String type;
    /**
     * coordinate of person
     */
    protected double pointX = 0;
    /**
     * step of person
     */
    protected double step = 0;

    /**
     * Constructor that creates object of person
     * (but we can't create exemplar of abstract class)
     *
     * @param name parameter is the name of person
     * @param age  parameter is the age of person
     * @param sex  parameter is the sex of person
     * @param type parameter is the type of person
     */

    public Person(String name, int age, String sex, String type) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.type = type;
    }


    @Override
    public void step(Tunnel tunnel) {
        step = (Math.random() + 0.1) * 4;
        if (pointX + step > tunnel.x2) System.out.println(getType() + " is out of the tunnel.");
        if ((pointX + step > tunnel.x1) && (pointX + step <= tunnel.x2))
            System.out.println(getType() + " is still in the tunnel.");
        pointX += step;
    }

    @Override
    public void stepAnother() {
        step = (Math.random() + 1) * 2;
        System.out.println("Something");
        pointX += step;
    }

    @Override
    public void saySth() {
        System.out.println("Что-то");
    }

    /**
     * method that get coordinate of person
     *
     * @return double coordinate
     */


    public double getX() {
        return pointX;
    }

    /**
     * method that get type of person
     *
     * @return string type
     */


    public String getType() {
        return type;
    }

    /**
     * method that set type of person
     *
     * @param type parameter is the type of person
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * method that get name of person
     *
     * @return String name
     */
    public String getName() {//получаем имя
        return name;
    }

    /**
     * method that set name of person
     *
     * @param name parameter is the name of person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method that get sex of person
     *
     * @return string sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * method that set sex of person
     *
     * @param sex parameter is the sex of person
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * method that get age of person
     *
     * @return int age
     */
    public int getAge() {
        return age;
    }

    /**
     * method that set age of person
     *
     * @param age parameter is the age of person
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override //выводим информацию об участнике
    public String toString() {
        System.out.println("Information about person: ");
        return getName() + ' ' + getAge() + ' ' + getSex() + ' ' + getType() + '\n';
    }
}