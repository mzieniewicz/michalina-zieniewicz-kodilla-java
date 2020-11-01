package com.kodilla.patterns2.observer.homework;

public class Mentor implements CourseObserver {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(mentorName + " :New task to check from " + studentTasks.getStudentName() + "\n" +
                " (total: " + studentTasks.getMessages().size() + " tasks)");
        updateCount++;

    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
