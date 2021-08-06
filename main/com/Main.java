package com;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
      */
        //System.out.println(Arrays.toString(intArray));

        //task 1

        //Algo.allEvenNumbers(intArray);
        //Algo.allOddNumbers(intArray);

        //task 2

        //Algo.findMaxValue(intArray);
        //Algo.findMinValue(intArray);

        //task 3
        //Algo.aliquot(intArray);

        //task 4
        // Algo.allNotRepeatThreeDigit(intArray);


        // task 5
        //Algo.isPrime(intArray);

        //task 6
        //Algo.ascendingOrder(intArray);
        //Algo.descendingOrder(intArray);

        //task 7
        //Algo.palindrome(intArray);

        //not pay attention
        /*
        int num = 123;
        int count = 0;
        int temp;
        while(num!=0){
            if(num!=0){
                count++;
            }
            //num%=10;
            temp = num%10;
            num/=10;
        }
        System.out.println(count);
         */

        //task 8
        //Algo.shortestNumber(intArray);
        //Algo.longestNumber(intArray);

        //task 9
        //Algo.sortAscendingByLength(intArray);
        //Algo.sortDescendingByLength(intArray);


        //task Student
        /*
        Scanner in = new Scanner(System.in);

        Student student1 = new Student("Alex","Patison","Batkovich",1990);
        Student student2 = new Student("Peter","Englert","Systemius",1988);
        Student student3 = new Student("Alina","Pavlenko","Ihorovna",1995);
        Student student4 = new Student("Nikita","Bondarenko","Petrovich",1988);
        Student student5 = new Student("Lanya","Ernez","Guava",1994);
        Student[] data = {student1,student2,student3,student4,student5};

        for (int i=0;i<data.length;i++){
            data[i].setId(i+1);
            //System.out.println("Enter address");
            //data[i].setAddress(in.nextLine());
            //System.out.println("Enter telephone");
            //data[i].setTelephone(in.nextInt());
            System.out.println("Enter faculty");
            data[i].setFaculty(in.nextLine());
            //System.out.println("Enter course");
           // data[i].setCourse(in.nextLine());
            //System.out.println("Enter group");
            //data[i].setGroup(in.nextLine());
        }

        */

        //list of students one faculty
        //Student.listOfStudentsFaculty(data,"bio");


        // lists of students all faculties
        /*
        for (int i=0;i< data.length;i++){
            if(i>0 && data[i].getFaculty().equals(data[i-1].getFaculty())){
                    continue;
                }else{
                    Student.listOfStudentsAllFaculties(data,data[i].getFaculty());
                }
        }
        */


        //task students born after year
        //Student.studentsBornAfterYear(data,1988);


        //task list of group
        //Student.listOfStudyGroup(data,"b");



        //task Customer
         /*
        Customer customer1 = new Customer("Alex","Patison","Batkovich");
        Customer customer2 = new Customer("Peter","Englert","Systemius");
        Customer customer3 = new Customer("Alina","Pavlenko","Ihorovna");
        Customer customer4 = new Customer("Nikita","Bondarenko","Petrovich");
        Customer customer5 = new Customer("Lanya","Ernez","Guava");
        Customer[] customers = {customer1,customer2,customer3,customer4,customer5};

        for (int i=0;i< customers.length;i++){
            //customers[i].setId(i+1);
            System.out.println("Enter cardNumber");
            customers[i].setCardNumber(in.nextInt());
            //System.out.println("Enter account number");
            //customers[i].setBankAccountNumber(in.nextInt());
        }

          */

        //task alphabet
        //Customer.customersByAlphabet(customers);


        //task list CustomersInRangeCardNumber
        //Customer.listCustomersCardWithinInterval(customers,15,34);


        //tasks Book
        /*
        Book book1 = new Book("Hamlet","William Shakespeare",1603);
        Book book2 = new Book("Romeo and Juliet","William Shakespeare",1597);
        Book book3 = new Book("CBOT","Gunjan Verma",2014);
        Book book4 = new Book("Mobile Computing","Vinay Kumar Singhal",2011);
        Book book5 = new Book("House of Names","Colm Toibin",2017);
        Book[] books = {book1,book2,book3,book4,book5};

        for (int i=0;i< books.length;i++) {
            //books[i].setId(in.nextInt(i));
            //System.out.println("Enter publish house");
            //books[i].setPublishOffice(in.nextLine());
           /* System.out.println("Enter amount of pages");
            books[i].setPages(in.nextInt());
            System.out.println("Enter price");
            books[i].setPrice(in.nextInt());
            System.out.println("Enter binding type");
            books[i].setBindType(in.nextLine());

        }
        */


        //list of author books
       /*
        for (int j=0;j<books.length-1;j++){
            if(books[j].getAuthor().equals(books[j+1].getAuthor())){
                continue;
            }else{
                Book.listOfAuthorBooks(books,books[j].getAuthor());
            }
        }
        */


        //list of books published by some house
        /*
        for (int j=0;j<books.length;j++){
            if(j>0 && books[j].getPublishOffice().equals(books[j-1].getPublishOffice())){
                continue;
            }else{
                Book.listOfBooksByPublishOffice(books,books[j].getPublishOffice());
            }
        }
       */


        //list of books published after some year
        //Book.listOfBooksPublishedAfterYear(books,2011);


    }
}

