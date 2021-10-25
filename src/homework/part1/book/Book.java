package homework.part1.book;

import java.util.Arrays;

public class Book {

    private String name;
    private double price;
    private int qty = 0;
    private Author[] authors;

    public Book(String name, double price, Author authors[]) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public Book(String name, double price, int qty, Author authors[]) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        StringBuilder result = new StringBuilder();
        int lengthAuthors= this.authors.length;
        for(int i = 0;i<lengthAuthors;i++){
         result.append(authors[i].getName()).append(i != lengthAuthors -1 ? "," : "");
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}

