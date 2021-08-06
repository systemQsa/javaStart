package com;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishOffice;
    private int publishYear;
    private int pages;
    private int price;
    private String bindType;

    public Book(String name,String author,int publishYear){
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindType() {
        return bindType;
    }

    public void setBindType(String bindType) {
        this.bindType = bindType;
    }

    public String getPublishOffice() {
        return publishOffice;
    }

    public void setPublishOffice(String publishOffice) {
        this.publishOffice = publishOffice;
    }

    public String getAuthor() {
        return author;
    }

    public static void listOfAuthorBooks(Book[] books, String author){
        System.out.println("Author: " + author);
        for (Book book: books) {
            if(book.author.equals(author)){
                System.out.println(book.name);
            }
            System.out.println();
        }
    }

    public static void listOfBooksByPublishOffice(Book[] books,String publishOffice){
        System.out.println("Books of " + publishOffice + ":");
        for (Book book: books) {
            if(book.publishOffice.equals(publishOffice)){
                System.out.println(book.name);
            }
        }
        System.out.println();
    }

    public static void listOfBooksPublishedAfterYear(Book[] books,int publishYear){
        for (Book book: books) {
            Integer year = (Integer) publishYear;
            if(year >= book.publishYear){
                System.out.println(book.author + " : " + book.name);
            }
        }
    }
}

