package service;

import entities.Customer;
import entities.DeliveryCompany;
import entities.Order;

import java.util.ArrayList;
import java.util.Arrays;

public class DeliveryCompanyService {
    private String deliveryCompanies;

    //acceptOrder() деген методу бир deliveryCompanyге заказ салат, компаниенин баткызуу лимити текшерилет,
    public void acceptOrder(Order order) {
        
    }

    public void createDeliveryCompany(ArrayList<DeliveryCompany> name) {
        name.add(new DeliveryCompany("Google"));
        name.add(new DeliveryCompany("Amazon"));
        name.add(new DeliveryCompany("Fast"));
        name.forEach(System.out::println);
    }

    public void getTotalFee(ArrayList<Order> orders) {
        Customer customer = new Customer("Sultan");
        orders.add(new Order(10));
        orders.add(new Order(15));
        int count = 0;
        for (Order elem: orders) {
            System.out.println(elem);
        }

    }

    //getCompanyProfit() методу компаниенин тапкан пайдасын таап берет.
    public void getCompanyProfit() {

    }
}
