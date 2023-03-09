package com.example;

public class Client extends Human {

    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    void Print() {
        System.out.println("Название банка: " + this.bankName +
                "\nИмя клиента: " + this.getFirstName() +
                "\nФамилия клиента: " + this.getLastName());
    }
}
