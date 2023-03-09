package com.example;

public class Child implements NewInterface{
    static int totalAmount = 0;

    @Override
    public String some() {
        totalAmount ++;
        return "Метод вызван";
    }
}
