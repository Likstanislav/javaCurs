package com.example;

public class SummaNumbers {

    public static int totalAmount = 0;
    public void summa(int a, int b) {
        int rezult = a + b;
        totalAmount += rezult;
        System.out.println("Сумма чисел равна: " + rezult);
        System.out.println("Общая сумма: " + totalAmount);
    }
}
