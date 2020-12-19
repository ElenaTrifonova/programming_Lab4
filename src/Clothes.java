/**
*Abstract class of people clothes
 */
public abstract class Clothes {
    /**  argument is color of clothes   */
    protected String color;
    /**  argument is material of clothes   */
    protected String material;
    /** argument is size of clothes (S,M,L and etc) */
    protected String size;
    /** argument is warm effect that clothes give to person    */
    protected int warmEffect = 2;

    /**
     * Constructor that creates objects of clothes
     * (but we can't create exemplar of abstract class)
     *
     * @param material parameter is the material of clothes
     * @param size     parameter is the size of clothes
     * @param color    parameter is the color of clothes
     */
    public Clothes(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }
    /**
     * abstract method that in descendant class
     * will give us information  about clothes
     */
    abstract public void describe();
    /**
     * method that set warm effect of clothes
     */
    public void setWarmEffect(int s) { //устанавливаем тепло от одежды
        this.warmEffect = s;
    }
    /**
     * method that get warm effect of clothes
     * @return int warm effect
     */
    public int getWarmeffect() {
        return warmEffect;
    }
    /**
     * method that get material of clothes
     * @return String material
     */
    public String getMaterial() {
        return material;
    }
    /**
     * method that get size of clothes
     * @return String size
     */
    public String getSize() {
        return size;
    }
    /**
     * method that get color of clothes
     * @return String color
     */
    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Clothes cl = (Clothes) obj;
        return (material == cl.material || (material != null && material.equals(cl.getMaterial()))) && (size == cl.size || (size != null && size.equals(cl.getSize()))) && (color == cl.color || (color != null && color.equals(cl.getColor())));
    }

    @Override
    public int hashCode() {
        final int p = 31;
        int result = 1;
        result = p * result + ((material == null) ? 0 : material.hashCode());
        result = p * result + ((size == null) ? 0 : size.hashCode());
        result = p * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
}