package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements CourseObservable{
    private final List<CourseObserver> observers;
    private final List<String> messages;
    private final String studentName;

    public StudentTasks(String studentName) {
        this.studentName = studentName;
        observers = new ArrayList<>();
        messages = new ArrayList<>();
    }
    public void addTask(String task){
        getMessages().add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(CourseObserver courseObserver) {
        observers.add(courseObserver);
    }

    @Override
    public void notifyObservers() {
        for (CourseObserver courseObserver : observers) {
            courseObserver.update(this);
        }
    }

    @Override
    public void removeObserver(CourseObserver courseObserver) {
        observers.remove(courseObserver);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getStudentName() {
        return studentName;
    }
}
