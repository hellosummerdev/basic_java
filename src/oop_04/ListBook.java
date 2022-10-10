package oop_04;

import java.util.ArrayList;
import java.util.List;

public class ListBook {
    public static void main(String[] args) {
        Book javaBook = new Book("java","requires data type");
        Book pythonBook = new Book("python","doesn't require data type");

        List<Book> bookList = new ArrayList<>();
        bookList.add(javaBook);
        bookList.add(pythonBook);

        for (Book book : bookList){
            System.out.println(book);
            System.out.println("title : " + book.getTitle());
            System.out.println("content : " + book.getContent());
            System.out.println();
        }
    }
}
