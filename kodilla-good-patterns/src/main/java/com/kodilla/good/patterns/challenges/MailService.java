package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
private User user;

    @Override
    public void inform(User orderRequest) {
        System.out.println("Send email to the user:" +user);

    }
}
