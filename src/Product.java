/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kmanv
 */
public class Product {

    private String productName;
    private String flavour;
    private String cost;   
    
    public Product() {
    }

    public Product(String productName, String flavour, String cost) {
        this.productName = productName;
        this.flavour = flavour;
        this.cost = cost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", flavour=" + flavour + ", cost=" + cost + '}';
    }
    
    
    
}
