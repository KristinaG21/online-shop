package com.onlineshop.Item;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Products {

    @Id
    @GeneratedValue
    private int id;

    @NotNull()
    private String name;

    @NotNull
    private Double price;

    private String pictureUrl;

    public Products() {
    }

    public Products(int id, String name, Double price, String pictureUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pictureUrl = pictureUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }
}
