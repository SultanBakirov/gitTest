package entities;

import java.util.ArrayList;
import java.util.List;

public class DeliveryCompany {
    private String deliveryCompanyName;
    public static final double PRICE_PER_KILOGRAM = 10.0;
    private ArrayList<Customer> customers;
    public static final double MAX_CAPACITY_PER_CUBE_CENTIMETRE = 100.0;

    public DeliveryCompany() {
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public DeliveryCompany(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;

    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }
    public ArrayList<Customer> getCustomer() {
        return customers;
    }

    public void setCustomer(Customer customer) {
        this.customers.add(customer);
    }

    @Override
    public String toString() {
        return "DeliveryCompany{" +
                "deliveryCompanyName='" + deliveryCompanyName + '\'' +
                ", customers='" + customers + '\'' +
                ", pricePerKilogram=" + PRICE_PER_KILOGRAM +
                ", maxCapacityPerCubicCentimeter=" + MAX_CAPACITY_PER_CUBE_CENTIMETRE +
                '}';
    }
}
