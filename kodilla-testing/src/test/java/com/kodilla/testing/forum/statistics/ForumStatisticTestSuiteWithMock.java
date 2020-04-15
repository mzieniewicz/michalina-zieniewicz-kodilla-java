package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuiteWithMock {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of test.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute tests #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsWhenEmptyListCommentCountIs0PostCountIs0() {
        //Given

        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List<String> testUserNames = new ArrayList<>();

        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(0);
        when(statisticsWithMock.postsCount()).thenReturn(0);
        //When
        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfComments(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfPosts(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenListIs100CommentCountIs0PostCountIs0() {
        //Given

        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List<String> testUserNames = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            testUserNames.add("test");
        }
        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(0);
        when(statisticsWithMock.postsCount()).thenReturn(0);
        //When
        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfComments(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfPosts(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenEmptyListCommentCountIs100PostCountIs0() {
        //Given

        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List<String> testUserNames = new ArrayList<>();

        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(100);
        when(statisticsWithMock.postsCount()).thenReturn(0);
        //When
        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfComments(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfPosts(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenEmptyListCommentCountIs0PostCountIs100() {
        //Given
        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List<String> testUserNames = new ArrayList<>();

        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(0);
        when(statisticsWithMock.postsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfComments(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfPosts(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenListIs100CommentCountIs0PostCountIs100() {
        //Given
        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List<String> testUserNames = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            testUserNames.add("test");
        }
        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(0);
        when(statisticsWithMock.postsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfComments(), 0.001);
        Assert.assertEquals(1, forumStatistic.getAverageNumberOfPosts(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenListIs100CommentCountIs100PostCountIs0() {
        //Given
        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List<String> testUserNames = new ArrayList<>();
        for (int n = 1; n <= 100; n++) {
            testUserNames.add("test");
        }
        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(100);
        when(statisticsWithMock.postsCount()).thenReturn(0);
        //When
        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(1, forumStatistic.getAverageNumberOfComments(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfPosts(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenListIsCommentCountIs100PostCountIs100() {
        //Given
        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List<String> testUserNames = new ArrayList<>();

        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(100);
        when(statisticsWithMock.postsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfComments(), 0.001);
        Assert.assertEquals(0, forumStatistic.getAverageNumberOfPosts(), 0.001);
        Assert.assertEquals(1, forumStatistic.getAverageNumberOfCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenListIs100CommentCountIs100PostCountIs100() {
        //Given
        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List<String> testUserNames = new ArrayList<>();
        for (int n = 1; n <= 100; n++) {
            testUserNames.add("test");
        }
        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(100);
        when(statisticsWithMock.postsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(1, forumStatistic.getAverageNumberOfComments(), 0.001);
        Assert.assertEquals(1, forumStatistic.getAverageNumberOfPosts(), 0.001);
        Assert.assertEquals(1, forumStatistic.getAverageNumberOfCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenListIs100CommentCountIs50PostCountIs100() {
        //Given
        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List<String> testUserNames = new ArrayList<>();
        for (int n = 1; n <= 100; n++) {
            testUserNames.add("test");
        }
        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(50);
        when(statisticsWithMock.postsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(0.5, forumStatistic.getAverageNumberOfComments(), 0.001);
        Assert.assertEquals(1, forumStatistic.getAverageNumberOfPosts(), 0.001);
        Assert.assertEquals(0.5, forumStatistic.getAverageNumberOfCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenListIs100CommentCountIs100PostCountIs50() {
        //Given
        Statistics statisticsWithMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic();

        List<String> testUserNames = new ArrayList<>();
        for (int n = 1; n <= 100; n++) {
            testUserNames.add("test");
        }
        when(statisticsWithMock.usersNames()).thenReturn(testUserNames);
        when(statisticsWithMock.commentsCount()).thenReturn(100);
        when(statisticsWithMock.postsCount()).thenReturn(50);
        //When
        forumStatistic.calculateAdvStatistics(statisticsWithMock);
        //Then
        Assert.assertEquals(1, forumStatistic.getAverageNumberOfComments(), 0.001);
        Assert.assertEquals(0.5, forumStatistic.getAverageNumberOfPosts(), 0.001);
        Assert.assertEquals(2, forumStatistic.getAverageNumberOfCommentsPerPost(), 0.001);
    }



}
