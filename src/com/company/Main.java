package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Coffee> coffees = new ArrayList<>();
        Coffee cof1 = new Coffee(20, 2, 10,5,1);
        Coffee cof2 = new Coffee(15, 7, 5,10,2);
        Coffee cof3 = new Coffee(10, 5, 0,5,3);
        coffees.add(cof1);
        coffees.add(cof2);
        coffees.add(cof3);
        List<Product> products =new ArrayList<>();
        Cake cake = new Cake();
        cake.setName("Тортик");
        cake.setPrice(250);
        cake.setWeight(600);
        cake.setFilling("Крем");
        products.add(cake);
        Pie pie = new Pie();
        pie.setName("Пирожок");
        pie.setPrice(50);
        pie.setWeight(100);
        pie.setFilling("яблоки");
        products.add(pie);
        products.addAll(coffees);
        Cash cash = new Cash();
        cash.doCash(coffees);
        cash.printInfo(products);
    }
}
