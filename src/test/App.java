package test;

import Model.Student;
import Model.Team;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {

        // Two teams (team 1 og team 2). 6 students, 3 students on each team.


        Team team1 = new Team("24T", "1");
        Team team2 = new Team("24S", "2");

        int[] GradesStudent01 = {4, 12, 10};
        int[] GradesStudent02 = {7, 7, 10};
        int[] GradesStudent03 = {10, 7, 10};
        int[] GradesStudent04 = {2, 2, 4};
        int[] GradesStudent05 = {10, 4, 10};
        int[] GradesStudent06 = {7, 7, 10};

        Student student01 = new Student("Simon", true, GradesStudent01);
        Student student02 = new Student("Tobias", true, GradesStudent02);
        Student student03 = new Student("Tue", true, GradesStudent03);
        Student student04 = new Student("Jim", false, GradesStudent04);
        Student student05 = new Student("Tim", true, GradesStudent05);
        Student student06 = new Student("Richard", true, GradesStudent06);

        team1.addStudent(student01);
        team1.addStudent(student02);
        team1.addStudent(student03);
        team2.addStudent(student04);
        team2.addStudent(student05);
        team2.addStudent(student06);

        System.out.println(team1.getStudents());
        System.out.println(team2.getStudents());
        System.out.println(Arrays.toString(team2.getActiveStudents()).replace('[', ' ').replace('[', ' '));
        System.out.println(student01.getName() + "s highest grade is " + student01.highestGrade());
        System.out.println(student02.getName() + "' highest grade is " + student02.highestGrade());
        System.out.printf("%.2f\n", student01.averageGrade());
        System.out.println(team1.averageGradeOfAll());
        System.out.println(team2.averageGradeOfAll());
        team1.highScoreStudents(5.3);
        System.out.println(Arrays.toString(team1.highScoreStudents(8.5)));


    }

}
