package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User maria = new Millenials("Maria Smith");
        User anna = new YGeneration("Anna Rosa");
        User paul = new ZGeneration("Paul Mint");
        //When
        String mariaFavoriteSocialMedia = maria.sharePost();
        System.out.println("Maria favorite social media - " + mariaFavoriteSocialMedia);
        String annaFavoriteSocialMedia = anna.sharePost();
        System.out.println("Anna favorite social media - " + annaFavoriteSocialMedia);
        String paulFavoriteSocialMedia = paul.sharePost();
        System.out.println("Paul favorite social media - " + paulFavoriteSocialMedia);
        //Then
        Assert.assertEquals("Facebook", mariaFavoriteSocialMedia);
        Assert.assertEquals("Twitter", annaFavoriteSocialMedia);
        Assert.assertEquals("Snapchat", paulFavoriteSocialMedia);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User anna = new YGeneration("Anna Rosa");
        //Then
        String annaFavoriteSocialMedia = anna.sharePost();
        System.out.println("Anna favorite social media - " + annaFavoriteSocialMedia);
        anna.setSocialPublisher(new FacebookPublisher());
        annaFavoriteSocialMedia = anna.sharePost();
        System.out.println("Anna favorite social media - " + annaFavoriteSocialMedia);
        //Then
        Assert.assertEquals("Facebook", annaFavoriteSocialMedia);
    }
}
