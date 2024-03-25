package HW_6_FirstClasses;

public class Product {

    public String productName;
    public String productId;
    private double productCost;
    private String productInfo;
    private boolean inStock;

    public Product (String name, String id){
        this.productName = name;
        this.productId = id;
    }

    public double getCost() {
        System.out.println("HW_6_FirstClasses.Product price: " +productCost);
        return productCost;
    }

    public void setCost(double cost) {
        if (cost > 0){
            this.productCost = cost;
        }
        else {
            System.out.println("Invalid product cost");
        }
    }

    public String getProductInfo () {
        System.out.println("HW_6_FirstClasses.Product info: " +productInfo);
        return productInfo;
    }

    public void setProductInfo (String info) {
        this.productInfo = info;
    }

    public boolean getStock () {
        System.out.println("Is product in stock?:" +inStock);
        return inStock;
    }

    public void setStock (boolean stock) {
        this.inStock = stock;
    }



}
