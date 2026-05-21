package com.learnspringboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        var orderService = context.getBean(OrderService.class);
//        var orderService = new OrderService(new PaypalPaymentService());
//        orderService.setPaymentService(new PaypalPaymentService());

        orderService.placeOrder();
//        SpringApplication.run(DemoApplication.class, args);
    }

}
