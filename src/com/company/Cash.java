package com.company;

import java.util.List;
import java.util.function.Consumer;

public class Cash {
    private int earnedMoney = 0;
    private int maxPrice = 0;
    private int minPrice = 0;
    private int orders = 0;
    private int max;
    private int min;
    public void doCash(List<Coffee> list){
        list.forEach(new Consumer<Coffee>() {
            @Override
            public void accept(Coffee coffee) {
                    int temp = coffee.getPrice() - ((Coffee) coffee).getBeanPrice() - ((Coffee) coffee).getWaterPrice();
                    if (maxPrice < temp) {
                        maxPrice = temp;
                        max = coffee.getNumber();
                    }
                    if (minPrice == 0) minPrice = temp;
                    else {
                        if (minPrice > temp) {
                            minPrice = temp;
                            min = coffee.getNumber();
                        }
                    }
                    earnedMoney += temp * coffee.getNumberOrders();
                    orders += coffee.getNumberOrders();

            }
        });
        float average = (float)earnedMoney/(float)orders;
        System.out.printf("Самый прибыльный кофе: %d \n", max);
        System.out.printf("Самый малоприбыльный кофе: %d \n", min);
        System.out.printf("Средняя прибыль: %.2f \n", average);

    }
    public void printInfo(List<Product> list){
        list.forEach(new Consumer<Product>() {
            @Override
            public void accept(Product product) {
                System.out.println(product.getInfo());
            }
        });
    }
}
