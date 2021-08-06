package com;

public class Customer {
    private int id;
    private String name;
    private  String surname;
    public String patronymic;
    private int cardNumber;
    private int bankAccountNumber;

    public Customer(String name,String surname,String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public int getId() {
        return id;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void customersByAlphabet(Customer[] customers){
        String temp;
        for (int i=0;i<customers.length;i++){
            for (int j=i+1;j<customers.length;j++){
                if(customers[i].surname.compareTo(customers[j].surname)>0){
                    temp = customers[i].surname;
                    customers[i].surname = customers[j].surname;
                    customers[j].surname = temp;
                }
            }
        }
        for (int i=0;i<customers.length;i++){
            System.out.println(customers[i].surname);
        }

    }

    public static void listCustomersCardWithinInterval(Customer[] customers,int intervalFrom,int intervalTo){
        for (Customer customer: customers) {
            Integer from = (Integer)intervalFrom;
            Integer to = (Integer)intervalTo;
            if(customer.cardNumber>=from && customer.cardNumber<=to){
                System.out.println(customer.name);
            }
        }
    }

}

