package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DataProcessor<T extends Product> {

    private List<T> list;
    public int lowerRangeValue;
    public int upperRangeValue;
    public void setList(List<T> list){
        this.list = list;
    }

    public List<T> sorting(int lowerRange, int upperRange) throws Exception {
        if (lowerRange > upperRange){
            lowerRangeValue = lowerRange;
            upperRangeValue = upperRange;
            throw new Exception(lowerRange);
        }
        return list.stream()
                .filter(Product -> (Product.getPrice() >= lowerRange) && (Product.getPrice() <= upperRange))
                .limit(2)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }

    public Product searching(int match){
        Optional<T> elementOptional = list.stream()
                .filter(Product -> (Product.getPrice() == match))
                .findFirst();
        Product Product = null;
        if (elementOptional.isPresent()) {
            Product = elementOptional.get();
        }
        else{
            System.out.println("абонент не абонент");
        }
        return Product;
    }

}