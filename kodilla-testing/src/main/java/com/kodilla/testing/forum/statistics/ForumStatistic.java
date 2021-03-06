package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

public class ForumStatistic {


    private double forumUsers;
    private double forumPosts;
    private double forumComments;
    private double averageNumberOfPosts;
    private double averageNumberOfComments;
    private double averageNumberOfCommentsPerPost;

    public ForumStatistic() {
    }

    public void calculateAdvStatistics(Statistics statistics) {
        forumUsers = statistics.usersNames().size();
        forumPosts = statistics.postsCount();
        forumComments = statistics.commentsCount();

         if(forumUsers == 0) {
             averageNumberOfPosts = 0;
             averageNumberOfComments = 0;
             if (forumPosts == 0 ||forumComments == 0) {
                 averageNumberOfCommentsPerPost = 0;
             }else{
                 averageNumberOfCommentsPerPost = forumComments / forumPosts;
             }

         }else{

             if (forumPosts == 0 ||forumComments == 0) {
                 averageNumberOfCommentsPerPost = 0;
             }
             else{
                 averageNumberOfCommentsPerPost = forumComments / forumPosts;

             }
             averageNumberOfPosts = forumPosts / forumUsers;
             averageNumberOfComments = forumComments / forumUsers;

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
