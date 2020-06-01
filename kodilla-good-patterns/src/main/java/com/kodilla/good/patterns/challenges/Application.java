package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args){

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new OrderProductService(), new OrderProductRepository());
        productOrderService.process(orderRequest);

    }
}
