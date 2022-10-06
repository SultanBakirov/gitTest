import service.DeliveryCompanyService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DeliveryCompanyService service = new DeliveryCompanyService();
        service.createDeliveryCompany(new ArrayList<>());
        service.getTotalFee(new ArrayList<>());
    }
}