package classes;

public class Book {
    String title;
    String author;


    public Book(String title){
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void printBooks(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}
