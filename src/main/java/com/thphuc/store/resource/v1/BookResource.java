/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thphuc.store.resource.v1;

import com.thphuc.store.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author tran Hoang Phuc
 */
@Path("v1/books")
public class BookResource {  
//    @GET // lấy theo phương thức get
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayHello() {
//        return "API đầu tiên";
//    }    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook() {
        return new Book("hihi", "Phuc", "tranHoang-Phuc", 1, 2);
    }
}
