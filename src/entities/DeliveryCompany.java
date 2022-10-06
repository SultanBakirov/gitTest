package entities;

public class DeliveryCompany {
    private String deliveryCompanyName;
    public static final int PRICE_PER_KILOGRAM = 10;
    public static final int MAX_CAPACITY_PER_CUBE_CENTIMETRE = 50;

    public DeliveryCompany() {
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

    @Override
    public String toString() {
        return "DeliveryCompany{" +
                "deliveryCompanyName='" + deliveryCompanyName + '\'' +
                '}';
    }
}
