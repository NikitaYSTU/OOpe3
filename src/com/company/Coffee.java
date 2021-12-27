package com.company;

public class Coffee extends Product {
    private int waterPrice;
    private int beanPrice;


    public int getBeanPrice() {
        return beanPrice;
    }

    public int getWaterPrice() {
        return waterPrice;
    }


    public Coffee (int price, int waterPrice, int beanPrice,
                   int numberOrders, int number  ){
        this.beanPrice = beanPrice;
        this.setNumberOrders(numberOrders);
        this.waterPrice = waterPrice;
        this.setNumber(number);
        this.setPrice(price);
    }
}
