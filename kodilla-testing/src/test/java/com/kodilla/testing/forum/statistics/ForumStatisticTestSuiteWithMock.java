package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuiteWithMock {
    private static int testCounter =0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of test.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute tests #"+testCounter);
    }
    @Test
    public void testCalculateAdvStatisticsWhenEmptyListCommentCountIs0PostCountIs0(){
        //Given

        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List <String> testUserNames = new ArrayList<>();
        //for (int n =0; n<100; n++){
           // testUserNames.add("test "+n); }
        //When
        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(0);
        when(statisticsWithMock.postsCount()).thenReturn(0);

        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfComments(),0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfPosts(),0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPost(),0.001);
    }
    /*
    @Test
    public void testCalculateAdvStatisticsWhenListIs10CommentCountIs50PostCountIs100(){
        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List <String> testUserNames = new ArrayList<>();
        for (int n =0; n<10; n++){
         testUserNames.add("test "+n); }
        //When
        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(50);
        when(statisticsWithMock.postsCount()).thenReturn(100);
        //Then
        Assert.assertEquals(5.0, forumStatistic.getAverageNumberOfComments(),0.001);
        Assert.assertEquals(10.0, forumStatistic.getAverageNumberOfPosts(),0.001);
        Assert.assertEquals(0.5, forumStatistic.getAverageNumberOfCommentsPerPost(),0.001);
    }
*/
}
