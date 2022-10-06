package entities;

public class Order {
    private int orderFee;
    private Load load;

    public Order() {
    }

    public Order(int orderFee) {
        this.orderFee = orderFee;
    }

    public int getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(int orderFee) {
        this.orderFee = orderFee;
    }

    public Load getOrder() {
        return load;
    }

    public void setOrder(Load load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderFee=" + orderFee +
                '}';
    }
}
