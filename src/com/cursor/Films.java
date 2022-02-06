package com.cursor;

public class Films {
    private String genre;
    private String name;
    private int price;


    public Films(String genre, String name, int price) {
        this.genre = genre;
        this.name = name;
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Films{" +
                "genre='" + genre + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
