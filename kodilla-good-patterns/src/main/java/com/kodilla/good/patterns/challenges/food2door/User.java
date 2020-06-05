package com.kodilla.good.patterns.challenges.food2door;

public class User {
    private String name;
    private String surname;
    private String userEmail;
    private String deliverAdress;

    public User(String name, String surname, String userEmail, String deliverAdress) {
        this.name = name;
        this.surname = surname;
        this.userEmail = userEmail;
        this.deliverAdress = deliverAdress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getDeliverAdress() {
        return deliverAdress;
    }
}
