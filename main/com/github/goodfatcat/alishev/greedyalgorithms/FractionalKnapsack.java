package com.github.goodfatcat.alishev.greedyalgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    private static int capacity = 15;
    private static double totalPrice = 0;
    private static Item[] items = {new Item(8, 7),
            new Item(9, 3),
            new Item(5, 5)};

    public static void main(String[] args) {
        Arrays.sort(items, Comparator.comparingDouble(Item::getRatio));
        for (int i = items.length - 1; i >= 0; i--) {
//            System.out.println(items[i]);
//            System.out.println("capacity = " + capacity);
//            System.out.println("totalPrice = " + totalPrice);
            if (capacity > 0) {
                if (capacity - items[i].getWeight() > 0) {
                    totalPrice += items[i].getPrice();
                    capacity -= items[i].getWeight();
                } else {
                    totalPrice += items[i].getRatio() * capacity;
                    capacity = 0;
                }
            }
        }
        System.out.println("Total");
//        System.out.println(capacity);
        System.out.println(totalPrice);
    }
}

class Item {
    private int price;
    private int weight;
//    private double ratio;  // It can be replaced with method getRatio(price, weight);

    public Item(int price, int weight) {
        this.price = price;
        this.weight = weight;
//        ratio = (double) price / weight;
    }

    public double getRatio() {
        return (double) price / weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (this.weight - weight >= 0)
            this.weight = weight;
        else {
            throw new RuntimeException("Remains can't be below 0");
        }
    }

//    public double getRatio() {
//        return ratio;
//    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}
