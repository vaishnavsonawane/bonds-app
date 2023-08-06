package com.db.grad.bondsapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Book")
public class Book {

    @Id
    private long bookId;
    private String bookName;

    @Id
    @Column(name = "bookId", nullable = false)
    public long getBookId() {
        return bookId;
    }
    public void setBookId(long id) {
        this.bookId = id;
    }

    @Column(name = "bookName", nullable = false)
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
