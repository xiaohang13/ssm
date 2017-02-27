package com.nfmedia.carshop.entries;

/**
 * Description
 * <p>  商品类
 * Author rabbit.
 * Datetime 2017/2/28.
 */
public class Product {
    private String id;
    private String productName;
    private double productPrice;
    private int productQuentity;
    private String productImage;
    private Part part;

    public Product() {
    }

    public Product(String id, String productName, double productPrice, int productQuentity, String productImage, Part part) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuentity = productQuentity;
        this.productImage = productImage;
        this.part = part;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuentity() {
        return productQuentity;
    }

    public void setProductQuentity(int productQuentity) {
        this.productQuentity = productQuentity;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productQuentity=" + productQuentity +
                ", productImage='" + productImage + '\'' +
                ", part=" + part +
                '}';
    }
}
