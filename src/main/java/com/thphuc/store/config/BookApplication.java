/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thphuc.store.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author tran Hoang Phuc
 */
// dùng api: localhost:9999/bookstore/api
@ApplicationPath("api")
public class BookApplication extends ResourceConfig {
    // Đây là hàm main của API
    // Khi deploy app này lên tomcat, tomcat sẽ quét qua các class của các package, 
    // thấy class nào được extends từ ResourceConfig thì sẽ hiểu rằng
    // khi gọi url có /api thì class này sẽ phụ trách

    // Mapping giữa URL / api với class này (web.xml có nhiệm vụ tương đương)
    // class chỉ đón url có /api và không xử lí data từ database và json
    // nó là đầu nối để chuyển các request sau /api  đến các class tương ứng để xử lí tài nguyên
    // được liệt kê sau /api
    // ví dụ: /api/books: get all books in the database
    // ví dụ: /api/orders: get all orders in DB
    public BookApplication() {
        packages("com.thphuc.bookstore.resource.v1"); // hàm thừa kế từ class
        // tên các package cách nhau bằng dấu phẩy để phục vụ các request
        // có url ... /api/...
        // đang xài package cha com.thphuc.bookstore.resource
        // thì 2 package con .v1 .v2 tự động bị ép theo
        
    }
}
