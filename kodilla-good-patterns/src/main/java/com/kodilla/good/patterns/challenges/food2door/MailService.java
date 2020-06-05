package com.kodilla.good.patterns.challenges.food2door;


public class MailService implements InformationService {


    @Override
    public void inform(User user) {
        System.out.println("Your order has been successfully completed.");
    }
}
