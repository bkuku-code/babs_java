package com.CaptainCook;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int itemQuantityPurchase;
    private double itemPrice;

    public Invoice(String partNumber, String partDescription, int itemQuantityPurchase, double itemPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantityPurchase = itemQuantityPurchase;
        this.itemPrice = itemPrice;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getItemQuantityPurchase() {
        return itemQuantityPurchase;
    }

    public void setItemQuantityPurchase(int itemQuantityPurchase) {
        this.itemQuantityPurchase = itemQuantityPurchase;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
