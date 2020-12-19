/**
 * Class that extends Clothes
 * and objects represent clothes type: coat
 */
public class Coat extends Clothes {
    /**
     * Constructor that creates objects of coat
     *
     * @param material parameter is the material of clothes
     * @param size     parameter is the size of clothes
     * @param color    parameter is the color of clothes
     */
    public Coat(String material, String size, String color) {
        super(material, size, color);
    }

    /**
     * method that increase warm effect of coat
     *
     * @param temp parameter of temperature in this moment
     * @param r    parameter of time
     * @return int warm effect
     */
    public int warm(Temperature temp, long r) {
        if ((temp.increaseDegree(r) >= 15) && (temp.increaseDegree(r) <= 25)) {
            warmEffect += 1;
        } else if (temp.increaseDegree(r) > 25) warmEffect += 2;
        return warmEffect;
    }

    /**
     * method of falling coats after person threw it off
     *
     * @param temp parameter of temperature in this moment
     * @param pers is a person who threw coat
     * @param r    is time
     */
    public void fall(Temperature temp, Person pers, long r) {
        if (temp.increaseDegree(r) >= 23) {
            System.out.println(pers.getType() + " threw off jacket.");
            Sound s = new Sound();
            s.soundClothes();
        }
    }

    @Override
    public void describe() {
        System.out.println("Information about clothes: " + getMaterial() + ' ' + getSize() + ' ' + getColor() + ' ' + getWarmeffect());
    }
}