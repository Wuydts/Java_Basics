public class Case {
    private String model;
    private String maufacturer;
    private String powerSuply;
    private Dimensions dimensions;

    public Case(String model, String maufacturer, String powerSuply, Dimensions dimensions) {
        this.model = model;
        this.maufacturer = maufacturer;
        this.powerSuply = powerSuply;
        this.dimensions = dimensions;
    }
    public void pressPowerButton(){
        System.out.println("Power button was pressed");
    }

    public String getModel() {
        return model;
    }

    public String getMaufacturer() {
        return maufacturer;
    }

    public String getPowerSuply() {
        return powerSuply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
