package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> listOfForumUsers =new ArrayList<>();

    public Forum(){
        listOfForumUsers.add(new ForumUser("0001", "user01", 'M',2000,01,06,4));
        listOfForumUsers.add(new ForumUser("0002","user02",'F',1990,05,04,13));
        listOfForumUsers.add(new ForumUser("0003","user03",'M',1998,10,10,2));
        listOfForumUsers.add(new ForumUser("0004","user04",'F',1994,12,11,0));
        listOfForumUsers.add(new ForumUser("0005","user05",'M',1980,07,03,3));
        listOfForumUsers.add(new ForumUser("0006","user06",'M',1989,01,01,8));
        listOfForumUsers.add(new ForumUser("0007","user07",'M',1991,01,30,6));
        listOfForumUsers.add(new ForumUser("0008","user08",'F',2003,10,22,5));
        listOfForumUsers.add(new ForumUser("0009","user09",'M',1993,04,23,0));
        listOfForumUsers.add(new ForumUser("0010","user10",'M',2002,06,25,7));
    }

    public List<ForumUser> getUserList(){
       return new ArrayList<>(listOfForumUsers);
    }
}
