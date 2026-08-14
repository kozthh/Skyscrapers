package services;

import entity.Student;

public class GradeCalculator {
    private final Student student;

    public GradeCalculator(Student student) {
        this.student = student;
    }

    public void calculateAverage() {
        if (student.getStudentGrade().isEmpty()) {
            System.out.println("Average Grade: N/A");
            return;
        }

        double sum = 0;
        for (double grade : student.getStudentGrade()) {
            sum += grade;
        }

        double average = sum / student.getStudentGrade().size();
        System.out.println("Average Grade: " + average);
    }
}
