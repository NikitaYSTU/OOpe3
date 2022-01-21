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

    public String getInfo(){
        int temp = this.getPrice() - this.getBeanPrice() - this.getWaterPrice();
        return("Прибыль с еденицы кофе " + this.getNumber() + ": " + temp + ", прибыль с партии: " + (temp * this.getNumberOrders()));
    }

    public String getAnotherInfo(){
        return("Кофе " + getNumber() + ": стоимость - " + getPrice() + "\n");
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
