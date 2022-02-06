package me.lenglet;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

@EntityListeners(BookListener.class)
@Entity
public class Book {

    @Id
    private int id = 22;

    private String title;

    Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
