public class Item {
    
    private String name;
    private String type;
    private int typeInt;
    private String description;
    private double doubleEffect;

    public Item(String name, String type, int typeInt, String description, double doubleEffect) {

        this.name = name;
        this.type = type;
        this.typeInt = typeInt;
        this.description = description;
        this.doubleEffect = doubleEffect;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTypeInt() {
        return this.typeInt;
    }

    public void setTypeInt(int typeInt) {
        this.typeInt = typeInt;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDoubleEffect() {
        return this.doubleEffect;
    }

    public void setDoubleEffect(double doubleEffect) {
        this.doubleEffect = doubleEffect;
    }

}
