package com.company;

public class Cake  extends Product {
    private String filling;
    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
            public void getInfo() {
        System.out.println(this.getName() + "," + "вес: " + this.getWeight() + ", цена: " + this.getPrice() + ", начинка: " + this.getFilling());
    }


}
