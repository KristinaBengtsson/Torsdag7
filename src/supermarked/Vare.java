package supermarked;

public class Vare {
    private String id;
    private String name;
    private String priceDate;
    private double price;
    private boolean isBudgetBrand;
    private double quantity;
    private String unit;
    private boolean isWeighted;
    private boolean isBio;
    private boolean isAvailable;

    //constructor
    public Vare (String id, String name, String priceDate, double price, int numberOfUnits, String unitAmount) {
        this.id = id;
        this.name = name;
        this.priceDate = priceDate;
        this.price = price;
        this.isBudgetBrand = isBudgetBrand;
        this.quantity = quantity;
        this.unit = unit;
        this.isWeighted = isWeighted;
        this.isBio = isBio;
        this.isAvailable = isAvailable;
    }

    //getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPriceChangeDate() {
        return priceDate;
    }
    public double getPrice() {
        return price;
    }
    private boolean isBudgetBrand() {
        return isBudgetBrand;
    }
    public double getQuantity() {
        return quantity;
    }
    public String getUnit(){
        return unit;
    }
    public boolean getIsWeighted(){
        return isWeighted;
    }
    public boolean getIsBio(){
        return isBio;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
}
