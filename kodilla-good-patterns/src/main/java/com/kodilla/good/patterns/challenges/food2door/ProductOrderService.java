package com.kodilla.good.patterns.challenges.food2door;


public class ProductOrderService {

    private InformationService informationService;
    private FoodProducent foodProducent;

    public ProductOrderService(InformationService informationService, FoodProducent foodProducent) {
        this.informationService = informationService;
        this.foodProducent = foodProducent;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = foodProducent.isAvailable(orderRequest);

        if (isOrdered) {

            foodProducent.precessOrder(orderRequest);
            informationService.inform(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);

        } else {
            return new OrderDto(orderRequest.getUser(), false);

        }
    }
}
