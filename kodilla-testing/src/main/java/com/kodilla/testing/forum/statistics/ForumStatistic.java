package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

public class ForumStatistic {


    private int forumUsers;
    private int forumPosts;
    private int forumComments;
    private double averageNumberOfPosts;
    private double averageNumberOfComments;
    private double averageNumberOfCommentsPerPost;

    public ForumStatistic() {
    }

    public void calculateAdvStatistics(Statistics statistics) {
        int forumUsers = statistics.usersNames().size();
        int forumPosts = statistics.postsCount();
        int forumComments = statistics.commentsCount();

        if (statistics.postsCount() == 0 || statistics.usersNames().size() == 0) {
            averageNumberOfPosts = 0;
            averageNumberOfComments = 0;
            averageNumberOfCommentsPerPost = 0;
        } else {

           averageNumberOfPosts = forumPosts / forumUsers;
           averageNumberOfComments = forumComments / forumUsers;
           averageNumberOfCommentsPerPost = forumComments / forumPosts;
        }

    }

    public double getAverageNumberOfPosts() {
        return averageNumberOfPosts;
    }

    public double getAverageNumberOfComments() {
        return averageNumberOfComments;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public String showStatistics() {
        return "statystyki: " + forumUsers;
    }


}
