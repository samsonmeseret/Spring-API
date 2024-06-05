package com.project.x;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController()
public class FirstController {


    @GetMapping("/hello")
    public String sayHello(){
        return "Hi THere";
    };

    @PostMapping("/post")
    public String post(
            @RequestBody  String message // converts every coming body(json, text...) in to string
    ){
        return "Request Accepted and message is :"+ message;
    };

// using the Order object (Order Class)
    @PostMapping("/post-order")
    public String post(
            @RequestBody  Order order // converts every coming body(json, text...) in to string
    ){
        return "Request Accepted and message is :"+ order.toString();
    };


    // using the record(new Java feature) object (Order Class)
    @PostMapping("/post-order-record")
    public String post(
            @RequestBody  OrderRecord order // converts every coming body(json, text...) in to string
    ){
        return "Request Accepted and message is :"+ order.toString();
    };
}
