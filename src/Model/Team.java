package Model;

import java.util.ArrayList;

public class Team {
    private String name;
    private String room;
    ArrayList<Student> students;


    public Team(String name, String room) {
        this.name = name;
        this.room = room;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);

    }

    public Student[] getActiveStudents() {
        ArrayList<Student> tempStudents = new ArrayList<>();
        for (Student s : students) {
            if (s.getActive()) {
                tempStudents.add(s);
            }

        }
        Student[] allActiveStudents = new Student[tempStudents.size()];
        for (int index = 0; index < allActiveStudents.length; index++) {
            allActiveStudents[index] = tempStudents.get(index);
        }


        return allActiveStudents;
    }


    public void removeStudent(String name) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public double averageGradeOfAll() {
        double sum = 0;
        for (Student student : students) {
            double avgGrade = student.averageGrade();
            sum += avgGrade;
        }
        return sum / students.size();

    }

    public Student[] highScoreStudents(double minAverage) {

        ArrayList<Student> highScoreStudents = new ArrayList<>();

        for (Student HISCstudent : getActiveStudents()) {
            if (HISCstudent.averageGrade() >= minAverage) {
                highScoreStudents.add(HISCstudent);
            }
        }
        return highScoreStudents.toArray(new Student[highScoreStudents.size()]);


    }

}

