public class Item {
    
    private String name;
    private String type;
    private String description;
    private int intEffect;
    private double doubleEffect;

    public Item(String name, String type, String description, int intEffect, double doubleEffect) {

        this.name = name;
        this.type = type;

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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIntEffect() {
        return this.intEffect;
    }

    public void setIntEffect(int intEffect) {
        this.intEffect = intEffect;
    }

    public double getDoubleEffect() {
        return this.doubleEffect;
    }

    public void setDoubleEffect(double doubleEffect) {
        this.doubleEffect = doubleEffect;
    }

}
