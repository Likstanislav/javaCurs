package com.example;

public class BankEmployee extends Human{

    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    void Print() {
        System.out.println("Название банка: " + this.bankName +
                "\nИмя работника: " + this.getFirstName() +
                "\nФамилия работника: " + this.getLastName());
    }
}
