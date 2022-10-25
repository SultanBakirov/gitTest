package service;

import entities.Customer;
import entities.DeliveryCompany;
import entities.Order;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class DeliveryCompanyService {
    static Scanner scannerS = new Scanner(System.in);
    private static ArrayList<DeliveryCompany> deliveryCompanies = new ArrayList<>();

    //acceptOrder() деген методу бир deliveryCompany заказ салат, компаниенин баткызуу лимити текшерилет,
    public void acceptOrder(Order order, String companyName, String customerName) {
        Optional<DeliveryCompany> optionalDeliveryCompany = deliveryCompanies.stream().filter(x -> x.equals(companyName))
                .findFirst();

        if (order.getLoad().getHeight() * order.getLoad().getWidth() > DeliveryCompany.MAX_CAPACITY_PER_CUBE_CENTIMETRE) {
            optionalDeliveryCompany.ifPresent(x -> x.getCustomers().stream().filter(c -> c.getCustomerName()
                    .equals(customerName)).findFirst().ifPresent(v -> v.addOrder(order)));
        } else {
            System.out.println("limit exhausted!!!");
        }
    }

    //createDeliveryCompany() методу команияларды тузуп берет
    public void createDeliveryCompany(String deliveryCompanyName) {
        deliveryCompanies.add(new DeliveryCompany(deliveryCompanyName));
    }

    //getTotalFee() методу бир белгилуу кишинин бардык заказдарынын суммасын таап берет,
    public static double getTotalFee(Customer customerName) {
        double totalOrderFee = 0.0;
        for (DeliveryCompany company: deliveryCompanies) {
            for (Customer customer : company.getCustomers()) {
                if (customerName.equals(customer.getCustomerName())) {
                    totalOrderFee = customer.getOrder().stream().map(Order::getOrderFee).reduce(0.0, Double::sum);
                }
            }
        }
        return totalOrderFee;
    }

    public void createCustomer(Customer customer, String companyName) {
        deliveryCompanies.stream().filter(x -> x.getDeliveryCompanyName().equalsIgnoreCase(companyName)).findFirst().
                ifPresent(x -> x.setCustomer(customer));
    }

    //getCompanyProfit() методу компаниенин тапкан пайдасын таап берет.
    public static void getCompanyProfit(DeliveryCompany deliveryCompany) {
        double totalProfit = 0;
        for (Customer customer : deliveryCompany.getCustomer()) {
            totalProfit += getTotalFee(customer);
        }
        System.out.println("Company total profit: "+totalProfit);
    }
    public ArrayList<DeliveryCompany> getCompanies(){
        return deliveryCompanies;
    }
}
