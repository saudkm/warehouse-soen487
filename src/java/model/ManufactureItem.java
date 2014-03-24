/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Dell_SKM
 */
public abstract class ManufactureItem {
    
    private String name;
    private float buyCost;
    private float sellPrice;
    private float quantity;

    @Override
    public String toString() {
        return "ManufactureItem{" + "name=" + name + ", buyCost=" + buyCost + ", sellPrice=" + sellPrice + ", quantity=" + quantity + '}';
    }

    protected ManufactureItem(){}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBuyCost() {
        return buyCost;
    }

    public void setBuyCost(float buyCost) {
        this.buyCost = buyCost;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
