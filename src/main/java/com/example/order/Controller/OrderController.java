package com.example.order.Controller;

import com.example.order.Entity.Order;
import com.example.order.Service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Value("${welcome}")
    String AA;

    @PostMapping
    public Order saveDeparment(@RequestBody Order order){
        log.info("inside saveDeparment method if Department controller!");
        return orderService.saveKhoa(order);
    }

    @GetMapping("/{id}")
    public Order findOrderById(@PathVariable("id") Long oderId){
        log.info("inside findDeparmentById method if Department controller!");
        return orderService.findOrderById(oderId);
    }

    @GetMapping
    public String helloWorld(){
        return AA;
    }
}
