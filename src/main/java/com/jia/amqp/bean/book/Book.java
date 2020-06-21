package com.jia.amqp.bean.book;

import lombok.Data;

/**
 * Book
 *
 * @author sansan
 * @date 2020/6/21
 */
@Data
public class Book {

    private String author;
    private String name;

    public Book() {
    }

    public Book(String author, String name) {

        this.author = author;
        this.name = name;
    }
}
