public class Item {
    
    private String name;
    private String usecase;
    private int intEffect;
    private double doubleEffect;

    public Item(String name, String usecase) {

        this.name = name;
        this.usecase = usecase;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsecase() {
        return this.usecase;
    }

    public void setUsecase(String usecase) {
        this.usecase = usecase;
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
