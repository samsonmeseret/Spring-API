package com.project.x;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController()
public class FirstController {


//    @GetMapping("/hello")
//    public String sayHello(){
//        return "Hi THere";
//    };

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

    // path variable (parameters in springboot)
    // localhost:8080/hello/some-variables
    @GetMapping("/hello/{name}")
    public String hello(
           @PathVariable("name") String customerName
    ){
        return "path variable is" + customerName;
    };

    // Request Params (parameters in springboot)
    // localhost:8080/hello?firstName=Samson&lastName=meseret
    @GetMapping("/hello")
    public String hello(
           @RequestParam("firstName") String firstName,
           @RequestParam("lastName") String lastName

    ){
        return "firstName : " + firstName + " " + lastName;
    };
}
