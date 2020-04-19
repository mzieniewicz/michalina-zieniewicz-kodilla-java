package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final String userID;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final String userID, final String userName, final char userSex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
