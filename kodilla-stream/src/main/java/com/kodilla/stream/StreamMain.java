package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<String, ForumUser> theResultListOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.of(2000, 04, 19)))
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements: " + theResultListOfForumUsers.size());
        theResultListOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + "; " + entry.getValue())
                .forEach(System.out::println);


    }
}
