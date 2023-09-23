/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thphuc.store.resource.v2;

import com.thphuc.store.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tran Hoang Phuc
 */
@Path("v2/books")
public class BookResource {
    private List<Book> list = new ArrayList<>();

    public BookResource() {
        list.add(new Book("1", "1", "1", 1, 2022));
        list.add(new Book("2", "2", "2", 2, 2021));
        list.add(new Book("3", "3", "3", 3, 2023));
        list.add(new Book("4", "4", "4", 4, 2020));
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAll(){
        return list;
    }
    // đưa tham số trên URL để lọc ra được cuốn sách
    // /api/v2/books
    // api/v2/books/1 : path param : tham số đưa trwucj tiếp vào đường dẫn API
    @GET
    @Path("{masach}") // url sẽ nhận mã sách là các giá trị thay đổi
    @Produces(MediaType.APPLICATION_JSON)
    public Book getOne(@PathParam("masach") String isbn) {
        for (Book book : list) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return book;
            }
        }
        return null;
    }
}
