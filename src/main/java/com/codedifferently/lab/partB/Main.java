package com.codedifferently.lab.partB;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Coin> coins = new ArrayList<>();
        coins.add(new Coin());
        coins.add(new Coin("Quarter", .25));
        coins.add(new Coin("Dime", .10));
        coins.add(new Coin("Penny", .01));

        System.out.println("Original Coins");
        for (Coin coin: coins) {
            System.out.println(coin);
        }

        Collections.sort(coins, Comparator.comparingDouble(Coin::getValue));

        System.out.println("\nSorted Coins (by value):");
        for (Coin coin: coins) {
            System.out.println(coin);
        }

        Map<String, Integer> coinCount = new LinkedHashMap<>();
        for (Coin coin : coins) {
            coinCount.put(coin.getName(), coinCount.getOrDefault(coin.getName(),0) + 1);
        }

        System.out.println("\nYou have:");
        for (Map.Entry<String, Integer> entry : coinCount.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey() + "coin" + (entry.getValue() > 1 ? "s" : ""));
        }
        }
}
