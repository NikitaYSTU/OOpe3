package com.company;

public class Pie extends Product {
    protected String filling;

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
            public String getInfo() {
        return (this.getName() + " " + "вес: " + this.getWeight() + ", цена: " + this.getPrice() + ", начинка: " + this.getFilling());
    }
}
