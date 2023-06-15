package exercises.ch4.school;

import java.util.ArrayList;

public class Course {
    //At least three fields(made this up)
    //always have class variables as private
    //name
    private String name;
    //list of students
    private ArrayList<Student>students;
    //Number of credits
    private int worthNumberOfCredits;

    //CH 5.3 Add custom equals() and toString() methods
    // to the Course class which you started in the exercises for the previous chapter.

    //constructor for course class
    public Course(String name, int numberOfCredits) {
        this.name = name;
        this.worthNumberOfCredits = numberOfCredits;
    }

    @Override
    public String toString() {
        return this.name + "is worth" + this.worthNumberOfCredits + "number of credits.";
    }

    @Override
    public boolean equals(Object obj) {
        if (( obj instanceof Course) == false) return false;
        Course myCourseObj = (Course) obj;
        if (myCourseObj.name.equals(this.name)) return true;
        else return false; //used inline but can add brackets if want to
    }
}
