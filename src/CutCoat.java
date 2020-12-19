/**
 * Class that extends Clothes
 * and objects represent clothes type: cut coat
 */
public class CutCoat extends Clothes {
    /**
     * Constructor that creates objects of cut coat
     *
     * @param material parameter is the material of cut coat
     * @param size     parameter is the size of cut coat
     * @param color    parameter is the color of cut coat
     */
    public CutCoat(String material, String size, String color) {
        super(material, size, color);
    }

    /**
     * method for raising coats from the ground
     *
     * @param pers parameter of person who raise
     */
    public void toRaise(Person pers) {
        System.out.println(pers.getName() + " lifted the coat, it had been cut.\n"); //поднял куртку с земли, она оказалась с прорезями.
    }

    @Override
    public void describe() {
        System.out.println("Information about clothes on the ground: " + getMaterial() + ' ' + getSize() + ' ' + getColor() + ' ' + getWarmeffect());
    }
}