package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        StringBuilder output = new StringBuilder();
        StringBuilder sortedList = new StringBuilder();
        StringBuilder searchedList = new StringBuilder();
        List<Product> Products = new ArrayList<>();
        List<Info> infos;


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
        Barista barista = new Barista();
        barista.setName("Алексей");
        List<Barista> baristas = new ArrayList<>();
        baristas.add(barista);
        List<Info>  ar = new ArrayList<>();
        ar.addAll(products);
        ar.add(barista);
        cash.printInfo(ar);



        infos = new ArrayList<>();
        infos.addAll(products);
        infos.addAll(baristas);


        for (Info info : infos) {
            output.append(info.getAnotherInfo());
        }

        DataProcessor<Product> ProductStream = new DataProcessor<>();
        ProductStream.setList(products);

        System.out.println("\nСортировка:");

        try {
            List<Product> sorted = new ArrayList<>(ProductStream.sorting(10, 20));
            for (Info element : sorted) {
                sortedList.append(element.getAnotherInfo());
            }
            System.out.println(sortedList);
        } catch (ProcessingException e) {
            System.out.println("Нижняя граница (" + e.getLower() + ") не может быть больше верхней ("
                    + ProductStream.upperRangeValue + ") !");
        }


        System.out.println("Поиск по стоимости ===|||'''((({{{[[[14]]]}}})))'''|||===: ");

        List<Product> matched = new ArrayList<>();
        matched.add(ProductStream.searching(14));

        for (Info element : matched) {
            if (element != null) {
                searchedList.append(element.getAnotherInfo());
            }
            else{
                System.out.println("абонент не абонент");
            }
        }

        System.out.println("\nПоиск по стоимости ===|||'''((({{{[[[15]]]}}})))'''|||===: ");

        List<Product> matching = new ArrayList<>();
        matching.add(ProductStream.searching(15));

        for (Info element : matching) {
            if (element != null) {
                searchedList.append(element.getAnotherInfo());
            }
            else{
                System.out.println("абонент не абонент");
            }
        }

        System.out.println(searchedList);
    }
}
