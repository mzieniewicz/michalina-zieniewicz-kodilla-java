package com.kodilla.patterns2.observer.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTaskTestSuite {
    @Test
    public void studentTaskTest() {
        //Given
        StudentTasks student1Tasks = new StudentTasks("student 1");
        StudentTasks student2Tasks = new StudentTasks("student 2");
        StudentTasks student3Tasks = new StudentTasks("student 3");
        Mentor mentor1 = new Mentor("mentor 1");
        Mentor mentor2 = new Mentor("mentor 1");
        student1Tasks.registerObserver(mentor1);
        student2Tasks.registerObserver(mentor1);
        student2Tasks.registerObserver(mentor2);
        student3Tasks.registerObserver(mentor2);
        //When
        student1Tasks.addTask("task 1");
        student2Tasks.addTask("task 2");
        student3Tasks.addTask("task 1");
        student3Tasks.addTask("task 2");
        //Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());
    }
}
