package com.xworkz.mitsogo;

public class demo {
    public static int maxToys(int[] prices, int money) {
        int n = prices.length;
        int maxToysCount = 0;
        
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            int toysCount = 0;

            for (int j = i; j < n; j++) {
                currentSum += prices[j];

                if (currentSum <= money) {
                    toysCount++;
                } else {
                    break;
                }
            }

            maxToysCount = Math.max(maxToysCount, toysCount);
        }

        return maxToysCount;
    }

    public static void main(String[] args) {
        int[] prices = {1, 4, 5, 3, 2, 1, 6};
        int money = 6;

        int result = maxToys(prices, money);
        System.out.println(result);
    }
}
