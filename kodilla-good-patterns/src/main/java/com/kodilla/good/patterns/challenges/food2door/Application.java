package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args){

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

       ProductOrderService productOrderServiceHS = new ProductOrderService(new MailService(),new HealthyShop());
       productOrderServiceHS.process(orderRequest);

       ProductOrderService productOrderServiceEFS = new ProductOrderService(new MailService(), new ExtraFoodShop());
       productOrderServiceEFS.process(orderRequest);

       ProductOrderService productOrderServiceGFS = new ProductOrderService(new MailService(), new GlutenFreeShop());
       productOrderServiceGFS.process(orderRequest);

    }
}
