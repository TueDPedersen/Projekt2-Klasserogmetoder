package Model;


import java.util.Arrays;
import java.util.Random;

public class Student {
    private String name;
    private Boolean active;
    private int[] grades;
    private char[] answers;


    public Student(String name, Boolean active, int[] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
        studentAnswers();


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return name + " " + active + Arrays.toString(grades).replace('[', ' ').replace(']', ' ');

    }

    public int highestGrade() {
        int highestGrade = grades[0];
        for (int grade : grades) {
            if (highestGrade < grade) {
                highestGrade = grade;
            }

        }
        return highestGrade;

    }

    public double averageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;


    }

    public char[] studentAnswers() {
        Random generator = new Random();

        answers = new char[10];
        char[] choices = {'A', 'B', 'C', 'D'};
        for (int index = 0; index < answers.length; index++) {
            int newInt = generator.nextInt(4);
            answers[index] = choices[newInt];
        }
        return answers;


    }

}


