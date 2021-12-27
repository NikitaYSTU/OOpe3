package com.company;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.function.Consumer;

public class Cash {
    private int earnedMoney = 0;
    private int maxPrice = 0;
    private int minPrice = 0;
    private int orders = 0;
    private int max;
    private int min;
    private String info = "";
    public void doCash(List<Product> list){
        list.forEach(new Consumer<Product>() {
            @Override
            public void accept(Product product) {
                if (product.getClass() == Coffee.class) {
                    int temp = product.getPrice() - ((Coffee) product).getBeanPrice() - ((Coffee) product).getWaterPrice();
                    if (maxPrice < temp) {
                        maxPrice = temp;
                        max = product.getNumber();
                    }
                    if (minPrice == 0) minPrice = temp;
                    else {
                        if (minPrice > temp) {
                            minPrice = temp;
                            min = product.getNumber();
                        }
                    }
                    earnedMoney += temp * product.getNumberOrders();
                    orders += product.getNumberOrders();
                    info += "Прибыль с еденицы кофе " + product.getNumber() + ": " + temp + ", прибыль с партии: " + (temp * product.getNumberOrders() + "\n");
                }
                if (product.getClass() == Cake.class) {
                    System.out.println(product.getName()+","+"вес: "+ product.getWeight()+ ", цена: "+ product.getPrice()+ ", начинка: "+ product.getFilling());
                }
                if (product.getClass() == Pie.class) {
                    System.out.println(product.getName()+","+"вес: "+ product.getWeight()+ ", цена: "+ product.getPrice()+ ", начинка: "+ product.getFilling());
                }
            }
        });
        float average = (float)earnedMoney/(float)orders;
        System.out.printf("Самый прибыльный кофе: %d \n", max);
        System.out.printf("Самый малоприбыльный кофе: %d \n", min);
        System.out.printf("Средняя прибыль: %.2f \n", average);
        System.out.println(info);
    }
}
